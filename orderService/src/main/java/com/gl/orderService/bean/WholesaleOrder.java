package com.gl.orderService.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class WholesaleOrder {
	@Id
	private Long orderNo;
	@Column (length = 45 )
	private long cnr;
	private String productId;
	private Integer rate;
	private Integer quantity;
	private Integer amount;
	private String status;
	private String bookingDate;
	
	public WholesaleOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WholesaleOrder(Long orderNo, long cnr, String productId, Integer rate, Integer quantity, Integer amount,
			String status, String bookingDate) {
		super();
		this.orderNo = orderNo;
		this.cnr = cnr;
		this.productId = productId;
		this.rate = rate;
		this.quantity = quantity;
		this.amount = amount;
		this.status = status;
		this.bookingDate = bookingDate;
	}

	
	public WholesaleOrder(WholesaleOrderDTO wholesaleOrderDTO) {
		super();
		this.orderNo = wholesaleOrderDTO.getOrderNo();
		this.cnr = wholesaleOrderDTO.getCnr();
		this.productId = wholesaleOrderDTO.getProductId();
		this.rate = wholesaleOrderDTO.getRate();
		this.quantity = wholesaleOrderDTO.getQuantity();
		this.amount = wholesaleOrderDTO.getAmount();
		this.status = wholesaleOrderDTO.getStatus();
		this.bookingDate = wholesaleOrderDTO.getBookingDate();
	}

	public Long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}

	public long getCnr() {
		return cnr;
	}

	public void setCnr(long cnr) {
		this.cnr = cnr;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Override
	public String toString() {
		return "WholesaleOrder [orderNo=" + orderNo + ", cnr=" + cnr + ", productId=" + productId + ", rate=" + rate
				+ ", quantity=" + quantity + ", amount=" + amount + ", status=" + status + ", bookingDate="
				+ bookingDate + "]";
	}
	
	
	
	
}