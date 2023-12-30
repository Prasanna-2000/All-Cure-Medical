// //http://localhost:8080/swagger-ui.html
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

import com.gl.orderService.bean.BillDTO;
import com.gl.orderService.dao.BillDao;
import com.gl.orderService.service.BillService;


@RequestMapping("rbills")
@RestController
public class BillRestController {
	
	@Autowired
	private BillDao billDao;
	
	@Autowired
	private BillService billService;
	
	@GetMapping(value="/all-rbills",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<BillDTO> showAllRBills() {
		return billService.findAllBills();
	}
	
	@GetMapping(value="/find-rbill/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public BillDTO findRById(@PathVariable long id) {
		return billService.findABill(id);
	}
	
	@GetMapping(value="/find-salesPersonBills/{salespersonId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<BillDTO> findAllSalesPersonBills(@PathVariable String salespersonId) {
		return billService.findSalesPersonBills(salespersonId);
	}
	
	@PostMapping(value="/add-rbill",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String saveRBill(@RequestBody BillDTO billDTO) {
		long bNo = billDao.generateId();
		billDTO.setBillNo(bNo);
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
		String str = formatter.format(date);
		billDTO.setBookingDate(str);
		billDTO.setAmount((billDTO.getQuantity())*(billDTO.getRate()));
		billService.billSave(billDTO);
		return "Bill Saved";
	}
	
	@DeleteMapping(value="/delete-rbill/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public String deleteRById(@PathVariable long id) {
		billService.billDelete(id);
		return "Bill Deleted";
	}
	
	@PutMapping(value="/edit-rbill",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String editRBill(@RequestBody BillDTO billDTO) {
		long id = billDTO.getBillNo();
		//String name = billDTO.getName();
		//String pId = billDTO.getProductId();
		//
		int quant = billDTO.getQuantity();
		//Integer price = rate*quant;
		//String sId = billDTO.getSalespersonId();
		//String date = billDTO.getBookingDate();
		//int rate = billDTO.getRate();
		BillDTO bill = billService.findABill(id);
//		bill.setBillNo(id);
//		bill.setName(name);
//		bill.setProductId(pId);
//		bill.setRate(rate);
		int rateNew = bill.getRate();
		bill.setQuantity(quant);
		bill.setAmount(rateNew*quant);
//		bill.setSalespersonId(sId);
//		bill.setBookingDate(date);
		billService.billSave(bill);
		return "Bill Updated";
	}
}
