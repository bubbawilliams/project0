package com.revature.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.bank.model.customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}