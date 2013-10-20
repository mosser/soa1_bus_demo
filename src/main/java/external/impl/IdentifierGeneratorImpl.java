package external.impl;

import java.util.UUID;
import javax.jws.WebService;
import external.IdentifierGenerator;

@WebService(endpointInterface="external.IdentifierGenerator")
public class IdentifierGeneratorImpl implements IdentifierGenerator {

	public UUID build() { return UUID.randomUUID(); }
	
}
