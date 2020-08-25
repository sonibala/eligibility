package com.example.eligibility.model;

import java.util.List;

import lombok.Data;

@Data
public class EligibilityCheck {

	private String subscriberId;
	
	private String uniqueId;
	
	private String planCode;
	
	private boolean isEligible;
	
	private List<Dependents> relationShip;
	
	private Long totalEligibleAmount;
	
	private Long currentEligibleAmount;
	
}
