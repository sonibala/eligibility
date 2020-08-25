package com.example.eligibility.model;

import lombok.Data;

@Data
public class Benefits {

	private String id;
	
	private String policyId;
	
	private String policyName;
	
	private String policyBenefits;
	
	private long totalEligibleAmount;
	
	private int claimedAmount;
	
	private long currentEligibleAmount;

}
