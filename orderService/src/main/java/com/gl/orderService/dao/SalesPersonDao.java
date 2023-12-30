package com.gl.orderService.dao;

import java.util.List;

import com.gl.orderService.bean.SalesPerson;

public interface SalesPersonDao {
	public void salesPersonSave(SalesPerson salesPerson);
	public Integer generateId();
	public List<SalesPerson> DisplayAllSalesPerson();
	public SalesPerson findSalesPersonById(String id);
	public void deleteSalesPerson(String id);
}
