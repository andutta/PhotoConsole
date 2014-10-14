package com.aspect.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerBo customerBo;
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String getCustomer(){
		
		customerBo.addCustomer();
		
		return "customer";
		
	}
	

}
