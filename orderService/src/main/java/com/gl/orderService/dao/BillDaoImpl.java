package com.gl.orderService.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.orderService.bean.Bill;


@Service
public class BillDaoImpl implements BillDao {
	
	@Autowired
	private BillRepository billRepository;
	
	@Override
	public void billSave(Bill bill) {
		billRepository.save(bill);
	}

	@Override
	public Long generateId() {
		Long val = billRepository.findMaxBillId();
		if(val==null)
			val=124568921L;
		else
			val=val+1;
		return val;
	}

	@Override
	public List<Bill> findAllBills() {
		List<Bill> billsList = billRepository.findAll();
		return billsList;
	}

	@Override
	public Bill findABill(Long id) {
		Bill bill = billRepository.getById(id);
		return bill;
	}
	
	@Override
	public void billDelete(Long id) {
		billRepository.deleteById(id);
	}

	@Override
	public List<Bill> findSalesPersonBills(String salespersonId) {
		return billRepository.showSalesPersonBills(salespersonId);
	}

}
