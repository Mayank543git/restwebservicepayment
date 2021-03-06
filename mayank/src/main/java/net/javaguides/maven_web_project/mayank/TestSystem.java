package net.javaguides.maven_web_project.mayank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestSystem {

	private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("mayank");
	
	public static void main(String args[])
	{
		addCustomer(3,"michael","bay");
		
		ENTITY_MANAGER_FACTORY.close();
		
	}
	
	public static void addCustomer(int id,String fname,String lname)
	{
		
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et =null;
		try
		{
		et = em.getTransaction();
		et.begin();
		Customer cust = new Customer();
		cust.setID(id);
		cust.setfName(fname);
		cust.setlName(lname);
		em.persist(cust);
		et.commit();
		}
		catch(Exception ex)
		{
			if(et!=null)
			{
				et.rollback();
			}
			ex.printStackTrace();
		}
		finally
		{
			em.close();
		}
	}
	public static void getCustomer(int id)
	{
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query="SELECT c FROM CUSTOMER c where c.id=:custID";
		TypedQuery<Customer> tq  = em.createQuery(query,Customer.class);
		tq.setParameter("custID", id);
		Customer cust=null;
		try
		{
			cust=tq.getSingleResult();
			System.out.println(cust.getfName()+" "+cust.getlName());
			
		}
			catch(NoResultException ex)
		
		{
			System.out.println(ex);	
			ex.printStackTrace();
		}
		finally
		{
			em.close();
		}
		
	}
	
	
	
}
