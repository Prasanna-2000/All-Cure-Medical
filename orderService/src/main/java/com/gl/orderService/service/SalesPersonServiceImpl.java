package com.gl.orderService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.orderService.bean.SalesPerson;
import com.gl.orderService.bean.SalesPersonDTO;
import com.gl.orderService.dao.SalesPersonDao;

@Service
public class SalesPersonServiceImpl implements SalesPersonService {
	@Autowired
	private SalesPersonDao salesPersonDao;

	@Override
	public void salesPersonSave(SalesPersonDTO salesPersonDto) {
		SalesPerson sp = new SalesPerson(salesPersonDto);
		salesPersonDao.salesPersonSave(sp);
	}

	@Override
	public Integer generateId() {
		Integer val = salesPersonDao.generateId();
		return val;
	}

	@Override
	public List<SalesPersonDTO> DisplayAllSalesPerson() {
		List<SalesPersonDTO> salesPersonDtoList = new ArrayList<>();
		for(SalesPerson sp: salesPersonDao.DisplayAllSalesPerson()) {
			SalesPersonDTO spdto = new SalesPersonDTO(sp);
			salesPersonDtoList.add(spdto);
		}
		return salesPersonDtoList;
	}

	@Override
	public SalesPersonDTO findSalesPersonById(String id) {
		SalesPerson sp = salesPersonDao.findSalesPersonById(id);
		SalesPersonDTO spdto = new SalesPersonDTO(sp);
		return spdto;
	}

	@Override
	public void deleteSalesPerson(String id) {
		salesPersonDao.deleteSalesPerson(id);
	}

}
