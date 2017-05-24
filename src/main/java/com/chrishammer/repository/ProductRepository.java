
package com.chrishammer.repository;

import java.util.List;

import com.chrishammer.model.Appliance;
import com.chrishammer.model.Product;

public interface ProductRepository {

		Product save(Product input);
			
		List<Product> loadAll();

		List<Appliance> loadData();

		List<Product> loadUserList(long userID);  
		
		boolean removeProduct(long id);
			
}