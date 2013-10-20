
package proxies.ext.taxComputer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complexResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complexResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complex_result" type="{http://external/}taxComputation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complexResponse", propOrder = {
    "complexResult"
})
public class ComplexResponse {

    @XmlElement(name = "complex_result")
    protected TaxComputation complexResult;

    /**
     * Gets the value of the complexResult property.
     * 
     * @return
     *     possible object is
     *     {@link TaxComputation }
     *     
     */
    public TaxComputation getComplexResult() {
        return complexResult;
    }

    /**
     * Sets the value of the complexResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxComputation }
     *     
     */
    public void setComplexResult(TaxComputation value) {
        this.complexResult = value;
    }

}
