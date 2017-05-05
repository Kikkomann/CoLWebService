
package cleanoutloudserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cleanoutloudserver package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteCamp_QNAME = new QName("http://cleanoutloudserver/", "deleteCamp");
    private final static QName _GetMessage_QNAME = new QName("http://cleanoutloudserver/", "getMessage");
    private final static QName _SetGarbage_QNAME = new QName("http://cleanoutloudserver/", "setGarbage");
    private final static QName _CustomErrorMessage_QNAME = new QName("http://cleanoutloudserver/", "CustomErrorMessage");
    private final static QName _Message_QNAME = new QName("http://cleanoutloudserver/", "message");
    private final static QName _Exception_QNAME = new QName("http://cleanoutloudserver/", "Exception");
    private final static QName _Camp_QNAME = new QName("http://cleanoutloudserver/", "camp");
    private final static QName _GetCommentsForMessage_QNAME = new QName("http://cleanoutloudserver/", "getCommentsForMessage");
    private final static QName _AddCommentResponse_QNAME = new QName("http://cleanoutloudserver/", "addCommentResponse");
    private final static QName _GetCamps_QNAME = new QName("http://cleanoutloudserver/", "getCamps");
    private final static QName _LoginResponse_QNAME = new QName("http://cleanoutloudserver/", "loginResponse");
    private final static QName _CreateUserResponse_QNAME = new QName("http://cleanoutloudserver/", "createUserResponse");
    private final static QName _Comment_QNAME = new QName("http://cleanoutloudserver/", "comment");
    private final static QName _CreateUser_QNAME = new QName("http://cleanoutloudserver/", "createUser");
    private final static QName _SetGarbageResponse_QNAME = new QName("http://cleanoutloudserver/", "setGarbageResponse");
    private final static QName _User_QNAME = new QName("http://cleanoutloudserver/", "user");
    private final static QName _GetWallMessages_QNAME = new QName("http://cleanoutloudserver/", "getWallMessages");
    private final static QName _Login_QNAME = new QName("http://cleanoutloudserver/", "login");
    private final static QName _AddMessageResponse_QNAME = new QName("http://cleanoutloudserver/", "addMessageResponse");
    private final static QName _AddMessage_QNAME = new QName("http://cleanoutloudserver/", "addMessage");
    private final static QName _GetMessageResponse_QNAME = new QName("http://cleanoutloudserver/", "getMessageResponse");
    private final static QName _AddCamp_QNAME = new QName("http://cleanoutloudserver/", "addCamp");
    private final static QName _GetUserResponse_QNAME = new QName("http://cleanoutloudserver/", "getUserResponse");
    private final static QName _AddCampResponse_QNAME = new QName("http://cleanoutloudserver/", "addCampResponse");
    private final static QName _SetUserResponse_QNAME = new QName("http://cleanoutloudserver/", "setUserResponse");
    private final static QName _GetCampsSortedInWeight_QNAME = new QName("http://cleanoutloudserver/", "getCampsSortedInWeight");
    private final static QName _GetUser_QNAME = new QName("http://cleanoutloudserver/", "getUser");
    private final static QName _GetWallMessagesResponse_QNAME = new QName("http://cleanoutloudserver/", "getWallMessagesResponse");
    private final static QName _SetUser_QNAME = new QName("http://cleanoutloudserver/", "setUser");
    private final static QName _AddComment_QNAME = new QName("http://cleanoutloudserver/", "addComment");
    private final static QName _GetCommentsForMessageResponse_QNAME = new QName("http://cleanoutloudserver/", "getCommentsForMessageResponse");
    private final static QName _GetCampsSortedInWeightResponse_QNAME = new QName("http://cleanoutloudserver/", "getCampsSortedInWeightResponse");
    private final static QName _DeleteCampResponse_QNAME = new QName("http://cleanoutloudserver/", "deleteCampResponse");
    private final static QName _GetCampsResponse_QNAME = new QName("http://cleanoutloudserver/", "getCampsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cleanoutloudserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCamp }
     * 
     */
    public AddCamp createAddCamp() {
        return new AddCamp();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link AddCampResponse }
     * 
     */
    public AddCampResponse createAddCampResponse() {
        return new AddCampResponse();
    }

    /**
     * Create an instance of {@link SetUserResponse }
     * 
     */
    public SetUserResponse createSetUserResponse() {
        return new SetUserResponse();
    }

    /**
     * Create an instance of {@link GetCampsSortedInWeight }
     * 
     */
    public GetCampsSortedInWeight createGetCampsSortedInWeight() {
        return new GetCampsSortedInWeight();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link AddMessageResponse }
     * 
     */
    public AddMessageResponse createAddMessageResponse() {
        return new AddMessageResponse();
    }

    /**
     * Create an instance of {@link AddMessage }
     * 
     */
    public AddMessage createAddMessage() {
        return new AddMessage();
    }

    /**
     * Create an instance of {@link GetMessageResponse }
     * 
     */
    public GetMessageResponse createGetMessageResponse() {
        return new GetMessageResponse();
    }

    /**
     * Create an instance of {@link GetCommentsForMessageResponse }
     * 
     */
    public GetCommentsForMessageResponse createGetCommentsForMessageResponse() {
        return new GetCommentsForMessageResponse();
    }

    /**
     * Create an instance of {@link GetCampsSortedInWeightResponse }
     * 
     */
    public GetCampsSortedInWeightResponse createGetCampsSortedInWeightResponse() {
        return new GetCampsSortedInWeightResponse();
    }

    /**
     * Create an instance of {@link DeleteCampResponse }
     * 
     */
    public DeleteCampResponse createDeleteCampResponse() {
        return new DeleteCampResponse();
    }

    /**
     * Create an instance of {@link GetCampsResponse }
     * 
     */
    public GetCampsResponse createGetCampsResponse() {
        return new GetCampsResponse();
    }

    /**
     * Create an instance of {@link GetWallMessagesResponse }
     * 
     */
    public GetWallMessagesResponse createGetWallMessagesResponse() {
        return new GetWallMessagesResponse();
    }

    /**
     * Create an instance of {@link SetUser }
     * 
     */
    public SetUser createSetUser() {
        return new SetUser();
    }

    /**
     * Create an instance of {@link AddComment }
     * 
     */
    public AddComment createAddComment() {
        return new AddComment();
    }

    /**
     * Create an instance of {@link GetCommentsForMessage }
     * 
     */
    public GetCommentsForMessage createGetCommentsForMessage() {
        return new GetCommentsForMessage();
    }

    /**
     * Create an instance of {@link AddCommentResponse }
     * 
     */
    public AddCommentResponse createAddCommentResponse() {
        return new AddCommentResponse();
    }

    /**
     * Create an instance of {@link GetCamps }
     * 
     */
    public GetCamps createGetCamps() {
        return new GetCamps();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link DeleteCamp }
     * 
     */
    public DeleteCamp createDeleteCamp() {
        return new DeleteCamp();
    }

    /**
     * Create an instance of {@link GetMessage }
     * 
     */
    public GetMessage createGetMessage() {
        return new GetMessage();
    }

    /**
     * Create an instance of {@link SetGarbage }
     * 
     */
    public SetGarbage createSetGarbage() {
        return new SetGarbage();
    }

    /**
     * Create an instance of {@link CustomErrorMessage }
     * 
     */
    public CustomErrorMessage createCustomErrorMessage() {
        return new CustomErrorMessage();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Camp }
     * 
     */
    public Camp createCamp() {
        return new Camp();
    }

    /**
     * Create an instance of {@link GetWallMessages }
     * 
     */
    public GetWallMessages createGetWallMessages() {
        return new GetWallMessages();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link SetGarbageResponse }
     * 
     */
    public SetGarbageResponse createSetGarbageResponse() {
        return new SetGarbageResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCamp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "deleteCamp")
    public JAXBElement<DeleteCamp> createDeleteCamp(DeleteCamp value) {
        return new JAXBElement<DeleteCamp>(_DeleteCamp_QNAME, DeleteCamp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getMessage")
    public JAXBElement<GetMessage> createGetMessage(GetMessage value) {
        return new JAXBElement<GetMessage>(_GetMessage_QNAME, GetMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGarbage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "setGarbage")
    public JAXBElement<SetGarbage> createSetGarbage(SetGarbage value) {
        return new JAXBElement<SetGarbage>(_SetGarbage_QNAME, SetGarbage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "CustomErrorMessage")
    public JAXBElement<CustomErrorMessage> createCustomErrorMessage(CustomErrorMessage value) {
        return new JAXBElement<CustomErrorMessage>(_CustomErrorMessage_QNAME, CustomErrorMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Camp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "camp")
    public JAXBElement<Camp> createCamp(Camp value) {
        return new JAXBElement<Camp>(_Camp_QNAME, Camp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommentsForMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getCommentsForMessage")
    public JAXBElement<GetCommentsForMessage> createGetCommentsForMessage(GetCommentsForMessage value) {
        return new JAXBElement<GetCommentsForMessage>(_GetCommentsForMessage_QNAME, GetCommentsForMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "addCommentResponse")
    public JAXBElement<AddCommentResponse> createAddCommentResponse(AddCommentResponse value) {
        return new JAXBElement<AddCommentResponse>(_AddCommentResponse_QNAME, AddCommentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCamps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getCamps")
    public JAXBElement<GetCamps> createGetCamps(GetCamps value) {
        return new JAXBElement<GetCamps>(_GetCamps_QNAME, GetCamps.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "comment")
    public JAXBElement<Comment> createComment(Comment value) {
        return new JAXBElement<Comment>(_Comment_QNAME, Comment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGarbageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "setGarbageResponse")
    public JAXBElement<SetGarbageResponse> createSetGarbageResponse(SetGarbageResponse value) {
        return new JAXBElement<SetGarbageResponse>(_SetGarbageResponse_QNAME, SetGarbageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWallMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getWallMessages")
    public JAXBElement<GetWallMessages> createGetWallMessages(GetWallMessages value) {
        return new JAXBElement<GetWallMessages>(_GetWallMessages_QNAME, GetWallMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "addMessageResponse")
    public JAXBElement<AddMessageResponse> createAddMessageResponse(AddMessageResponse value) {
        return new JAXBElement<AddMessageResponse>(_AddMessageResponse_QNAME, AddMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "addMessage")
    public JAXBElement<AddMessage> createAddMessage(AddMessage value) {
        return new JAXBElement<AddMessage>(_AddMessage_QNAME, AddMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getMessageResponse")
    public JAXBElement<GetMessageResponse> createGetMessageResponse(GetMessageResponse value) {
        return new JAXBElement<GetMessageResponse>(_GetMessageResponse_QNAME, GetMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCamp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "addCamp")
    public JAXBElement<AddCamp> createAddCamp(AddCamp value) {
        return new JAXBElement<AddCamp>(_AddCamp_QNAME, AddCamp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCampResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "addCampResponse")
    public JAXBElement<AddCampResponse> createAddCampResponse(AddCampResponse value) {
        return new JAXBElement<AddCampResponse>(_AddCampResponse_QNAME, AddCampResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "setUserResponse")
    public JAXBElement<SetUserResponse> createSetUserResponse(SetUserResponse value) {
        return new JAXBElement<SetUserResponse>(_SetUserResponse_QNAME, SetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampsSortedInWeight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getCampsSortedInWeight")
    public JAXBElement<GetCampsSortedInWeight> createGetCampsSortedInWeight(GetCampsSortedInWeight value) {
        return new JAXBElement<GetCampsSortedInWeight>(_GetCampsSortedInWeight_QNAME, GetCampsSortedInWeight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWallMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getWallMessagesResponse")
    public JAXBElement<GetWallMessagesResponse> createGetWallMessagesResponse(GetWallMessagesResponse value) {
        return new JAXBElement<GetWallMessagesResponse>(_GetWallMessagesResponse_QNAME, GetWallMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "setUser")
    public JAXBElement<SetUser> createSetUser(SetUser value) {
        return new JAXBElement<SetUser>(_SetUser_QNAME, SetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "addComment")
    public JAXBElement<AddComment> createAddComment(AddComment value) {
        return new JAXBElement<AddComment>(_AddComment_QNAME, AddComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommentsForMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getCommentsForMessageResponse")
    public JAXBElement<GetCommentsForMessageResponse> createGetCommentsForMessageResponse(GetCommentsForMessageResponse value) {
        return new JAXBElement<GetCommentsForMessageResponse>(_GetCommentsForMessageResponse_QNAME, GetCommentsForMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampsSortedInWeightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getCampsSortedInWeightResponse")
    public JAXBElement<GetCampsSortedInWeightResponse> createGetCampsSortedInWeightResponse(GetCampsSortedInWeightResponse value) {
        return new JAXBElement<GetCampsSortedInWeightResponse>(_GetCampsSortedInWeightResponse_QNAME, GetCampsSortedInWeightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCampResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "deleteCampResponse")
    public JAXBElement<DeleteCampResponse> createDeleteCampResponse(DeleteCampResponse value) {
        return new JAXBElement<DeleteCampResponse>(_DeleteCampResponse_QNAME, DeleteCampResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCampsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getCampsResponse")
    public JAXBElement<GetCampsResponse> createGetCampsResponse(GetCampsResponse value) {
        return new JAXBElement<GetCampsResponse>(_GetCampsResponse_QNAME, GetCampsResponse.class, null, value);
    }

}
