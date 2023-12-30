//package com.project.CustomerService.controller;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.gl.customer.bean.Customer;
//import com.gl.customer.dao.CustomerDao;
//
//
//@RestController
//public class CustomerController {
//	@Autowired
//	private CustomerDao service;
//	
//	@GetMapping("index")
//	public ModelAndView show() {
//		ModelAndView mv = new ModelAndView("index");
//		List<Customer> cusList = service.findAll();
//		mv.addObject("cusList",cusList);
//		return mv;
//	}
//	
//	@GetMapping("customerEntry")
//	public ModelAndView showCompanyEntryPage() {
//		Customer company = new Customer();
//		ModelAndView mv = new ModelAndView("customerEntryPage");
//		mv.addObject("shareRecord", company);
//		return mv;
//	}
//	
//	@PostMapping("customer")
//	public ModelAndView addNew(@ModelAttribute("shareRecord") Customer customer) {
//		long id = service.generatecnr();
//		customer.setcnr(id);
//		
//		service.customerSave(customer);
//		return new ModelAndView("redirect:/index");
//	}
//	
//	
//	
//	@GetMapping("editCust/{id}")
//	public ModelAndView showEditPage(@PathVariable long id) {
//		Customer customer = service.findById(id);
//		ModelAndView mv = new ModelAndView("customeryEditPage");
//		mv.addObject("shareRecord", customer);
//		return mv;
//	}
//	
//	@PostMapping("editCust/Custedit")
//	public ModelAndView editCustomer(@ModelAttribute("shareRecord") Customer customer) {
//		service.customerSave(customer);
//		return new ModelAndView("redirect:/index");
//	}
//}
