
package proxies.ext.taxComputer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advancedTaxRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advancedTaxRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://external/}simpleTaxRequest">
 *       &lt;sequence>
 *         &lt;element name="assets" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="zone" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advancedTaxRequest", propOrder = {
    "assets",
    "zone"
})
public class AdvancedTaxRequest
    extends SimpleTaxRequest
{

    protected float assets;
    protected int zone;

    /**
     * Gets the value of the assets property.
     * 
     */
    public float getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     */
    public void setAssets(float value) {
        this.assets = value;
    }

    /**
     * Gets the value of the zone property.
     * 
     */
    public int getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     */
    public void setZone(int value) {
        this.zone = value;
    }

}
