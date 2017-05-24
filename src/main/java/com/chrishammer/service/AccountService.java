
package com.chrishammer.service;

import java.util.List;

import com.chrishammer.model.Account;
import com.chrishammer.model.AccountReport;

public interface AccountService {

	Account save(Account userSession);
	List<AccountReport> displayAllAccountReports(long userId);
	
	Account getUser (String userName);
	
	boolean checkForUser(String userName);

}