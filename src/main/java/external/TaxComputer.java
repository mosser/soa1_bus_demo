package external;

import javax.jws.*;

import external.data.*;

@WebService(name="TaxComputer")
public interface TaxComputer {

	@WebResult(name="simple_result")
	public TaxComputation simple(@WebParam(name="simpleTaxInfo") SimpleTaxRequest request);

	@WebResult(name="complex_result")
	public TaxComputation complex(@WebParam(name="complexTaxInfo") AdvancedTaxRequest request);
		
}
