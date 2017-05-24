
package com.chrishammer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chrishammer.service.ProductService;


@Controller
public class EditListController {

	@Autowired
	private ProductService productService;
	
	//@RequestMapping(value="/edit", method=RequestMethod.GET)
	//public String editEntry() {
	//	return "redirect:selection.html";
	//}
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteEntry(@RequestParam("id")int id) {
		System.out.println(productService.removeProduct(id));
		return "redirect:selection.html";
		
	}
}