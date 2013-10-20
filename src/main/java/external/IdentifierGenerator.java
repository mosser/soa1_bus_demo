package external;

import java.util.UUID;

import javax.jws.*;

@WebService(name="AnonymousIdentifier")
public interface IdentifierGenerator {

	@WebMethod
	@WebResult(name="identifier")
	public UUID build();
	
}
