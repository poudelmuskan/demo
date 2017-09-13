package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Customer;

@Component("japanese")
public class JapaneseCustomer implements CustomerSpeak {

	@Override
	public void speak(Customer customer) {
		System.out.println("こんにちは、私の名前は "+ customer.getName());
	}

}
