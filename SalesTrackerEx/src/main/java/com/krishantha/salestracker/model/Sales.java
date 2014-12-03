package com.krishantha.salestracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sales {
	
	@Id
	@GeneratedValue
	private Long id;
	private Integer sales;
	private String salesTypes;
	
	public SalesTarget getSalesTarget() {
		return salesTarget;
	}

	public void setSalesTarget(SalesTarget salesTarget) {
		this.salesTarget = salesTarget;
	}

	@ManyToOne
	private SalesTarget salesTarget;
	

	public String getSalesTypes() {
		return salesTypes;
	}

	public void setSalesTypes(String salesTypes) {
		this.salesTypes = salesTypes;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
