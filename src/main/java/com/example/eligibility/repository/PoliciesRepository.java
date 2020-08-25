package com.example.eligibility.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.eligibility.model.Policies;

public interface PoliciesRepository extends MongoRepository<Policies, Long>{

    Policies findByPolicyId(String string);
	
}
