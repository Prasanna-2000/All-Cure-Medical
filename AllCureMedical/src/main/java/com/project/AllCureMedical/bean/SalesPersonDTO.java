package com.project.AllCureMedical.bean;

public class SalesPersonDTO {
	private String salesPersonId;
	private String name;
	private Integer comission;
	
	public SalesPersonDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesPersonDTO(Integer salesPersonId, String name, Integer comission) {
		super();
		this.salesPersonId = "S" + salesPersonId;
		this.name = name;
		this.comission = comission;
	}
	

	public String getSalesPersonId() {
		return salesPersonId;
	}

	public void setSalesPersonId(String salesPersonId) {
		this.salesPersonId = salesPersonId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getComission() {
		return comission;
	}

	public void setComission(Integer comission) {
		this.comission = comission;
	}

	@Override
	public String toString() {
		return "SalesPerson [salesPersonId=" + salesPersonId + ", name=" + name + ", comission=" + comission + "]";
	}
	
	
}
