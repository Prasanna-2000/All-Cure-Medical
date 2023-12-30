//package com.gl.Product.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.gl.Product.bean.Products;
//import com.gl.Product.bean.ProductsDTO;
//import com.gl.Product.dao.ProductsDao;
//
//@RestController
//public class ProductController {
//	@Autowired
//	public ProductsDao pdao;
//	@GetMapping("/pEntry")
//	public ModelAndView entrypage()
//	{
//		Products p=new Products();
//		ModelAndView g =new ModelAndView("productEntry");
//		g.addObject("ProductRecord",p);
//		return g;
//		
//	}
//	
//	@PostMapping("/productSave")
//	public ModelAndView saveProduct(@ModelAttribute("ProductRecord") Products p)
//	{
//		pdao.SaveProduct(p);
//		List<ProductsDTO> list=pdao.findProduct();
//		ModelAndView g =new ModelAndView("productView");
//		
//		g.addObject("productList",list);
//		return g;
//		
//		
//	}
//	@GetMapping("editProduct/{id}")
//	public ModelAndView showEditPage(@PathVariable String id) {
//		ProductsDTO products = pdao.findProductById(id);
//		ModelAndView mv = new ModelAndView("edit");
//		mv.addObject("shareRecord", products);
//		return mv;
//	}
//	
//	@PostMapping("editProduct/proEdit")
//	public ModelAndView editCustomer(@ModelAttribute("shareRecord") Products products) {
//		
//	//Products s=new Products(products);
//		pdao.SaveProduct(products);
//		return new ModelAndView("Flush");
//	}
//
//}
