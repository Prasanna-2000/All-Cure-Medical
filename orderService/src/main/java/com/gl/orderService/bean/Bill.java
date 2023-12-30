package com.gl.orderService.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {
	
	@Id
	private Long billNo;
	private String name;
	private String productId;
	private Integer rate;
	private Integer quantity;
	private Integer amount;
	private String bookingDate;
	private String salespersonId;
	
	public Bill() {
		super();
		
	}

	public Bill(Long billNo, String name, String productId, Integer rate, Integer quantity, Integer amount,
			String bookingDate, String salespersonId) {
		super();
		this.billNo = billNo;
		this.name = name;
		this.productId = productId;
		this.rate = rate;
		this.quantity = quantity;
		this.amount = amount;
		this.bookingDate = bookingDate;
		this.salespersonId = salespersonId;
	}
	
	public Bill(BillDTO billDTO) {
		this.billNo = billDTO.getBillNo();
		this.name = billDTO.getName();
		this.productId = billDTO.getProductId();
		this.rate = billDTO.getRate();
		this.quantity = billDTO.getQuantity();
		this.amount = billDTO.getAmount();
		this.bookingDate = billDTO.getBookingDate();
		this.salespersonId = billDTO.getSalespersonId();
	}

	public Long getBillNo() {
		return billNo;
	}

	public void setBillNo(Long billNo) {
		this.billNo = billNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getSalespersonId() {
		return salespersonId;
	}

	public void setSalespersonId(String salespersonId) {
		this.salespersonId = salespersonId;
	}
	
}
