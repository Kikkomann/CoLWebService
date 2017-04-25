
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

    private final static QName _GetQuizzes_QNAME = new QName("http://cleanoutloudserver/", "getQuizzes");
    private final static QName _Exception_QNAME = new QName("http://cleanoutloudserver/", "Exception");
    private final static QName _Users_QNAME = new QName("http://cleanoutloudserver/", "users");
    private final static QName _Quiz_QNAME = new QName("http://cleanoutloudserver/", "quiz");
    private final static QName _AddCommentResponse_QNAME = new QName("http://cleanoutloudserver/", "addCommentResponse");
    private final static QName _GetCamps_QNAME = new QName("http://cleanoutloudserver/", "getCamps");
    private final static QName _LoginResponse_QNAME = new QName("http://cleanoutloudserver/", "loginResponse");
    private final static QName _CreateUserResponse_QNAME = new QName("http://cleanoutloudserver/", "createUserResponse");
    private final static QName _Messages_QNAME = new QName("http://cleanoutloudserver/", "messages");
    private final static QName _CreateUser_QNAME = new QName("http://cleanoutloudserver/", "createUser");
    private final static QName _GetQuizAnswersResponse_QNAME = new QName("http://cleanoutloudserver/", "getQuizAnswersResponse");
    private final static QName _QuizAnswers_QNAME = new QName("http://cleanoutloudserver/", "quizAnswers");
    private final static QName _Camps_QNAME = new QName("http://cleanoutloudserver/", "camps");
    private final static QName _GetWallMessages_QNAME = new QName("http://cleanoutloudserver/", "getWallMessages");
    private final static QName _EditUser_QNAME = new QName("http://cleanoutloudserver/", "editUser");
    private final static QName _GetUsersOfAnsweredQuizzes_QNAME = new QName("http://cleanoutloudserver/", "getUsersOfAnsweredQuizzes");
    private final static QName _GetUsersOfAnsweredQuizzesResponse_QNAME = new QName("http://cleanoutloudserver/", "getUsersOfAnsweredQuizzesResponse");
    private final static QName _LoginWithBrugerAutMod_QNAME = new QName("http://cleanoutloudserver/", "loginWithBrugerAutMod");
    private final static QName _Login_QNAME = new QName("http://cleanoutloudserver/", "login");
    private final static QName _AddMessageResponse_QNAME = new QName("http://cleanoutloudserver/", "addMessageResponse");
    private final static QName _AddMessage_QNAME = new QName("http://cleanoutloudserver/", "addMessage");
    private final static QName _EditUserResponse_QNAME = new QName("http://cleanoutloudserver/", "editUserResponse");
    private final static QName _GetWallMessagesResponse_QNAME = new QName("http://cleanoutloudserver/", "getWallMessagesResponse");
    private final static QName _GetQuizAnswers_QNAME = new QName("http://cleanoutloudserver/", "getQuizAnswers");
    private final static QName _GetQuizzesResponse_QNAME = new QName("http://cleanoutloudserver/", "getQuizzesResponse");
    private final static QName _AddComment_QNAME = new QName("http://cleanoutloudserver/", "addComment");
    private final static QName _AnsweredQuizzes_QNAME = new QName("http://cleanoutloudserver/", "answeredQuizzes");
    private final static QName _LoginWithBrugerAutModResponse_QNAME = new QName("http://cleanoutloudserver/", "loginWithBrugerAutModResponse");
    private final static QName _GetCampsResponse_QNAME = new QName("http://cleanoutloudserver/", "getCampsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cleanoutloudserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditUserResponse }
     * 
     */
    public EditUserResponse createEditUserResponse() {
        return new EditUserResponse();
    }

    /**
     * Create an instance of {@link EditUser }
     * 
     */
    public EditUser createEditUser() {
        return new EditUser();
    }

    /**
     * Create an instance of {@link GetUsersOfAnsweredQuizzes }
     * 
     */
    public GetUsersOfAnsweredQuizzes createGetUsersOfAnsweredQuizzes() {
        return new GetUsersOfAnsweredQuizzes();
    }

    /**
     * Create an instance of {@link GetUsersOfAnsweredQuizzesResponse }
     * 
     */
    public GetUsersOfAnsweredQuizzesResponse createGetUsersOfAnsweredQuizzesResponse() {
        return new GetUsersOfAnsweredQuizzesResponse();
    }

    /**
     * Create an instance of {@link LoginWithBrugerAutMod }
     * 
     */
    public LoginWithBrugerAutMod createLoginWithBrugerAutMod() {
        return new LoginWithBrugerAutMod();
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
     * Create an instance of {@link AnsweredQuizzes }
     * 
     */
    public AnsweredQuizzes createAnsweredQuizzes() {
        return new AnsweredQuizzes();
    }

    /**
     * Create an instance of {@link LoginWithBrugerAutModResponse }
     * 
     */
    public LoginWithBrugerAutModResponse createLoginWithBrugerAutModResponse() {
        return new LoginWithBrugerAutModResponse();
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
     * Create an instance of {@link GetQuizAnswers }
     * 
     */
    public GetQuizAnswers createGetQuizAnswers() {
        return new GetQuizAnswers();
    }

    /**
     * Create an instance of {@link GetQuizzesResponse }
     * 
     */
    public GetQuizzesResponse createGetQuizzesResponse() {
        return new GetQuizzesResponse();
    }

    /**
     * Create an instance of {@link AddComment }
     * 
     */
    public AddComment createAddComment() {
        return new AddComment();
    }

    /**
     * Create an instance of {@link Quiz }
     * 
     */
    public Quiz createQuiz() {
        return new Quiz();
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
     * Create an instance of {@link GetQuizzes }
     * 
     */
    public GetQuizzes createGetQuizzes() {
        return new GetQuizzes();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link Camps }
     * 
     */
    public Camps createCamps() {
        return new Camps();
    }

    /**
     * Create an instance of {@link GetWallMessages }
     * 
     */
    public GetWallMessages createGetWallMessages() {
        return new GetWallMessages();
    }

    /**
     * Create an instance of {@link Messages }
     * 
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link GetQuizAnswersResponse }
     * 
     */
    public GetQuizAnswersResponse createGetQuizAnswersResponse() {
        return new GetQuizAnswersResponse();
    }

    /**
     * Create an instance of {@link QuizAnswers }
     * 
     */
    public QuizAnswers createQuizAnswers() {
        return new QuizAnswers();
    }

    /**
     * Create an instance of {@link AnsweredQuizzesPK }
     * 
     */
    public AnsweredQuizzesPK createAnsweredQuizzesPK() {
        return new AnsweredQuizzesPK();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuizzes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getQuizzes")
    public JAXBElement<GetQuizzes> createGetQuizzes(GetQuizzes value) {
        return new JAXBElement<GetQuizzes>(_GetQuizzes_QNAME, GetQuizzes.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Users }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "users")
    public JAXBElement<Users> createUsers(Users value) {
        return new JAXBElement<Users>(_Users_QNAME, Users.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quiz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "quiz")
    public JAXBElement<Quiz> createQuiz(Quiz value) {
        return new JAXBElement<Quiz>(_Quiz_QNAME, Quiz.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Messages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "messages")
    public JAXBElement<Messages> createMessages(Messages value) {
        return new JAXBElement<Messages>(_Messages_QNAME, Messages.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuizAnswersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getQuizAnswersResponse")
    public JAXBElement<GetQuizAnswersResponse> createGetQuizAnswersResponse(GetQuizAnswersResponse value) {
        return new JAXBElement<GetQuizAnswersResponse>(_GetQuizAnswersResponse_QNAME, GetQuizAnswersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuizAnswers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "quizAnswers")
    public JAXBElement<QuizAnswers> createQuizAnswers(QuizAnswers value) {
        return new JAXBElement<QuizAnswers>(_QuizAnswers_QNAME, QuizAnswers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Camps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "camps")
    public JAXBElement<Camps> createCamps(Camps value) {
        return new JAXBElement<Camps>(_Camps_QNAME, Camps.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "editUser")
    public JAXBElement<EditUser> createEditUser(EditUser value) {
        return new JAXBElement<EditUser>(_EditUser_QNAME, EditUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersOfAnsweredQuizzes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getUsersOfAnsweredQuizzes")
    public JAXBElement<GetUsersOfAnsweredQuizzes> createGetUsersOfAnsweredQuizzes(GetUsersOfAnsweredQuizzes value) {
        return new JAXBElement<GetUsersOfAnsweredQuizzes>(_GetUsersOfAnsweredQuizzes_QNAME, GetUsersOfAnsweredQuizzes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersOfAnsweredQuizzesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getUsersOfAnsweredQuizzesResponse")
    public JAXBElement<GetUsersOfAnsweredQuizzesResponse> createGetUsersOfAnsweredQuizzesResponse(GetUsersOfAnsweredQuizzesResponse value) {
        return new JAXBElement<GetUsersOfAnsweredQuizzesResponse>(_GetUsersOfAnsweredQuizzesResponse_QNAME, GetUsersOfAnsweredQuizzesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginWithBrugerAutMod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "loginWithBrugerAutMod")
    public JAXBElement<LoginWithBrugerAutMod> createLoginWithBrugerAutMod(LoginWithBrugerAutMod value) {
        return new JAXBElement<LoginWithBrugerAutMod>(_LoginWithBrugerAutMod_QNAME, LoginWithBrugerAutMod.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EditUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "editUserResponse")
    public JAXBElement<EditUserResponse> createEditUserResponse(EditUserResponse value) {
        return new JAXBElement<EditUserResponse>(_EditUserResponse_QNAME, EditUserResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuizAnswers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getQuizAnswers")
    public JAXBElement<GetQuizAnswers> createGetQuizAnswers(GetQuizAnswers value) {
        return new JAXBElement<GetQuizAnswers>(_GetQuizAnswers_QNAME, GetQuizAnswers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuizzesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "getQuizzesResponse")
    public JAXBElement<GetQuizzesResponse> createGetQuizzesResponse(GetQuizzesResponse value) {
        return new JAXBElement<GetQuizzesResponse>(_GetQuizzesResponse_QNAME, GetQuizzesResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AnsweredQuizzes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "answeredQuizzes")
    public JAXBElement<AnsweredQuizzes> createAnsweredQuizzes(AnsweredQuizzes value) {
        return new JAXBElement<AnsweredQuizzes>(_AnsweredQuizzes_QNAME, AnsweredQuizzes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginWithBrugerAutModResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cleanoutloudserver/", name = "loginWithBrugerAutModResponse")
    public JAXBElement<LoginWithBrugerAutModResponse> createLoginWithBrugerAutModResponse(LoginWithBrugerAutModResponse value) {
        return new JAXBElement<LoginWithBrugerAutModResponse>(_LoginWithBrugerAutModResponse_QNAME, LoginWithBrugerAutModResponse.class, null, value);
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
