package com.example.eligibility.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Policies {

	@Id
	private String id;
	
	private String policyId;
	
	private String policyName;
	
	private String policyBenefits;
	
	private Long claimableAmount;

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
//	public Long getClaimableAmount() {
//		return claimableAmount;
//	}
//
//	public void setClaimableAmount(Long claimableAmount) {
//		this.claimableAmount = claimableAmount;
//	}
	
	
}
