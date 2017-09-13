package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerFactoryImpl implements CustomerFactory{

	@Autowired
	JapaneseCustomer japaneseCustomer;
	@Autowired
	ChineseCustomer chineseCustomer;
	@Autowired
	NepaliCustomer nepaliCustomer;
	
	@Override
	public CustomerSpeak getCustomer(String type) {
		switch(type.toLowerCase()){
		
		case "japanese":
			return japaneseCustomer;
			
		case "chinese":
			return chineseCustomer;
			
		case "nepali":
			return nepaliCustomer;
			
		default:
			return null;
		}
	}

}
