package com.example.demo.service;

import org.springframework.stereotype.Component;

public interface CustomerFactory {
	public CustomerSpeak getCustomer(String type);
}
