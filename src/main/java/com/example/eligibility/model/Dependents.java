package com.example.eligibility.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Dependents {

	private String dependentId;
	
	private Name dependentName;
	
	private Date dependentDateOfBirth;
	
	private Address dependentAddress;
	
	private List<Benefits> dependentBenefits;

//	public String getDependentId() {
//		return dependentId;
//	}
//
//	public void setDependentId(String dependentId) {
//		this.dependentId = dependentId;
//	}
//
//	public Name getDependentName() {
//		return dependentName;
//	}
//
//	public void setDependentName(Name dependentName) {
//		this.dependentName = dependentName;
//	}
//
//	public Date getDependentDateOfBirth() {
//		return dependentDateOfBirth;
//	}
//
//	public void setDependentDateOfBirth(Date dependentDateOfBirth) {
//		this.dependentDateOfBirth = dependentDateOfBirth;
//	}
//
//	public Address getDependentAddress() {
//		return dependentAddress;
//	}
//
//	public void setDependentAddress(Address dependentAddress) {
//		this.dependentAddress = dependentAddress;
//	}
//
//	public List<Benefits> getDependentBenefits() {
//		return dependentBenefits;
//	}
//
//	public void setDependentBenefits(List<Benefits> dependentBenefits) {
//		this.dependentBenefits = dependentBenefits;
//	}


	
}
