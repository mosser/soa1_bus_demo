
package proxies.ext.taxComputer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simpleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simpleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="simple_result" type="{http://external/}taxComputation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleResponse", propOrder = {
    "simpleResult"
})
public class SimpleResponse {

    @XmlElement(name = "simple_result")
    protected TaxComputation simpleResult;

    /**
     * Gets the value of the simpleResult property.
     * 
     * @return
     *     possible object is
     *     {@link TaxComputation }
     *     
     */
    public TaxComputation getSimpleResult() {
        return simpleResult;
    }

    /**
     * Sets the value of the simpleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxComputation }
     *     
     */
    public void setSimpleResult(TaxComputation value) {
        this.simpleResult = value;
    }

}
