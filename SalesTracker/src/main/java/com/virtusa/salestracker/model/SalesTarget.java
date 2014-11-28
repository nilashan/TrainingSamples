package com.virtusa.salestracker.model;

import org.hibernate.validator.constraints.Range;

public class SalesTarget {

	private Integer salesTargetValue;

	@Range(min=1000, max=10000)
	public Integer getSalesTargetValue() {
		return salesTargetValue;
	}

	public void setSalesTargetValue(Integer salesTargetValue) {
		this.salesTargetValue = salesTargetValue;
	}
	
	
}
