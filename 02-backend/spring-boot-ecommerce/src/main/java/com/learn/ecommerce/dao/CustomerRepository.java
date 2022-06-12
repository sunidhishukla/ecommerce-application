package com.learn.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
}
