package com.virtusa.training.hibernate.object;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Employee {
	
	private String name;
	private int age;
	//private String city;
	private int empId;
	//private String mobile;
	private AllocationData allocationData=new AllocationData();
	List<AllocationHistory> allocationHistories=new ArrayList<>();
	
	public void addAllocationHistory(AllocationHistory allocationHistory) {
		allocationHistory.setEmployee(this);
		allocationHistories.add(allocationHistory);
	}
	
	public List<AllocationHistory> getAllocationHistories() {
		return allocationHistories;
	}

	public void setAllocationHistories(List<AllocationHistory> allocationHistories) {
		this.allocationHistories = allocationHistories;
	}

	public AllocationData getAllocationData() {
		return allocationData;
	}

	public void setAllocationData(AllocationData allocationData) {
		this.allocationData = allocationData;
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
