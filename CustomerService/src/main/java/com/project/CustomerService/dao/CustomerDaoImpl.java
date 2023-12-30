package com.project.CustomerService.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.project.CustomerService.bean.Customer;


@Repository
@Service
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private CustomerRepository repository;

	@Override
	public void customerSave(Customer customer) {
		// Customer customer = new Customer(customer);
		repository.save(customer);

	}

	@Override
	public Long generatecnr() {

		Long val = repository.findMaxcnr();
		if (val == null)
			val = 123456781L;
		else
			val = val + 1;
		return val;
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> cusList = repository.findAll();
		/*
		 * List<CustomerDTO> cusDTOList = new ArrayList<>(); for(Customer
		 * customer:cusList) { CustomerDTO customerDTO = new CustomerDTO(customer);
		 * cusDTOList.add(customerDTO); }
		 */
		return cusList;
	}

	
	  @Override public Customer findById(Long id) { 
		  Customer customer =repository.getById(id); 
	
	  return customer; 
	  }

	@Override
	public void deleteCustomer(Long id) {

		repository.deleteById(id);;		
	}
	 
}
