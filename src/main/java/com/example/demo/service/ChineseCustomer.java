package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Customer;

@Component("chinese")
public class ChineseCustomer implements CustomerSpeak {

	@Override
	public void speak(Customer customer) {
		System.out.println("你好我的名字是 "+ customer.getName());
		
	}

}
