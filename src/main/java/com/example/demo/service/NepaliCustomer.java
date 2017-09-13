package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Customer;

@Component("nepali")
public class NepaliCustomer implements CustomerSpeak {

	@Override
	public void speak(Customer customer) {
		System.out.println("नमस्कार मेरो नाम हो "+ customer.getName());
	}

}
