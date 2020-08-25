package com.example.eligibility.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eligibility.model.Policies;
import com.example.eligibility.repository.PolicyRepository;

@Service
public class BenefitsService {

	@Autowired
	private PolicyRepository policyRepository;
	
	public Policies getBenefitService(String policyId) {
	    Policies policy=policyRepository.findByPolicyId(policyId);
	    return policy;
	}
}
