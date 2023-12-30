package com.gl.orderService.dao;

import java.util.List;

import com.gl.orderService.bean.Bill;


public interface BillDao {
	
	public void billSave(Bill bill);
	public Long generateId();
	public List<Bill> findAllBills();
	public Bill findABill(Long id);
	public void billDelete(Long id);
	public List<Bill> findSalesPersonBills(String salespersonId);
}
