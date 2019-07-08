
//retrieving data from mysql and storing it in an xml file 
	
	import java.io.File;
    import java.io.FileWriter;
    import java.nio.file.FileAlreadyExistsException;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.Statement;

    import org.w3c.dom.Document;
    import org.w3c.dom.Element;

    import com.sun.org.apache.xerces.internal.dom.DocumentImpl;
    import com.sun.org.apache.xml.internal.serialize.OutputFormat;
    import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
    /* JDBC Classes*/
    /* Java IO */
    /* W3C Interfaces */
    /* Xerces DOM Classes */
    /* Xerces Serializer */


    public class sql_to_xml { 

      public static final String JDBCURL = "com.mysql.jdbc.Driver"; 
      public static final String JDBCDRIVER = "jdbc:mysql://localhost:3306/stu"; 
      public static final String SQL = "select name, address from stu"; 
      public static String OUTPUTFILE = "outputbooks.xml"; 
//replace file with Country.xml

      public static void main(String[] args) { 

        try{ 

        /** Step 1 : Making a JDBC Connection with database" **/ 
        Class.forName(JDBCURL) ;
        Connection conn = DriverManager.getConnection(JDBCDRIVER,"root",""); 

        /** Step 2 : Retrieve the employee data from database **/ 
        Statement statement = conn.createStatement(); 
        ResultSet employeeRS = statement.executeQuery(SQL); 

        /** Step 3 : Build outputbooks XML DOM **/ 
        Document xmlDoc = buildEmployeeXML(employeeRS);

        /** Step 4 : Write output to a file **/ 
        File outputFile = new File(OUTPUTFILE); 
        printDOM(xmlDoc, outputFile); 

        conn.close(); /*Connection close*/ 
        } catch(FileAlreadyExistsException f){
            System.out.println("file alread present at this location");
        }
        catch(Exception e) 
        { 
          System.out.println("Really poor exception handling " +e.toString()); 
        }
      }//Main 

      /*Build XML DOcument from database. The XML object is returned to main method where it is written to flat file.*/ 
      private static Document buildEmployeeXML(ResultSet _employeeRS) throws Exception 
      { 

      Document xmlDoc = new DocumentImpl(); 

      /* Creating the root element */ 

      Element rootElement = xmlDoc.createElement("companies"); 
      xmlDoc.appendChild(rootElement); 

      while(_employeeRS.next()) 
       { 

        Element emp = xmlDoc.createElement("employee");


      

        /* Creating elements within outputbooks  DOM*/ 
        Element empName = xmlDoc.createElement("name"); 
        Element address = xmlDoc.createElement("address"); 

        /* Populating outputbooks DOM with Data*/ 
        empName.appendChild(xmlDoc.createTextNode(_employeeRS.getString("name"))); 
        address.appendChild(xmlDoc.createTextNode(_employeeRS.getString("address"))); 

        /* Adding the empname and address elements to the employee Element*/ 
        emp.appendChild(empName); 
        emp.appendChild(address); 

        /* Appending emp to the Root Class*/ 
        rootElement.appendChild(emp); 
        System.out.println("done");
       } 
      return xmlDoc; 
      } 

      /* printDOM will write the contents of xml document passed onto it out to a file*/ 
      private static void printDOM(Document _xmlDoc, File _outputFile) throws Exception 
      { 
        OutputFormat outputFormat = new OutputFormat("XML","UTF-8",true); 
        FileWriter fileWriter = new FileWriter(_outputFile); 

        XMLSerializer xmlSerializer = new XMLSerializer(fileWriter, outputFormat); 

        xmlSerializer.asDOMSerializer(); 

        xmlSerializer.serialize(_xmlDoc.getDocumentElement()); 
      } 

     } 


