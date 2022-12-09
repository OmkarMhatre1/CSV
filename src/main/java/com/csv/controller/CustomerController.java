package com.csv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csv.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	
	//@RequestMapping(path="feedCustomerData")
	@GetMapping("/customer")
	public void setDataDB() {
	service.saveCustomerData();
	}
}
