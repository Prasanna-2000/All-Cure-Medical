package com.gl.orderService.controller;

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

import com.gl.orderService.bean.SalesPerson;
import com.gl.orderService.bean.SalesPersonDTO;
import com.gl.orderService.dao.SalesPersonDao;
import com.gl.orderService.service.SalesPersonService;

@RequestMapping("salesPerson")
@RestController
public class SalesPersonRestController {
	@Autowired
	private SalesPersonService service;
	
	@GetMapping(value="all-salesPersons", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SalesPersonDTO> displayAllSalesPerson() {
		return service.DisplayAllSalesPerson();
	}
	
	@PostMapping(value = "saveSalesPerson", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveSalesPerson(@RequestBody SalesPersonDTO newspDto) {
//		newspDto.setSalesPersonId("S" + service.generateId()); //generate id
		newspDto.setComission(0);
		service.salesPersonSave(newspDto);
		return "new sales person saved";
	}
	
	@GetMapping(value = "findSalesPerson/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public SalesPersonDTO findSalesPersonById(@PathVariable String id){
		return service.findSalesPersonById(id);
	}
	
	@DeleteMapping(value = "deleteSalesPerson/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteSalesPerson(@PathVariable String id) {
		service.deleteSalesPerson(id);
		return "sales person deleted";
	}
	
	//directly saved the dto object
	@PutMapping(value = "editComission", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String editComission(@RequestBody SalesPersonDTO newspDto) {
		SalesPersonDTO sdto= service.findSalesPersonById(newspDto.getSalesPersonId());
		sdto.setComission(newspDto.getComission());
		service.salesPersonSave(sdto);
		return "Comission updated";
	}
	
	@GetMapping(value="getNewSpId", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getNewSalesPersonId() {
		return "S"+ service.generateId();
	}
}
