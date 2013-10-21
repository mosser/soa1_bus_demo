package internal;

import internal.data.TaxPayerInformation;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService(name="ConsultTaxInformation")
public interface ConsultTaxPayerInformation {

	@WebResult(name = "result")
	public TaxPayerInformation retrieve(@WebParam(name="fodselsnummer") String personId);
}
