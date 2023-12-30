package com.gl.orderService.controller;
//package com.project.Order.controller;
//package com.project.WholesaleOrder.controller;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.project.WholesaleOrder.bean.WholesaleOrder;
//import com.project.WholesaleOrder.dao.WholesaleOrderDao;
//
//
////@ControllerAdvice
//@RestController
//public class WholesaleOrderController {
//	
//	@Autowired
//	private WholesaleOrderDao wholesaleOrderDaoService;
//	
//	@GetMapping("/index")
//	public ModelAndView showIndexPage()	
//	{
//		return new ModelAndView("index");
//	}
//	
//	@GetMapping("wholesaleOrder-entry")
//	public ModelAndView showWholesaleOrderEntryPage()
//	{
//		WholesaleOrder wholesaleOrder=new WholesaleOrder();
//		ModelAndView mv= new ModelAndView("wholesaleOrderEntryPage");
//		mv.addObject("wholesaleOrderRecord",wholesaleOrder);
//		return mv;
//	}
//	
//	@PostMapping("/wholesaleOrder-entry")
//	public ModelAndView saveNewWholesaleOrder(@ModelAttribute("wholesaleOrderRecord") WholesaleOrder wholesaleOrder)  {
//		Long id=wholesaleOrderDaoService.generateId();
//		wholesaleOrder.setOrderNo(id);
//		wholesaleOrder.setAmount((wholesaleOrder.getQuantity())*(wholesaleOrder.getRate()));
//		Date date = new Date();
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
//		String str = formatter.format(date);
//		wholesaleOrder.setBookingDate(str);
//		wholesaleOrderDaoService.wholesaleOrderSave(wholesaleOrder);
//		return new ModelAndView("redirect:/index");
//	}
//	
//	@GetMapping("/wholesaleOrder-display")
//	public ModelAndView showAllWholesaleOrderPage()	
//	{
//		ModelAndView mv=new ModelAndView("allWholesaleOrderView");
//		List<WholesaleOrder> wholesaleOrderList=wholesaleOrderDaoService.findAllWholesaleOrder();
//		mv.addObject("wholesaleOrderList",wholesaleOrderList);
//		return mv;
//	}
//	
//	@GetMapping("/display-a-wholesaleOrder")
//	public ModelAndView showIdEntryPage()	
//	{
//		return new ModelAndView("idEntryPage");
//	}
//	
//	@PostMapping("/display-a-wholesaleOrder")
//	public ModelAndView showACourses(@RequestParam("id") Long id)  {
//		WholesaleOrder wholesaleOrder=wholesaleOrderDaoService.findAWholesaleOrder(id);
//		ModelAndView mv= new ModelAndView("wholesaleOrderView");
//		mv.addObject("wholesaleOrder",wholesaleOrder);
//		return mv;
//	}
//	
//	@GetMapping("wholesaleOrder-edit")
//	public ModelAndView showIdEntryOrderEditPage()  {
//		return new ModelAndView("idEntryPage2");
//
//	}
//	
//	@GetMapping("wholesaleOrder-edit-id")
//	public ModelAndView showOrderEditPage(@RequestParam("id") Long id)  {
//		WholesaleOrder wholesaleOrder=wholesaleOrderDaoService.findAWholesaleOrder(id);
//		ModelAndView mv= new ModelAndView("wholesaleOrderEditPage");
//		mv.addObject("wholesaleOrder",wholesaleOrder);
//		return mv;
//	}
//	
//	@PostMapping("/wholesaleOrder-edit")
//	public ModelAndView editCourse(@ModelAttribute("wholesaleOrder") WholesaleOrder wholesaleOrder)  {
//		wholesaleOrder.setAmount((wholesaleOrder.getQuantity())*(wholesaleOrder.getRate()));
//		Date date = new Date();
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
//		String str = formatter.format(date);
//		wholesaleOrder.setBookingDate(str);
//		wholesaleOrderDaoService.wholesaleOrderSave(wholesaleOrder);
//		return new ModelAndView("redirect:/index");
//	}
//
//	
//	@GetMapping("/delete-wholesaleOrder")
//	public ModelAndView showIdEntryDeletePage()  {
//		return new ModelAndView("idEntryPage3");
//	}
//	
//	@GetMapping("/wholesaleOrder-delete-id")
//	public ModelAndView DeleteCourse(@RequestParam("id") long id)  {
//		wholesaleOrderDaoService.deleteAWholesaleOrder(id);
//		return new ModelAndView("redirect:/index");
//	}
//
//}
