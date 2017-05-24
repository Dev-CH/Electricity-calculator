
package com.chrishammer.service;

import java.math.BigDecimal;
import java.util.List;

import com.chrishammer.model.AccountReport;

public interface CalculateService {

	BigDecimal calculateCosts(String provider, long user);

	List<AccountReport> getCostBreakdown(long id, String provider);

}