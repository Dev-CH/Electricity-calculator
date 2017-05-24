
package com.chrishammer.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.chrishammer.model.Account;
import com.chrishammer.model.AccountReport;

@Repository("AccountRepository")
public class AccountRepositoryImpl implements AccountRepository {

	@PersistenceContext
	private EntityManager em;

	public Account save(Account userSession) {
			
			em.persist(userSession);
			em.flush();
		
		return userSession;
	}

	@SuppressWarnings("unchecked")
	public List<AccountReport> displayAllAccountReports(long userId) {	
		Query query = em.createQuery(	"Select new com.chrishammer.model.AccountReport(p.name, p.amountOwned, p.hoursUsed, p.id, p.totalEnergyUsed, p.energyType)" + 
										"from Product p where p.account.id LIKE :userID")
									.setParameter("userID", userId);
		return query.getResultList();
	}
	public Account getUser(String userName) {
		Query query = em.createQuery("Select u from Account u where u.userName LIKE :userName")
				.setParameter("userName", userName)
				.setMaxResults(1);
			return (Account) query.getSingleResult();
	}

	public boolean checkForUser(String userName) {
		Query query = em.createQuery("Select u from Account u where u.userName LIKE :userName")
				.setParameter("userName", userName)
				.setMaxResults(1);
		if(query.getResultList().size() == 0) {
			System.out.println("inside AccountRepository, if statement has returned : " + query.getResultList().size());
			return false;
		}else 
			System.out.println("query passed if statement, is in else statement and returning " + query.getResultList().size());
			return true; 
			
	}
}