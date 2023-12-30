package com.gl.orderService.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.orderService.bean.SalesPerson;

@Service
public class SalesPersonDaoImpl implements SalesPersonDao{
	@Autowired
	private SalesPersonRepository repository;
	
	@Override
	public void salesPersonSave(SalesPerson salesPerson) {
		repository.save(salesPerson);
	}

	@Override
	public Integer generateId() {
		Integer val = repository.findMaxSalesPersonId();
		if(val == null)
			val = 1001;
		else
			val = val + 1;
		return val;
	}

	@Override
	public List<SalesPerson> DisplayAllSalesPerson() {
		List<SalesPerson> salesPersonList = repository.findAll();
		return salesPersonList;
	}

	@Override
	public SalesPerson findSalesPersonById(String id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void deleteSalesPerson(String id) {
		repository.deleteById(id);
	}

}
