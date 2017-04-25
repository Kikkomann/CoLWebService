
package cleanoutloudserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for quiz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="quiz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="funFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textQuestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quiz", propOrder = {
    "funFact",
    "name",
    "textQuestion"
})
public class Quiz {

    protected String funFact;
    protected String name;
    protected String textQuestion;

    /**
     * Gets the value of the funFact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunFact() {
        return funFact;
    }

    /**
     * Sets the value of the funFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunFact(String value) {
        this.funFact = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the textQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextQuestion() {
        return textQuestion;
    }

    /**
     * Sets the value of the textQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextQuestion(String value) {
        this.textQuestion = value;
    }

}
