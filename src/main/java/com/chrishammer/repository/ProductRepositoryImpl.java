
package com.chrishammer.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.chrishammer.model.Appliance;
import com.chrishammer.model.Product;

@Repository("productRepository")
public class ProductRepositoryImpl implements ProductRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Product save(Product input) {
		em.persist(input);
		em.flush();
		
		return input;
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> loadAll() {
		Query query = em.createQuery("select h from Product h");
			
		@SuppressWarnings("rawtypes")
		List products = query.getResultList();
		
		return products;
	}

	
	@SuppressWarnings("unchecked")
	public List<Appliance> loadData() {
		Query query = em.createQuery("select a from Appliance a");
		@SuppressWarnings("rawtypes")
		List appliances = query.getResultList();
		
		return appliances;
	}
	@SuppressWarnings("unchecked")
	public List<Product> loadUserList(long userId) {
		
			Query query = em.createQuery("Select p from Product p where p.account.id LIKE :userID")
				.setParameter("userID", userId);
			
			return query.getResultList();
		}

	public boolean removeProduct(long id) {		
		int isSuccessful = em.createQuery("Delete Product p where p.id LIKE :productId")
				.setParameter("productId", id)
				.executeUpdate();
		 if(isSuccessful == 0){
			 return false;
		 }
		 else return true;
		
	}
}