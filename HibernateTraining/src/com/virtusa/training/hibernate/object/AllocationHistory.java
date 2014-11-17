package com.virtusa.training.hibernate.object;

import java.util.Date;

public class AllocationHistory {

	private Date allocationDate;
	private String projectCode;
	private int employeeId;
	private Employee employee;
	
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	
	
	
	public AllocationHistory() {

	}

	public AllocationHistory(Date allocationDate, String projectCode) {
		this.allocationDate = allocationDate;
		this.projectCode = projectCode;
	}

	public Date getAllocationDate() {
		return allocationDate;
	}

	public void setAllocationDate(Date allocationDate) {
		this.allocationDate = allocationDate;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	
	
}
