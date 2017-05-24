
package com.chrishammer.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chrishammer.model.Appliance;
import com.chrishammer.model.Product;
import com.chrishammer.repository.ProductRepository;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {
	private float daysPerMonth = (float)364/12;
	@Autowired
	private ProductRepository productRepository;
	
	public List<Appliance> findAllProducts () {
	  
	    List<Appliance> dbAppliances = new ArrayList<Appliance>();
	    dbAppliances = productRepository.loadData();  

	return dbAppliances;
	}
	
	public Product getProduct(Product product) {
		List<Appliance> dbAppliances = findAllProducts();
		Product selection = new Product();
		for(Appliance p: dbAppliances) {
			if (product.getName().equals(p.getModel())) {					// Matches the string returned with the correct product.
				float totalEnergy = (product.getHoursUsed()*p.getEnergyUsed())*daysPerMonth;
				selection.setEnergyUsed(p.getEnergyUsed());					// Takes values from correct product and saves into new object
				selection.setName(product.getName());
				selection.setAmountOwned(1);
				selection.setHoursUsed(product.getHoursUsed());
				selection.setEnergyType(p.getEnergyType());
				selection.setTotalEnergyUsed(totalEnergy);						//(product.getHoursUsed()*p.getEnergyUsed())*daysPerMonth)

			}
		}	
		return selection;
	}
	
	public Product save(Product input) {
		return productRepository.save(input);
	}

	public List<Product> displayAllProducts() {
		return productRepository.loadAll();
		
	}

	public boolean removeProduct(long id) {
		if (productRepository.removeProduct(id) == true) {
			return true;
		}
		else return false;
	}
	
	
	
	
	
	
	
}