
package com.chrishammer.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.chrishammer.model.Account;
import com.chrishammer.model.AccountReport;
import com.chrishammer.model.Appliance;
import com.chrishammer.model.Product;
import com.chrishammer.service.AccountService;
import com.chrishammer.service.ProductService;

@Controller
@SessionAttributes({"choice" , "userName"})
public class AddProductsController {
	@Autowired
	private ProductService productService;
	@Autowired
	private AccountService accountService;
	
	private boolean listExists;


	@RequestMapping(value="/selection", method=RequestMethod.GET)
	public String getProducts(@ModelAttribute ("product") Product product, Model model,@ModelAttribute("userName") Account user) {
		
		List<AccountReport> accountReports = accountService.displayAllAccountReports(user.getId());
		
		if( accountReports.size() > 0) {						
			listExists = true;
		}else listExists = false;
		
		model.addAttribute("product", product);										//Declares a variable for form to post to. 
		model.addAttribute("accountReports", accountReports);						//Retrieves any data from a previous session conducted by user.
		model.addAttribute("listExists", listExists);								//Used by jQuery to determin if the accordian should be displayed by default.
	return "addProducts";
	}
	
	@RequestMapping(value="/selection", method=RequestMethod.POST)
	public String submitProducts(@Valid Product product, BindingResult result, HttpSession session, Model model) {	
		if(result.hasErrors() ){
			return "addProducts";
		} 
		else if(product.getHoursUsed()==0){
			return "addProducts";
		}
		for (int i = 0 ; i < product.getAmountOwned() ; i++) {
			Product selection = productService.getProduct(product);					//neccesary because the model only returns values entered by form. Using this I can access data preset in DB and create a more complex object. 
			Account account = (Account) session.getAttribute("userName");			
			selection.setAccount(account);											//linking choices to current household
			productService.save(selection);											//saving the product to database, recovered from the choice from dropdown.
		}
		
	return "redirect:selection.html";
	
	}
	@RequestMapping(value="/data", method=RequestMethod.GET)
	public @ResponseBody List<Appliance> createList(Model model) {					//populating the dropdown list with preset products.		
		return productService.findAllProducts();	
	}
	@RequestMapping(value="/help")
	public String helpMe() {
		return "helpMe";	
	}
}