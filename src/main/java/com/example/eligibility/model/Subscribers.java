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

}
