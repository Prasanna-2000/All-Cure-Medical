package com.project.AllCureMedical.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.AllCureMedical.bean.BillDTO;
import com.project.AllCureMedical.bean.SalesPersonDTO;
import com.project.AllCureMedical.bean.WholesaleOrderDTO;



@FeignClient(name="ORDER-SERVICE")
public interface OrderApi {
	@GetMapping("rbills/all-rbills")
	public List<BillDTO> showAllRBills();
	@GetMapping("rbills/find-rbill/{id}")
	public BillDTO findRById(@PathVariable long id);
	@PostMapping("rbills/add-rbill")
	public String saveRBill(@RequestBody BillDTO billDTO);
	@DeleteMapping("rbills/delete-rbill/{id}")
	public String deleteRById(@PathVariable long id);
	@PutMapping("rbills/edit-rbill")
	public String editRBill(@RequestBody BillDTO billDTO);
	@GetMapping("/find-salesPersonBills/{salespersonId}")
	public List<BillDTO> findAllSalesPersonBills(@PathVariable String salespersonId);
	
	@GetMapping("wbills/all-wbills")
	public List<WholesaleOrderDTO> showAllWBills();
	@GetMapping("wbills/findWbill/{id}")
	public WholesaleOrderDTO findWById(@PathVariable long id);
	@PostMapping("wbills/add-wbill")
	public String saveWBill(@RequestBody WholesaleOrderDTO wholesaleOrderDTO);
	@DeleteMapping("wbills/delete-wbill/{id}")
	public String deleteWById(@PathVariable long id);
	@PutMapping("wbills/edit-wbill")
	public String editWBill(@RequestBody WholesaleOrderDTO wholesaleOrderDTO);
	@GetMapping("wbills/findPendingWbill/{id}")
	public List<WholesaleOrderDTO> findPendingWByCnr(@PathVariable long id);
	
	@GetMapping("salesPerson/all-salesPersons")
	public List<SalesPersonDTO> displayAllSalesPerson();
	@GetMapping("salesPerson/findSalesPerson/{id}")
	public SalesPersonDTO findSalesPersonById(@PathVariable String id);
	@PostMapping("salesPerson/saveSalesPerson")
	public String saveSalesPerson(@RequestBody SalesPersonDTO newspDto);
	@DeleteMapping("salesPerson/deleteSalesPerson/{id}")
	public String deleteSalesPerson(@PathVariable String id);
	@PutMapping("salesPerson/editComission")
	public String editComission(@RequestBody SalesPersonDTO newspDto);
	@GetMapping(value="salesPerson/getNewSpId")
	public String getNewSalesPersonId();
	
}
