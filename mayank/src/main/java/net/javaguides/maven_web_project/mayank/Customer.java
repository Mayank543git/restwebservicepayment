package net.javaguides.maven_web_project.mayank;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="customer")

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="custID", unique=true)
	private int id;
	
	@Column(name="firstName", nullable=false)
	private String fname;
	
	@Column(name="lastName", nullable=false)
	private String lname;
	
	public int getID()
	{
		return id;
		
	}
	public void setID(int id)
	{
		this.id=id;
		
	}
	public String getfName()
	{
		
		return fname;
	}
	public void setfName(String fname)
	{
		this.fname=fname;
		
	}
	public String getlName()
	{
		
		return lname;
	}
	public void setlName(String lname)
	{
		this.lname=lname;
		
	}
}
