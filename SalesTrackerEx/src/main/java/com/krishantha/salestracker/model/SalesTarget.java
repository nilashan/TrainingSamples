package com.krishantha.salestracker.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="SALESTARGET")
public class SalesTarget {
	
	@Id
	@GeneratedValue
	@Column(name="TARGETID")
	private Long id; 

	@Range(min = 100, max = 10000)
	@Column(name="TARGETVALUE")
	private Integer salesTargetValue;
	
	@OneToMany(mappedBy="salesTarget", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	List<Sales> sales = new ArrayList<Sales>();
	
	public List<Sales> getSales() {
		return sales;
	}

	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}

	public Integer getSalesTargetValue() {
		return salesTargetValue;
	}

	public void setSalesTargetValue(Integer salesTargetValue) {
		this.salesTargetValue = salesTargetValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
