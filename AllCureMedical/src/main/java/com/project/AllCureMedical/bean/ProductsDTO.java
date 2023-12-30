package com.project.AllCureMedical.bean;

public class ProductsDTO{
	
	private String productId;
	private String productName;
	private Integer wholesaleRate;
	private Integer retailRate;
	private Integer stock;
	public ProductsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductsDTO(String ProductId,String ProductName, Integer wholesaleRate, Integer retailRate, Integer stock) {
		super();
		this.productId = ProductId;
		this.productName = ProductName;
		this.wholesaleRate = wholesaleRate;
		this.retailRate = retailRate;
		this.stock = stock;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName() {
		return productName;

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
	@Override
	public String toString() {
		return "ProductsDTO [productId=" + productId + ", productName=" + productName + ", wholesaleRate="
				+ wholesaleRate + ", retailRate=" + retailRate + ", stock=" + stock + "]";
	}
	
	
}
