package com.csv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csv.dao.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	
	

}
