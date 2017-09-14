package com.example.demo.config;

import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.CustomerFactory;

@Configuration
public class CustomerFactoryConfig {

	@Bean
	public ServiceLocatorFactoryBean customerFactory() {
		ServiceLocatorFactoryBean locator = new ServiceLocatorFactoryBean();
		locator.setServiceLocatorInterface(CustomerFactory.class);
		return locator;
	}
	
}
