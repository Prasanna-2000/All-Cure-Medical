package com.gl.orderService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.orderService.bean.WholesaleOrder;

@Repository
public interface WholesaleOrderRepository extends JpaRepository<WholesaleOrder,Long> {
	@Query("select max(orderNo) from WholesaleOrder")
	public Long findMaxWholesaleOrderId();
	
	@Query("SELECT w FROM WholesaleOrder w WHERE w.cnr = ?1 and w.status ='pending'")
	public List<WholesaleOrder> showPendingByCnr(Long cnr);
} 
