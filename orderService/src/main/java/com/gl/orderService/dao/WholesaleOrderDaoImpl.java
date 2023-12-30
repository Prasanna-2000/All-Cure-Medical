package com.gl.orderService.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.orderService.bean.WholesaleOrder;

@Service
public class WholesaleOrderDaoImpl implements WholesaleOrderDao {

	@Autowired
	private WholesaleOrderRepository wholesaleOrderRepository;
	
	@Override
	public void wholesaleOrderSave(WholesaleOrder wholesaleOrder) {

		wholesaleOrderRepository.save(wholesaleOrder);
	}

	@Override
	public List<WholesaleOrder> findAllWholesaleOrder() {
		List<WholesaleOrder> wholesaleOrderseList=wholesaleOrderRepository.findAll();
		return wholesaleOrderseList;
	}

	@Override
	public WholesaleOrder findAWholesaleOrder(Long id) {
		WholesaleOrder wholesaleOrder=wholesaleOrderRepository.getById(id);
		return wholesaleOrder;
	}

	@Override
	public void deleteAWholesaleOrder(Long id) {
		wholesaleOrderRepository.deleteById(id);
	}

	@Override
	public Long generateId() {
		Long val=wholesaleOrderRepository.findMaxWholesaleOrderId();
		if (val==null) {
			val=124560001L;
		}
		else
			val=val+1;
		return val;
	}

	@Override
	public List<WholesaleOrder> findPendingByCnr(Long id) {
		return wholesaleOrderRepository.showPendingByCnr(id);
	}

}
