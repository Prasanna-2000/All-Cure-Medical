package com.gl.orderService.service;

import java.util.List;

import com.gl.orderService.bean.BillDTO;


public interface BillService {
	
	public void billSave(BillDTO billDTO);
	public List<BillDTO> findAllBills();
	public BillDTO findABill(Long id);
	public void billDelete(Long id);
	public List<BillDTO> findSalesPersonBills(String salespersonId);

}
