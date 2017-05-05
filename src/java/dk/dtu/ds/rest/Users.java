package dk.dtu.ds.rest;

import cleanoutloudserver.Camp;
import cleanoutloudserver.ICleanOutLoud;
import cleanoutloudserver.User;
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

@Path("users")
public class Users {
    @GET
    @Path("user")
    // Produces JSON as response
    @Produces(MediaType.APPLICATION_JSON)
    // Query parameters are parameters: http://localhost:8084/colrest/CoL/objects/user?username=nicki&token=nicki:5de3d003fc755842
    // Server address: http://52.43.233.138:8080/CoLWebService/CoL/objects/user?username=nicki&token=nicki:4265a6bab3a9a755
    public String getUser(@QueryParam("username") String uname, @QueryParam("token") String token) throws MalformedURLException, Exception {
        URL url = new URL("http://ec2-52-43-233-138.us-west-2.compute.amazonaws.com:3769/col?wsdl");
        QName qname = new QName("http://cleanoutloudserver/", "CleanOutLoudImplService");
        Service service = Service.create(url, qname);
        ICleanOutLoud col = service.getPort(ICleanOutLoud.class);
        User user = col.getUser(uname, token);
        Camp camp;
        for (Camp c : col.getCamps()) {
        }

        JSONObject userObjectJson = new JSONObject();
        try {
            userObjectJson.put("username", user.getUserName());
            userObjectJson.put("password", user.getPassword());
            userObjectJson.put("usertype", user.getUserType());
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userObjectJson.toString();
    }
}
