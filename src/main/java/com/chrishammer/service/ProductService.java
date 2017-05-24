
package com.chrishammer.service;

import java.util.List;

import com.chrishammer.model.Appliance;
import com.chrishammer.model.Product;

public interface ProductService {

	List<Appliance> findAllProducts();

	Product getProduct(Product product);
	
	Product save(Product input);

	List<Product> displayAllProducts();

	boolean removeProduct(long id);
}