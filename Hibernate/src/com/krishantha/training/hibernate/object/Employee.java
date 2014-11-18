package com.krishantha.training.hibernate.object;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee {

	private int empId;
	private String name;
	private int age;

	private Set<Alert> alerts=new HashSet<>();

	
	public Set<Alert> getAlerts() {
		return alerts;
	}

	public void setAlerts(Set<Alert> alerts) {
		this.alerts = alerts;
	}

	private AllocationData allocationData;// = new AllocationData();
	List<AllocationHistory> allocationHistories = new ArrayList<>();

	public Employee()
	{
		
	}
	public Employee(int empid, String name, int age,
			AllocationData allocationData,
			AllocationHistory allocationHistory, Alert alert) {
		super();
		this.empId=empid;
		this.name=name;
		this.age=age;
		setAllocationData(allocationData);
		addAllocationHistory(allocationHistory);
		
		this.alerts.add(alert);
		
	}

	public void addAllocationHistory(AllocationHistory allocationHistory) {
		allocationHistory.setEmployee(this);
		this.allocationHistories.add(allocationHistory);
	}

	public List<AllocationHistory> getAllocationHistories() {
		return allocationHistories;
	}

	public void setAllocationHistories(
			List<AllocationHistory> allocationHistories) {
		this.allocationHistories = allocationHistories;
	}

	public AllocationData getAllocationData() {
		return allocationData;
	}

	public void setAllocationData(AllocationData allocationData) {
		this.allocationData = allocationData;
		allocationData.setEmployee(this);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
