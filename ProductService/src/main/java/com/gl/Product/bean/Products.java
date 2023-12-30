package com.gl.Product.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	private String productId;
	private String productName;
	private Integer wholesaleRate;
	private Integer retailRate;
	private Integer stock;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(String ProductId,String ProductName, Integer wholesaleRate, Integer retailRate, Integer stock) {
		super();
		this.productId = ProductId;
		this.productName = ProductName;
		this.wholesaleRate = wholesaleRate;
		this.retailRate = retailRate;
		this.stock = stock;
	}
	public Products(ProductsDTO productsDTO) {
		super();
		this.productId = productsDTO.getProductId();
		this.productName = productsDTO.getProductName();
		this.wholesaleRate = productsDTO.getWholesaleRate();
		this.retailRate = productsDTO.getRetailRate();
		this.stock = productsDTO.getStock();
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String ProductId) {
		productId = ProductId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String ProductName) {
		productName = ProductName;
	}
	public Integer getWholesaleRate() {
		return wholesaleRate;
	}
	public void setWholesaleRate(Integer wholesaleRate) {
		this.wholesaleRate = wholesaleRate;
	}
	public Integer getRetailRate() {
		return retailRate;
	}
	public void setRetailRate(Integer retailRate) {
		this.retailRate = retailRate;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	

}
