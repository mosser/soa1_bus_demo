package external.data;

import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SimpleTaxRequest {

	@XmlElement(name = "id", required = true)
	public UUID identifier;
	
	@XmlElement(required=true)
	public float income;
	
}
