package restfulwebservice;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

import com.sun.org.apache.xerces.internal.util.URI;
import com.sun.research.ws.wadl.Response;
import com.sun.security.ntlm.Client;

public class RestfulClient {

	private static final String webserviceURI = "http://localhost:8080/RestWebService_try1/rest/helloworld";
	public static void main(String args[])
	{
		ClientConfig clientconfig = new ClientConfig();
	
		javax.ws.rs.client.Client client = ClientBuilder.newClient(clientconfig);
		java.net.URI serviceURI = UriBuilder.fromUri(webserviceURI).build();
		WebTarget webTarget = client.target(serviceURI);
		
		// response
				System.out.println(webTarget.path("rest").path("helloworld").request()
						.accept(MediaType.TEXT_PLAIN).get(Response.class).toString());

				// text
				System.out.println(webTarget.path("rest").path("helloworld").request()
						.accept(MediaType.TEXT_PLAIN).get(String.class));

				// xml
				System.out.println(webTarget.path("rest").path("helloworld").request()
						.accept(MediaType.TEXT_XML).get(String.class));

				// html
				System.out.println(webTarget.path("rest").path("helloworld").request()
						.accept(MediaType.TEXT_HTML).get(String.class));
			

	
		
		
		
		
	}
	
	
	
}
