
package com.chrishammer.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.chrishammer.model.Provider;

@Repository("CalculateRepository")
public class CalculateRepositoryImpl implements CalculateRepository {

	@PersistenceContext
	private EntityManager em;
	
	
	public Provider getProvider(String providerName) {
		Query query = em.createQuery("select p from Provider p where p.name LIKE :providerName")
				.setParameter("providerName", providerName)
				.setMaxResults(1);
		return (Provider) query.getSingleResult();
//		return query.getResultList();
	}

}