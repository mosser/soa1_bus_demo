package external.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AdvancedTaxRequest extends SimpleTaxRequest {

	@XmlElement(required = true)
	public float assets;
	
	@XmlElement(required = true)
	public int zone; 
	
}
