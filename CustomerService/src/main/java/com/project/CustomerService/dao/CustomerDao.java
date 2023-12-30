package com.project.CustomerService.dao;

import java.util.List;

import com.project.CustomerService.bean.Customer;


public interface CustomerDao {

	public void customerSave(Customer customer);
	public Long generatecnr();
	public List<Customer> findAll();
	public Customer findById(Long id);
	public void deleteCustomer(Long id);
	
	
}
