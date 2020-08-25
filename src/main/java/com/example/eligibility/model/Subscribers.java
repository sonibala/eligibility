package com.example.eligibility.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
@Document
public class Subscribers {

	@Id
	private String id;
	
	private String subscriberId;
	
	private Name name;
	
	private Address address;
	
	private String email;
	
	private String password;
	
	private Date dateOfBirth;
	
	private List<Benefits> benefits;
	
	private List<Dependents> dependents;

//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getSubscriberId() {
//		return subscriberId;
//	}
//
//	public void setSubscriberId(String subscriberId) {
//		this.subscriberId = subscriberId;
//	}
//
//	public Name getName() {
//		return name;
//	}
//
//	public void setName(Name name) {
//		this.name = name;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public Date getDateOfBirth() {
//		return dateOfBirth;
//	}
//
//	public void setDateOfBirth(Date dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}
//
//
//	public List<Benefits> getBenefits() {
//		return benefits;
//	}
//
//	public void setBenefits(List<Benefits> benefits) {
//		this.benefits = benefits;
//	}
//
//	public List<Dependents> getDependents() {
//		return dependents;
//	}
//
//	public void setDependents(List<Dependents> dependents) {
//		this.dependents = dependents;
//	}
	
	
}
