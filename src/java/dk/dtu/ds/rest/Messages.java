package dk.dtu.ds.rest;

import cleanoutloudserver.Comment;
import cleanoutloudserver.CustomErrorMessage_Exception;
import cleanoutloudserver.ICleanOutLoud;
import cleanoutloudserver.Message;
import java.net.MalformedURLException;
import java.net.URL;
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

@Path("messages")
public class Messages {
    @GET
    @Path("/")
    // Produces JSON as response
    @Produces(MediaType.APPLICATION_JSON)
    // Query parameters are parameters: http://localhost:8084/colrest/CoL/messages
    // Server address: http://52.43.233.138:8080/CoLWebService/CoL/messages
    public String getMessages() throws MalformedURLException, Exception {
        URL url = new URL("http://ec2-52-43-233-138.us-west-2.compute.amazonaws.com:3769/col?wsdl");
        QName qname = new QName("http://cleanoutloudserver/", "CleanOutLoudImplService");
        Service service = Service.create(url, qname);
        ICleanOutLoud col = service.getPort(ICleanOutLoud.class);

        JSONObject wallObjectJson = new JSONObject();
        JSONArray wallArrayJson = new JSONArray();

        try {
            for (Message m : col.getWallMessages()) {
                JSONObject messageItem = new JSONObject();
                messageItem.put("date", m.getDate());
                messageItem.put("id", m.getMessageId());
                messageItem.put("text", m.getText());
                wallArrayJson.put(messageItem);
            }
            wallObjectJson.put("wall", wallArrayJson);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return wallObjectJson.toString();
    }
    
    @GET
    @Path("comments")
    // Produces JSON as response
    @Produces(MediaType.APPLICATION_JSON)
    // Query parameters are parameters: http://localhost:8084/colrest/CoL/objects/wall
    // Server address: http://52.43.233.138:8080/CoLWebService/CoL/messages/comments?messageid=messageid
    public String getComments(@QueryParam("messageid") Integer messageId) throws MalformedURLException, Exception {
        URL url = new URL("http://ec2-52-43-233-138.us-west-2.compute.amazonaws.com:3769/col?wsdl");
        QName qname = new QName("http://cleanoutloudserver/", "CleanOutLoudImplService");
        Service service = Service.create(url, qname);
        ICleanOutLoud col = service.getPort(ICleanOutLoud.class);

        JSONObject commentObjectJson = new JSONObject();
        JSONArray commentArrayJson = new JSONArray();

        try {
            for (Comment c : col.getCommentsForMessage(messageId)) {
                JSONObject messageItem = new JSONObject();
                messageItem.put("date", c.getDate());
                messageItem.put("text", c.getText());
                commentArrayJson.put(messageItem);
            }
            commentObjectJson.put("comment", commentArrayJson);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return commentObjectJson.toString();
    }

    @GET
    // Path: http://localhost:8080/colREST/CoL/login/douser
    // Produces JSON as response
    @Produces(MediaType.APPLICATION_JSON)
    @Path("createmessage")
    // Query parameters are parameters: http://localhost:8084/colrest/CoL/objects/createmessage?message=test123&token=test123:684f65ffe8618fa7
    public String createMessage(@QueryParam("message") String message, @QueryParam("token") String token) throws MalformedURLException, Exception {
        URL url = new URL("http://ec2-52-43-233-138.us-west-2.compute.amazonaws.com:3769/col?wsdl");
        QName qname = new QName("http://cleanoutloudserver/", "CleanOutLoudImplService");
        Service service = Service.create(url, qname);
        ICleanOutLoud col = service.getPort(ICleanOutLoud.class);
        try {
            col.addMessage(message, token);
            JSONObject json = new JSONObject();
            json.put("success", true);
            return json.toString();
        } catch (CustomErrorMessage_Exception e) {
            e.printStackTrace();
            JSONObject json = new JSONObject();
            json.put("success", false);
            return json.toString();
        }
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("addcomment")
    public String createComment(@QueryParam("comment") String comment, @QueryParam("messageid") int messageId, @QueryParam("token") String token) throws MalformedURLException, Exception {
        URL url = new URL("http://ec2-52-43-233-138.us-west-2.compute.amazonaws.com:3769/col?wsdl");
        QName qname = new QName("http://cleanoutloudserver/", "CleanOutLoudImplService");
        Service service = Service.create(url, qname);
        ICleanOutLoud col = service.getPort(ICleanOutLoud.class);
        try {
            col.addComment(comment, messageId, token);
            JSONObject json = new JSONObject();
            json.put("success", true);
            return json.toString();
        } catch (CustomErrorMessage_Exception e) {
            e.printStackTrace();
            JSONObject json = new JSONObject();
            json.put("success", false);
            return json.toString();
        }
    }
}
