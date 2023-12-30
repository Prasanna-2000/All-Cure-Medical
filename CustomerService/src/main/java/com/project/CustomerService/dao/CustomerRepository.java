package com.project.CustomerService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.CustomerService.bean.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
	@Query("select max(cnr) from Customer")
	public Long findMaxcnr();
}
