package com.gl.orderService.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
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

import com.gl.orderService.bean.WholesaleOrderDTO;
import com.gl.orderService.service.WholesaleOrderService;

@RequestMapping("/wbills")
@RestController
public class WholesaleOrderRestController {

	@Autowired
	private WholesaleOrderService wholesaleOrderService;
	
	@GetMapping(value = "/all-wbills",produces =MediaType.APPLICATION_JSON_VALUE )
	public List<WholesaleOrderDTO> showAllWBills(){
		return wholesaleOrderService.findAllWholesaleOrder();
	}
	
	@GetMapping(value = "/findWbill/{id}",produces =MediaType.APPLICATION_JSON_VALUE )
	public WholesaleOrderDTO findWById(@PathVariable long id){
		return wholesaleOrderService.findAWholesaleOrder(id);
	}
	
	@GetMapping(value = "/findPendingWbill/{id}",produces =MediaType.APPLICATION_JSON_VALUE )
	public List<WholesaleOrderDTO> findPendingWByCnr(@PathVariable long id){
		return wholesaleOrderService.findPendingByCnr(id);
	}
	
	@DeleteMapping(value = "/delete-wbill/{id}",produces =MediaType.APPLICATION_JSON_VALUE )
	public String deleteWById(@PathVariable long id){
		wholesaleOrderService.deleteAWholesaleOrder(id);
		return "WholesaleOrder Deleted";
	}
	
	@PostMapping(value = "/add-wbill",consumes =MediaType.APPLICATION_JSON_VALUE )
	public String saveWBill(@RequestBody WholesaleOrderDTO wholesaleOrderDTO){
		Long id=wholesaleOrderService.generateId();
		wholesaleOrderDTO.setOrderNo(id);
		wholesaleOrderDTO.setAmount((wholesaleOrderDTO.getQuantity())*(wholesaleOrderDTO.getRate()));
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
		String str = formatter.format(date);
		wholesaleOrderDTO.setBookingDate(str);
		wholesaleOrderDTO.setStatus("pending");
		wholesaleOrderService.wholesaleOrderSave(wholesaleOrderDTO);
		return "WholesaleOrder saved";
	}
	
	@PutMapping(value="/edit-wbill",consumes = {MediaType.APPLICATION_JSON_VALUE})
	public String editWBill(@RequestBody WholesaleOrderDTO wholesaleOrderDTO) {
		long id=wholesaleOrderDTO.getOrderNo();
//		long cnr=wholesaleOrderDTO.getCnr();
//		String productId=wholesaleOrderDTO.getProductId();
//		Integer rate=wholesaleOrderDTO.getRate();
		Integer quantity=wholesaleOrderDTO.getQuantity();
		//Integer amount=rate*quantity;
		String status=wholesaleOrderDTO.getStatus();
		//String bookingDate=wholesaleOrderDTO.getBookingDate();
		WholesaleOrderDTO order=wholesaleOrderService.findAWholesaleOrder(id);
//		order.setCnr(cnr);
//		order.setProductId(productId);
//		order.setRate(rate);
		order.setQuantity(quantity);
		order.setAmount(order.getRate()*quantity);
		order.setStatus(status);
//		order.setBookingDate(bookingDate);
		wholesaleOrderService.wholesaleOrderSave(order);	
		return "WholesaleOrder Updated successfully";
	}
	
}
