
package com.chrishammer.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chrishammer.model.AccountReport;
import com.chrishammer.model.Provider;
import com.chrishammer.repository.AccountRepository;
import com.chrishammer.repository.CalculateRepository;

@Service("CalculateService")
@Transactional
public class CalculateServiceImpl implements CalculateService {

	@Autowired
	private CalculateRepository calculateRepository;
	@Autowired
	private AccountRepository accountRepository;
	
	private float totalCost = 0;
	
	public BigDecimal calculateCosts(String provider, long user) {
		
		Provider userProvider = calculateRepository.getProvider(provider);
		List<AccountReport> userAccountReport = accountRepository.displayAllAccountReports(user);
		totalCost = 0;
		BigDecimal roundedTotal;
		
		for (AccountReport a : userAccountReport){
			float productsEnergyUseage = a.getProductTotalEnergy();			
			BigDecimal bd = new BigDecimal(productsEnergyUseage).setScale(2, RoundingMode.CEILING);	// rounds use to 2 decimal places
			
			if(a.getProductEnergyType().equals("leccy")) {
				totalCost += productsEnergyUseage * userProvider.getElecticUnit();
			}
			else {
				totalCost += productsEnergyUseage * userProvider.getWaterUnit();
			}
			a.setMonthlyUseage(bd);									// sets user view for Monthyl Energy Use.
		}
		totalCost += userProvider.getStandingChargePM();
	    roundedTotal = round((totalCost/100),2);					// changes from pence into £ and rounds to 2 decimal places.
	    return roundedTotal;
	}

	public List<AccountReport> getCostBreakdown(long user, String provider) {
		float breakdown;
		BigDecimal result;
		Provider userProvider = calculateRepository.getProvider(provider);
		List<AccountReport> userAccountReport = accountRepository.displayAllAccountReports(user);
		
		for (AccountReport a: userAccountReport) {
			BigDecimal bd = new BigDecimal(a.getProductTotalEnergy()).setScale(2, RoundingMode.CEILING);
			if (a.getProductEnergyType().equals("leccy")) {
				breakdown = a.getProductTotalEnergy()*userProvider.getElecticUnit();		
			}
			else {
				breakdown = a.getProductTotalEnergy()*userProvider.getWaterUnit();
			}
		    result = round((breakdown/100),2);		// changes from pence into £ and rounds to 2 decimal places.
			a.setCostBreakdown(result);
			a.setMonthlyUseage(bd);
		}	
		return userAccountReport;
	}
	
	
	public static BigDecimal round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);       
        return bd;
    }

}