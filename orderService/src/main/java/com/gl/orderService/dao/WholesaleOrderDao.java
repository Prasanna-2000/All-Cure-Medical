package com.gl.orderService.dao;
import java.util.List;

import com.gl.orderService.bean.WholesaleOrder;

public interface WholesaleOrderDao {
	public void wholesaleOrderSave(WholesaleOrder wholesaleOrder);
	public List<WholesaleOrder> findAllWholesaleOrder();
	public WholesaleOrder findAWholesaleOrder(Long id);
	public void deleteAWholesaleOrder(Long id);
	public List<WholesaleOrder> findPendingByCnr(Long id);
	public Long generateId();
}
