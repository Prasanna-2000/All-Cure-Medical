package com.project.AllCureMedical.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.AllCureMedical.api.CustomerApi;
import com.project.AllCureMedical.api.OrderApi;
import com.project.AllCureMedical.api.UsersApi;
import com.project.AllCureMedical.bean.CustomerDTO;
import com.project.AllCureMedical.bean.Demouser;
import com.project.AllCureMedical.bean.SalesPersonDTO;
import com.project.AllCureMedical.bean.UsersDTO;
import com.project.AllCureMedical.service.DemouserService;


@RestController
public class LoginController {
	@Autowired
	 private BCryptPasswordEncoder bCrypt;
	@Autowired
	private  DemouserService service;
	@Autowired
	private  UsersApi usersApi;
	@Autowired
	private OrderApi orderApi;
	@Autowired
	private CustomerApi customerApi;
	
	
	@GetMapping(value="/register")
	public ModelAndView showUserRegistry(Model model) {
	     UsersDTO users=new UsersDTO();
	     ModelAndView mv=new  ModelAndView("registerUserPage");
	     mv.addObject("userRecord",users);
		return mv;
	}
	
	@PostMapping(value="ui/registerSuper")
	public ModelAndView saveSUser(@ModelAttribute("userRecord")  UsersDTO usersDTO) {
		String encodedPassword = bCrypt.encode(usersDTO.getPassword()); // encryptes the password
		Demouser newUser=new Demouser();
		String id=usersApi.getnewSuperId();
        newUser.setUsername(id);
        newUser.setPassword(encodedPassword);
        newUser.setType(usersDTO.getUserType());
        service.save(newUser,usersDTO.getEmail());
		return new ModelAndView("redirect:/ui/users");
	}
	
	@PostMapping(value="ui/registerOrdinary")
	public ModelAndView saveOUser(@RequestParam(name="password") String password,
			@RequestParam(name="email") String email,
			@RequestParam(name="name") String name,
			@RequestParam(name="address") String address,
			@RequestParam(name="cnumber") Long cnumber
			) {
		String encodedPassword = bCrypt.encode(password); // encryptes the password
		String id=customerApi.generateCnr();
		
		Demouser newUser=new Demouser();
        newUser.setUsername(id);
        newUser.setPassword(encodedPassword);
        newUser.setType("Ordinary");
        service.save(newUser,email);
        
        CustomerDTO customer=new CustomerDTO();
        customer.setCnr(Long.parseLong(id));
        customer.setCustomerName(name);
        customer.setCustomerAddress(address);
        customer.setContactNumber(cnumber);
        customer.setEmail(email);
        customer.setStatus("Cleared");
        customerApi.saveCustomer(customer);
        
        
		return new ModelAndView("redirect:/ui/users");
	}
	
	@PostMapping(value="ui/registerSp")
	public ModelAndView saveSpUser(@RequestParam(name="password") String password,
			@RequestParam(name="email") String email,
			@RequestParam(name="name") String name
			) {
		String encodedPassword = bCrypt.encode(password); // encryptes the password
		String id=orderApi.getNewSalesPersonId();
		
		Demouser newUser=new Demouser();
        newUser.setUsername(id);
        newUser.setPassword(encodedPassword);
        newUser.setType("Salesperson");
        service.save(newUser,email);
        
        SalesPersonDTO salesPerson=new SalesPersonDTO();
        salesPerson.setSalesPersonId(id);
        salesPerson.setName(name);
        salesPerson.setComission(0);
        orderApi.saveSalesPerson(salesPerson);
        
        
		return new ModelAndView("redirect:/ui/users");
	}

	
//	@GetMapping(value="/loginpage")
//	 public ModelAndView showLoginPage(@RequestParam("username") String s) {
//		Boolean error = false;
//		UsersDTO udto = usersApi.findUserById(s);
//		if(udto.getUsername().equalsIgnoreCase(s))
//			error= true;
//		 ModelAndView mv = new ModelAndView("loginPage");
//		 mv.addObject("error",error);
//		 return mv;
//	 }
	
	@GetMapping(value="/loginpage")
	public ModelAndView showLoginPage() {
		return new ModelAndView("loginPage");
	}
	
	 @GetMapping(value="/loginerror")
	 public ModelAndView showErrorPage() {
		 return new ModelAndView("errorPage");
	 }
}
