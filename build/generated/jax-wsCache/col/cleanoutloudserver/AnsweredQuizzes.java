
package cleanoutloudserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for answeredQuizzes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="answeredQuizzes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="answeredCorrect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="answeredQuizzesPK" type="{http://cleanoutloudserver/}answeredQuizzesPK" minOccurs="0"/>
 *         &lt;element ref="{http://cleanoutloudserver/}quiz" minOccurs="0"/>
 *         &lt;element ref="{http://cleanoutloudserver/}users" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "answeredQuizzes", propOrder = {
    "answeredCorrect",
    "answeredQuizzesPK",
    "quiz",
    "users"
})
public class AnsweredQuizzes {

    protected boolean answeredCorrect;
    protected AnsweredQuizzesPK answeredQuizzesPK;
    @XmlElement(namespace = "http://cleanoutloudserver/")
    protected Quiz quiz;
    @XmlElement(namespace = "http://cleanoutloudserver/")
    protected Users users;

    /**
     * Gets the value of the answeredCorrect property.
     * 
     */
    public boolean isAnsweredCorrect() {
        return answeredCorrect;
    }

    /**
     * Sets the value of the answeredCorrect property.
     * 
     */
    public void setAnsweredCorrect(boolean value) {
        this.answeredCorrect = value;
    }

    /**
     * Gets the value of the answeredQuizzesPK property.
     * 
     * @return
     *     possible object is
     *     {@link AnsweredQuizzesPK }
     *     
     */
    public AnsweredQuizzesPK getAnsweredQuizzesPK() {
        return answeredQuizzesPK;
    }

    /**
     * Sets the value of the answeredQuizzesPK property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnsweredQuizzesPK }
     *     
     */
    public void setAnsweredQuizzesPK(AnsweredQuizzesPK value) {
        this.answeredQuizzesPK = value;
    }

    /**
     * Gets the value of the quiz property.
     * 
     * @return
     *     possible object is
     *     {@link Quiz }
     *     
     */
    public Quiz getQuiz() {
        return quiz;
    }

    /**
     * Sets the value of the quiz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quiz }
     *     
     */
    public void setQuiz(Quiz value) {
        this.quiz = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link Users }
     *     
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link Users }
     *     
     */
    public void setUsers(Users value) {
        this.users = value;
    }

}
