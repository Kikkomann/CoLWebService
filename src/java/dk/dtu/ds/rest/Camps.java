package dk.dtu.ds.rest;

import cleanoutloudserver.Camp;
import cleanoutloudserver.Comment;
import cleanoutloudserver.CustomErrorMessage_Exception;
import cleanoutloudserver.ICleanOutLoud;
import cleanoutloudserver.Message;
import cleanoutloudserver.User;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("camps")
public class Camps {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCamps(@QueryParam("sorted") boolean sorted) throws MalformedURLException, Exception {
        URL url = new URL("http://ec2-52-43-233-138.us-west-2.compute.amazonaws.com:3769/col?wsdl");
        QName qname = new QName("http://cleanoutloudserver/", "CleanOutLoudImplService");
        Service service = Service.create(url, qname);
        ICleanOutLoud col = service.getPort(ICleanOutLoud.class);

        JSONObject campsObjectJson = new JSONObject();
        JSONArray campsArrayJson = new JSONArray();
        List<Camp> camps;

        if (sorted) {
            camps = col.getCampsSortedInWeight();
            col.getCampsSortedInWeight();
            try {
                for (Camp c : camps) {
                    JSONObject listItems = new JSONObject();
                    listItems.put("name", c.getCampName());
                    listItems.put("location", c.getLocation());
                    listItems.put("weight", c.getGarbageWeight());
                    campsArrayJson.put(listItems);
                }
                campsObjectJson.put("camps", campsArrayJson);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            camps = col.getCamps();
            try {
                for (Camp c : camps) {
                    JSONObject listItems = new JSONObject();
                    listItems.put("name", c.getCampName());
                    listItems.put("location", c.getLocation());
                    listItems.put("weight", c.getGarbageWeight());
                    campsArrayJson.put(listItems);
                }
                campsObjectJson.put("camps", campsArrayJson);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return campsObjectJson.toString();
    }
    
    @GET
    @Path("addgarbage")
    @Produces(MediaType.APPLICATION_JSON)
    public String setGarbage(@QueryParam("campname") String campName, @QueryParam("weight") Float weight, @QueryParam("token") String token) throws MalformedURLException, Exception {
        URL url = new URL("http://ec2-52-43-233-138.us-west-2.compute.amazonaws.com:3769/col?wsdl");
        QName qname = new QName("http://cleanoutloudserver/", "CleanOutLoudImplService");
        Service service = Service.create(url, qname);
        ICleanOutLoud col = service.getPort(ICleanOutLoud.class);

        JSONObject campObjectJson = new JSONObject();
        
        try {
            col.setGarbage(campName, weight, token);
            campObjectJson.put("success", true);
            return campObjectJson.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            campObjectJson.put("success", false);
            return campObjectJson.toString();
        }
    }

}
