package com.project.AllCureMedical.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.AllCureMedical.bean.CustomerDTO;


@FeignClient(name="CUSTOMER-SERVICE")
public interface CustomerApi {
	@GetMapping("customers/all-customers")
	public List<CustomerDTO> findAll();
	@GetMapping("customers/customer/{id}")
	public CustomerDTO findById(@PathVariable long id);
	@PostMapping("/customers/add-customer")
	public String saveCustomer(@RequestBody CustomerDTO customerDTO);
	@DeleteMapping("customers/delete-customer/{id}")
	public String Delete(@PathVariable Long id);
	@PutMapping("/customers/edit-customer")
	public String editCust(@RequestBody CustomerDTO customerDTO);
	@GetMapping(value = "/customers/getNewcnr")
	public String generateCnr();
}
