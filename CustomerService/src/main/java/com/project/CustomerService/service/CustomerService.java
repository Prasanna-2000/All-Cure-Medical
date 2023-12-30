package com.project.CustomerService.service;

import java.util.List;

import com.project.CustomerService.bean.CustomerDTO;



public interface CustomerService {

	public void customerSave(CustomerDTO customerDTO) ;
	
	public List<CustomerDTO> findAll();
	public CustomerDTO findById(Long id);
	public void deleteCustomer(Long id);

	
}
	
