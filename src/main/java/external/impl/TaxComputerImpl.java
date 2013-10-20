package external.impl;

import java.util.Date;
import java.util.UUID;

import javax.jws.WebService;

import external.data.AdvancedTaxRequest;
import external.data.SimpleTaxRequest;
import external.data.TaxComputation;

@WebService(endpointInterface="external.TaxComputer")
public class TaxComputerImpl implements external.TaxComputer {
	
	
	public TaxComputation simple(SimpleTaxRequest request) {
		float amount = (float) (request.income * 0.2);
		return buildResponse(request.identifier, amount);
	}
	
	public TaxComputation complex(AdvancedTaxRequest request) {
		float amount = computeIncome(request.income, request.zone) + computeAssets(request.assets, request.zone);
		return buildResponse(request.identifier, amount);
	}
	
	
	private TaxComputation buildResponse(UUID id, float amount) {
		TaxComputation result = new TaxComputation();
		result.identifier = id;
		result.date = new Date();
		result.amount = amount;
		return result;
	}
	
	private float computeIncome(float i, int code) {
		float coeff = (float) (code < 50 ? 0.2 : 0.18 );
		return i * coeff;
	}
	
	private float computeAssets(float a, int code) {
		float coeff = (float) (code < 50 ? 0.12 : 0.1 );
		return a * coeff;
	}

}
