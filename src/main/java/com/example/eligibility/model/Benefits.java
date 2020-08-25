package com.example.eligibility.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.Data;

@Data
public class Benefits {

//	@DBRef(db="policies")
	private String id;
	
	private String policyId;
	
	private String policyName;
	
	private String policyBenefits;
	
	private long totalEligibleAmount;
	
	private int claimedAmount;
	
	private long currentEligibleAmount;


//	public long getTotalEligibleAmount() {
//		return totalEligibleAmount;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getPolicyId() {
//		return policyId;
//	}
//
//	public void setPolicyId(String policyId) {
//		this.policyId = policyId;
//	}
//
//	public String getPolicyName() {
//		return policyName;
//	}
//
//	public void setPolicyName(String policyName) {
//		this.policyName = policyName;
//	}
//
//	public String getPolicyBenefits() {
//		return policyBenefits;
//	}
//
//	public void setPolicyBenefits(String policyBenefits) {
//		this.policyBenefits = policyBenefits;
//	}
//
//	public void setTotalEligibleAmount(long totalEligibleAmount) {
//		this.totalEligibleAmount = totalEligibleAmount;
//	}
//
//	public int getClaimedAmount() {
//		return claimedAmount;
//	}
//
//	public void setClaimedAmount(int claimedAmount) {
//		this.claimedAmount = claimedAmount;
//	}
//
//	public long getCurrentEligibleAmount() {
//		return currentEligibleAmount;
//	}
//
//	public void setCurrentEligibleAmount(long currentEligibleAmount) {
//		this.currentEligibleAmount = currentEligibleAmount;
//	}
	
	
}
