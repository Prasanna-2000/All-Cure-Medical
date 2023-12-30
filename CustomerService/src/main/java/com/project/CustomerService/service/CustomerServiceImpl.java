package com.project.CustomerService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.project.CustomerService.bean.Customer;
import com.project.CustomerService.bean.CustomerDTO;
import com.project.CustomerService.dao.CustomerDao;




@Repository
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public void customerSave(CustomerDTO customerDTO) {
		Customer customer = new Customer(customerDTO);
		customerDao.customerSave(customer);
	}

	@Override
	public List<CustomerDTO> findAll() {
		List<CustomerDTO> customerDTOList = new ArrayList<>();
		for(Customer customer:customerDao.findAll()) {
			CustomerDTO customerDTO = new CustomerDTO(customer);
			customerDTOList.add(customerDTO);
		}
		return customerDTOList;
	}

	@Override
	public CustomerDTO findById(Long id) {
		return new CustomerDTO(customerDao.findById(id));
	}

	@Override
	public void deleteCustomer(Long id) {
		customerDao.deleteCustomer(id);
	}
	


}
