package com.gl.orderService.service;
import java.util.List;

import com.gl.orderService.bean.WholesaleOrderDTO;

public interface WholesaleOrderService {
	public void wholesaleOrderSave(WholesaleOrderDTO wholesaleOrderDTO);
	public List<WholesaleOrderDTO> findAllWholesaleOrder();
	public WholesaleOrderDTO findAWholesaleOrder(Long id);
	public void deleteAWholesaleOrder(Long id);
	public List<WholesaleOrderDTO> findPendingByCnr(Long id);
	public Long generateId();
}
