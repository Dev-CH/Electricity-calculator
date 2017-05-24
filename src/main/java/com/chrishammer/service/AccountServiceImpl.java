
package com.chrishammer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chrishammer.model.Account;
import com.chrishammer.model.AccountReport;
import com.chrishammer.repository.AccountRepository;

@Service("HouseholdService")
@Transactional
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	public Account save(Account userSession) {
		
		return accountRepository.save(userSession);
	}
	public List<AccountReport> displayAllAccountReports(long userId) {
		return accountRepository.displayAllAccountReports(userId);
	}
	/*public List<HouseholdReport> findAllHouseholdReports(long userId, int counter) {
		return householdRepository.findAllHouseholdReports(userId);
	}
	*/
	public Account getUser(String userName) {
		return accountRepository.getUser(userName);
	}
	public boolean checkForUser(String userName) {
		return accountRepository.checkForUser(userName);
	}

}