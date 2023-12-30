package com.gl.orderService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.orderService.bean.Bill;


@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
	
	@Query("select max(billNo) from Bill")
	public Long findMaxBillId();
	
	@Query("SELECT b FROM Bill b WHERE b.salespersonId=?1")
	public List<Bill> showSalesPersonBills(String salespersonId);
}
