package com.csv.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csv.dao.Customer;
import com.csv.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo repo;

	public void saveCustomerData() {

		//String path = "src/main/resources/Book1.csv";
		String line = "";

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/Book1.csv"));
			while ((line = bufferedReader.readLine()) != null) {
				String [] data = line.split(",");
				Customer customer=new Customer();
				customer.setName(data[0]);
				customer.setIssue(data[1]);
				customer.setIssueId(data[2]);
				customer.setAge(data[3]);
				repo.save(customer);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
