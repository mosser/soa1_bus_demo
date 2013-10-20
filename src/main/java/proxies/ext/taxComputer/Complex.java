
package proxies.ext.taxComputer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complexTaxInfo" type="{http://external/}advancedTaxRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complex", propOrder = {
    "complexTaxInfo"
})
public class Complex {

    protected AdvancedTaxRequest complexTaxInfo;

    /**
     * Gets the value of the complexTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdvancedTaxRequest }
     *     
     */
    public AdvancedTaxRequest getComplexTaxInfo() {
        return complexTaxInfo;
    }

    /**
     * Sets the value of the complexTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvancedTaxRequest }
     *     
     */
    public void setComplexTaxInfo(AdvancedTaxRequest value) {
        this.complexTaxInfo = value;
    }

}
