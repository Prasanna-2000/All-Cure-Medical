//package com.gl.orderService.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.gl.orderService.bean.SalesPerson;
//import com.gl.orderService.dao.SalesPersonDao;
//
//@RequestMapping("salesPerson")
//@RestController
//public class SalesPersonController {
//	@Autowired
//	private SalesPersonDao dao;
//	
//	@GetMapping("viewSalesPerson")
//	public  ModelAndView showSalesPersonView() {
////		Integer lid = dao.generateId();
////		SalesPerson sp = new SalesPerson(lid, "name", 1000);
////		dao.salesPersonSave(sp);
//		
//		List<SalesPerson> salesPersonList = dao.DisplayAllSalesPerson();
//		ModelAndView mv = new ModelAndView("salesPersonView");
//		mv.addObject("salesPersonList", salesPersonList);
//		return mv;
//	}
//	
//	@GetMapping("comissionEdit/{id}")
//	public ModelAndView showEidtComission(@PathVariable String id) {
//		SalesPerson sp = dao.findSalesPersonById(id);
//		ModelAndView mv = new ModelAndView("comissionEdit");
//		mv.addObject("salesPersonRecord", sp);
//		return mv;
//	}
//	
//	@PostMapping("comissionEdit/editComission")
//	public ModelAndView editComission(@ModelAttribute("salesPersonRecord") SalesPerson salesPerson) {
//		dao.salesPersonSave(salesPerson);
//		return new ModelAndView("redirect:/viewSalesPerson");
//	}
//}
