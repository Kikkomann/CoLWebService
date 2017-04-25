
package cleanoutloudserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for camps complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="camps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="garbageWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camps", propOrder = {
    "campName",
    "garbageWeight",
    "location"
})
public class Camps {

    protected String campName;
    protected int garbageWeight;
    protected String location;

    /**
     * Gets the value of the campName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampName() {
        return campName;
    }

    /**
     * Sets the value of the campName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampName(String value) {
        this.campName = value;
    }

    /**
     * Gets the value of the garbageWeight property.
     * 
     */
    public int getGarbageWeight() {
        return garbageWeight;
    }

    /**
     * Sets the value of the garbageWeight property.
     * 
     */
    public void setGarbageWeight(int value) {
        this.garbageWeight = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
