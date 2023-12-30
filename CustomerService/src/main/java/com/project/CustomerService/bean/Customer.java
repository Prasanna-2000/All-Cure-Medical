package com.project.CustomerService.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private Long cnr;
	private String customerName;
	private String customerAddress;
	private Long contactNumber;
	private String email;
	private String status;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Long cnr, String customerName, String customerAddress, Long contactNumber, String email,
			String status) {
		super();
		this.cnr = cnr;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.contactNumber = contactNumber;
		this.email = email;
		this.status = status;
	}

	public Customer(CustomerDTO customerDTO) {
		this.cnr=customerDTO.getCnr();
		this.customerName=customerDTO.getCustomerName();
		this.customerAddress=customerDTO.getCustomerAddress();
		this.contactNumber=customerDTO.getContactNumber();
		this.email=customerDTO.getEmail();
		this.status=customerDTO.getStatus();
	}

	public Long getcnr() {
		return cnr;
	}
	public void setcnr(Long cnr) {
	this.cnr=cnr;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
