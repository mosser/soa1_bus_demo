package internal;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


import internal.data.TaxPayer;
import internal.data.TaxPayerInformation;

@WebService(name="TaxComputer")
public interface HandleTaxPayer {

	@WebResult(name="result")
	public TaxPayerInformation handle(@WebParam(name="person") TaxPayer person);
	
}
