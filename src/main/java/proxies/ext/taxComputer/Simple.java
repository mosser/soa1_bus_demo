
package proxies.ext.taxComputer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="simpleTaxInfo" type="{http://external/}simpleTaxRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simple", propOrder = {
    "simpleTaxInfo"
})
public class Simple {

    protected SimpleTaxRequest simpleTaxInfo;

    /**
     * Gets the value of the simpleTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleTaxRequest }
     *     
     */
    public SimpleTaxRequest getSimpleTaxInfo() {
        return simpleTaxInfo;
    }

    /**
     * Sets the value of the simpleTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleTaxRequest }
     *     
     */
    public void setSimpleTaxInfo(SimpleTaxRequest value) {
        this.simpleTaxInfo = value;
    }

}
