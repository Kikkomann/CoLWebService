package dk.dtu.ds.login;

import cleanoutloudserver.ICleanOutLoud;
import java.net.MalformedURLException;
import java.net.URL;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

@Path("login")
public class Login {
    // HTTP Get Method

    @GET
    @Path("dologin")
    // Produces JSON as response
    @Produces(MediaType.APPLICATION_JSON)
    // Query parameters are parameters: http://localhost/colrest/CoL/login/dologin?username=s150157&password=1234
    public String doLogin(@QueryParam("username") String uname, @QueryParam("password") String pwd) throws MalformedURLException, Exception {
        URL url = new URL("http://ec2-52-43-233-138.us-west-2.compute.amazonaws.com:3769/col?wsdl");
        QName qname = new QName("http://cleanoutloudserver/", "CleanOutLoudImplService");
        Service service = Service.create(url, qname);
        ICleanOutLoud col = service.getPort(ICleanOutLoud.class);

        String token = col.login(uname, pwd);

            token = Utility.constructJSON(token);
            System.out.println("\nChecking credentials = true\n");
        return token;
    }
    
//    @GET
//    // Path: http://localhost:8080/colREST/CoL/login/douser
//    @Path("douser")
//    // Produces JSON as response
//    @Produces(MediaType.APPLICATION_JSON)
//    // Query parameters are parameters: http://localhost/colREST/login/douser?username=s150157&password=1234
//    public String doUser(@QueryParam("username") String uname, @QueryParam("password") String pwd) {
//        String response = "";
//        System.out.println("\nChecking credentials\n");
//        if (checkCredentials(uname, pwd)) {
//            response = Utility.constructJSON("login", true);
//            System.out.println("\nChecking credentials = true\n");
//        } else {
//            System.out.println("\nChecking credentials = false\n");
//            response = Utility.constructJSON("login", false, "Incorrect Email or Password");
//        }
//        return response;
//    }
}
