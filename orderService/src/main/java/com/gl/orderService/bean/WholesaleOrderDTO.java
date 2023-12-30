package com.gl.orderService.bean;

public class WholesaleOrderDTO {

	private Long orderNo;
	private long cnr;
	private String productId;
	private Integer rate;
	private Integer quantity;
	private Integer amount;
	private String status;
	private String bookingDate;
	
	public WholesaleOrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WholesaleOrderDTO(Long orderNo, long cnr, String productId, Integer rate, Integer quantity, Integer amount,
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

	public WholesaleOrderDTO(WholesaleOrder wholesaleOrder) {
		super();
		this.orderNo = wholesaleOrder.getOrderNo();
		this.cnr = wholesaleOrder.getCnr();
		this.productId = wholesaleOrder.getProductId();
		this.rate = wholesaleOrder.getRate();
		this.quantity = wholesaleOrder.getQuantity();
		this.amount = wholesaleOrder.getAmount();
		this.status = wholesaleOrder.getStatus();
		this.bookingDate = wholesaleOrder.getBookingDate();
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
		return "WholesaleOrderDTO [orderNo=" + orderNo + ", cnr=" + cnr + ", productId=" + productId + ", rate=" + rate
				+ ", quantity=" + quantity + ", amount=" + amount + ", status=" + status + ", bookingDate="
				+ bookingDate + "]";
	}
	
	
	
	
	
}