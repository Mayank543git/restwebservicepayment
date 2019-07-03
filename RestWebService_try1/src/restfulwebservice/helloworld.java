package restfulwebservice;

import java.sql.DriverManager;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mysql.jdbc.Connection;

@Path("/helloworld")

public class helloworld {
	
@GET
@Produces(MediaType.TEXT_PLAIN)

public String gettext()
{
return "Hello world in plain text";	
}
@Path("/hi")
@GET
@Produces(MediaType.TEXT_XML)
public String sayXMLHello() {
	
	return "<?xml version=\"1.0\"?>" + "<hello> Hello World RESTful Jersey in XML"
			+ "</hello>";
}
@Path("/lol")
@GET
@Produces(MediaType.TEXT_HTML)
public String sayHtmlHello() {
	return "<html> " + "<title>" + "Hello World RESTful Jersey"
			+ "</title>" + "<body><h1>" + "Hello World RESTful Jersey in HTML"
			+ "</body></h1>" + "</html> ";
}





}
