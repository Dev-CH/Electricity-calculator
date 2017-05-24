
package com.chrishammer.repository;

import java.util.List;

import com.chrishammer.model.Account;
import com.chrishammer.model.AccountReport;

public interface AccountRepository {

	Account save(Account userSession);

	List<AccountReport> displayAllAccountReports(long userId);

	Account getUser(String userName);

	boolean checkForUser(String userName);
	
	/*List<HouseholdReport> findAllHouseholdReports(long userId);*/

		
		
}