package com.example.eligibility.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eligibility.model.Policies;
import com.example.eligibility.repository.PoliciesRepository;

@Service
public class PoliciesService {

	@Autowired
	private PoliciesRepository policyRepository;
	
	public Policies getPolicyDetails(String policyId) {
	    Policies policy=policyRepository.findByPolicyId(policyId);
	    return policy;
	}
}
