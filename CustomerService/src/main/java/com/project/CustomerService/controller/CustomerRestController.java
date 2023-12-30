//http://localhost:6262/swagger-ui.html
package com.project.CustomerService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.CustomerService.bean.CustomerDTO;
import com.project.CustomerService.dao.CustomerDao;
import com.project.CustomerService.service.CustomerService;


  
@RequestMapping("/customers")
@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private CustomerDao customerDao;

	@GetMapping(value = "/all-customers", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CustomerDTO> findAll() {
		return customerService.findAll();
	}

	@GetMapping(value = "/customer/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerDTO findById(@PathVariable long id) {
		return customerService.findById(id);
	}

	@PostMapping(value = "/add-customer", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveCustomer(@RequestBody CustomerDTO customerDTO) {
//		long cn = customerDao.generatecnr();
//		customerDTO.setCnr(cn);
		customerDTO.setStatus("Cleared");
		customerService.customerSave(customerDTO);
		return "Customer Saved";
	}

	@DeleteMapping(value="delete-customer/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public String Delete(@PathVariable Long id) {
		customerService.deleteCustomer(id);
		return "Customer Deleted";
	}
	
	@PutMapping(value = "/edit-customer", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String editCust(@RequestBody CustomerDTO customerDTO) {
		long id = customerDTO.getCnr();
//		String name = customerDTO.getCustomerName();
//		String add = customerDTO.getCustomerAddress();
//		long Cno = customerDTO.getContactNumber();
//		String em = customerDTO.getEmail();
		String st = customerDTO.getStatus();

		CustomerDTO customer = customerService.findById(id);
		customer.setCnr(id);
//		customer.setCustomerName(name);
//		customer.setCustomerAddress(add);
//		customer.setContactNumber(Cno);
//		customer.setEmail(em);
		customer.setStatus(st);
		customerService.customerSave(customer);
		return "Customer Updated";
	}
	
	@GetMapping(value = "/getNewcnr", produces=MediaType.APPLICATION_JSON_VALUE)
	public String generateCnr() {
		return String.valueOf(customerDao.generatecnr());
	}
}