package com.gl.orderService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gl.orderService.bean.WholesaleOrder;
import com.gl.orderService.bean.WholesaleOrderDTO;
import com.gl.orderService.dao.WholesaleOrderDao;

@Repository
@Service
public class WholesaleOrderServiceImpl implements WholesaleOrderService {

	@Autowired
	private WholesaleOrderDao wholesaleOrderDao;
	@Override
	public void wholesaleOrderSave(WholesaleOrderDTO wholesaleOrderDTO) {
		WholesaleOrder wholesaleOrder=new WholesaleOrder(wholesaleOrderDTO);
		wholesaleOrderDao.wholesaleOrderSave(wholesaleOrder);
	}

	@Override
	public List<WholesaleOrderDTO> findAllWholesaleOrder() {
		List<WholesaleOrderDTO> wholesaleOrderList=new ArrayList<>();
		for(WholesaleOrder wholesaleOrder:wholesaleOrderDao.findAllWholesaleOrder()) {
			WholesaleOrderDTO wholesaleOrderDTO=new WholesaleOrderDTO(wholesaleOrder);
			wholesaleOrderList.add(wholesaleOrderDTO);
		}
		return wholesaleOrderList;
	}

	@Override
	public WholesaleOrderDTO findAWholesaleOrder(Long id) {
		return new WholesaleOrderDTO(wholesaleOrderDao.findAWholesaleOrder(id));
	}

	@Override
	public void deleteAWholesaleOrder(Long id) {
		wholesaleOrderDao.deleteAWholesaleOrder(id);;

	}

	@Override
	public Long generateId() {
		return wholesaleOrderDao.generateId();
	}

	@Override
	public List<WholesaleOrderDTO> findPendingByCnr(Long id) {
		List<WholesaleOrderDTO> pendingWOrderList=new ArrayList<>();
		 for(WholesaleOrder wholesaleOrder:wholesaleOrderDao.findPendingByCnr(id)) {
				WholesaleOrderDTO wholesaleOrderDTO=new WholesaleOrderDTO(wholesaleOrder);
				pendingWOrderList.add(wholesaleOrderDTO);
			}
			return pendingWOrderList;
	}

}
