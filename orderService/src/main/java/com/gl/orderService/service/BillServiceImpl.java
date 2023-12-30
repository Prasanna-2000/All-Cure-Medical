package com.gl.orderService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gl.orderService.bean.Bill;
import com.gl.orderService.bean.BillDTO;
import com.gl.orderService.dao.BillDao;


@Repository
@Service
public class BillServiceImpl implements BillService {
	
	@Autowired
	private BillDao billDao;
	
	@Override
	public void billSave(BillDTO billDTO) {
		Bill bill = new Bill(billDTO);
		billDao.billSave(bill);
	}

	@Override
	public List<BillDTO> findAllBills() {
		List<BillDTO> billDTOList = new ArrayList<>();
		for(Bill bill:billDao.findAllBills()) {
			BillDTO billDTO = new BillDTO(bill);
			billDTOList.add(billDTO);
		}
		return billDTOList;
	}

	@Override
	public BillDTO findABill(Long id) {
		return new BillDTO(billDao.findABill(id));
	}
	
	@Override
	public void billDelete(Long id) {
		billDao.billDelete(id);
	}

	@Override
	public List<BillDTO> findSalesPersonBills(String salespersonId) {
		List<BillDTO> salesPersonBills=new ArrayList<>();
		for(Bill bill:billDao.findSalesPersonBills(salespersonId)) {
			BillDTO billDTO = new BillDTO(bill);
			salesPersonBills.add(billDTO);
		}
		return salesPersonBills;
	}

}
