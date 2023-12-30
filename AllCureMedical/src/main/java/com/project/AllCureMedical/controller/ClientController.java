package com.project.AllCureMedical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.AllCureMedical.api.CustomerApi;
import com.project.AllCureMedical.api.OrderApi;
import com.project.AllCureMedical.api.ProductApi;
import com.project.AllCureMedical.bean.BillDTO;
import com.project.AllCureMedical.bean.CustomerDTO;
import com.project.AllCureMedical.bean.ProductsDTO;
import com.project.AllCureMedical.bean.SalesPersonDTO;
import com.project.AllCureMedical.bean.WholesaleOrderDTO;


@RequestMapping("client")
@RestController
public class ClientController {
	@Autowired
	private CustomerApi customerApi;
	
	@Autowired
	private OrderApi orderApi;
	
	@Autowired
	private ProductApi productApi;
	
	@GetMapping("/customers")
	public List<CustomerDTO> showAllCustomers()
	{
		return customerApi.findAll();
	}
	
//	@GetMapping("/wbills")
//	public List<WholesaleOrderDTO> showAllWbills()
//	{
//		return orderApi.showAllWBills();
//	}
	
	@GetMapping("/findPendingWbill/{id}")
	public List<WholesaleOrderDTO> findPendingWByCnr(@PathVariable long id){
		return orderApi.findPendingWByCnr(id);
	}
	
	@GetMapping("/rbills")
	public List<BillDTO> showAllRbills()
	{
		return orderApi.showAllRBills();
	}
	
	@GetMapping("/spersons")
	public List<SalesPersonDTO> showAllSPersons()
	{
		return orderApi.displayAllSalesPerson();
	}
	
	@GetMapping("/products")
	public List<ProductsDTO> showAllProducts()
	{
		return productApi.showAllProduct();
	}
}
