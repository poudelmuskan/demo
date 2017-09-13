package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerFactory;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerFactory customerFactory;
	
	@RequestMapping("/{type}")
	public void getAllSortsOfCustomers(@PathVariable String type){
		Customer customer = new Customer();
		customer.setName(type+" guy");
		this.customerFactory.getCustomer(type).speak(customer);
	}
	
}
