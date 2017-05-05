package dk.dtu.ds.rest;

import cleanoutloudserver.CustomErrorMessage_Exception;
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
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("login")
public class Login {
    // HTTP Get Method

    @GET
    @Path("dologin")
    // Produces JSON as response
    @Produces(MediaType.APPLICATION_JSON)
    // Query parameters are parameters: http://localhost:8084/colrest/CoL/login/dologin?username=s150157&password=1234
    // Server address: http://52.43.233.138:8080/CoLWebService/CoL/login/dologin?username=s150157&password=1234
    public String login(@QueryParam("username") String uname, @QueryParam("password") String pwd) throws MalformedURLException, Exception {
        URL url = new URL("http://ec2-52-43-233-138.us-west-2.compute.amazonaws.com:3769/col?wsdl");
        QName qname = new QName("http://cleanoutloudserver/", "CleanOutLoudImplService");
        Service service = Service.create(url, qname);
        ICleanOutLoud col = service.getPort(ICleanOutLoud.class);
        String token = col.login(uname, pwd);

        JSONObject obj = new JSONObject();
        try {
            obj.put("token", token);
            obj.put("success", true);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return obj.toString();
    }

    @GET
    // Path: http://localhost:8080/colREST/CoL/login/douser
     // Produces JSON as response
    @Produces(MediaType.APPLICATION_JSON)
    @Path("createuser")
    // Query parameters are parameters: http://localhost:8084/colrest/CoL/login/douser?username=username&password=password&camp=Lmoan
    public String createUser(@QueryParam("username") String uname, @QueryParam("password") String pwd, @QueryParam("camp") String camp) throws MalformedURLException, Exception {
        URL url = new URL("http://ec2-52-43-233-138.us-west-2.compute.amazonaws.com:3769/col?wsdl");
        QName qname = new QName("http://cleanoutloudserver/", "CleanOutLoudImplService");
        Service service = Service.create(url, qname);
        ICleanOutLoud col = service.getPort(ICleanOutLoud.class);
        JSONObject json = new JSONObject();
        
        try {
            col.createUser(uname, pwd, camp, "user", "");
            json.put("success", true);
            return json.toString();
        } catch (CustomErrorMessage_Exception e) {
            e.printStackTrace();
            json.put("success", false);
            return json.toString();
        }
    }
}
