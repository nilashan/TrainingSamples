package com.krishantha.training.hibernate.object;

public class AllocationData {
	private String city;
	private String mobile;
	private int id;
	private Employee employee;

	public AllocationData() {
	
	}
	
	public AllocationData(String city, String mobile) {
	this.city=city;
	this.mobile=mobile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
