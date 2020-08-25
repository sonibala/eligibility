package com.example.eligibility.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eligibility.model.Benefits;
import com.example.eligibility.model.Dependents;
import com.example.eligibility.model.Policies;
import com.example.eligibility.model.Subscribers;
import com.example.eligibility.repository.SubscribersRepository;

@Service
public class SubscribersService {

	@Autowired
	private SubscribersRepository subscribersRepository;

	@Autowired
	private PoliciesService policiesService;

	public String addSubscribers(Subscribers subscribers) {
		
		List<Benefits> benefitList= new ArrayList();
		List <Dependents> dependentList=new ArrayList();
		Benefits benefit=new Benefits();
		Dependents dependents=new Dependents();
		Policies policy=policiesService.getPolicyDetails((subscribers.getBenefits().get(0).getPolicyId()));
		benefit.setId(policy.getId());
		benefit.setPolicyId(policy.getPolicyId());
		benefit.setPolicyBenefits(policy.getPolicyBenefits());
		benefit.setPolicyName(policy.getPolicyName());
		benefit.setTotalEligibleAmount(policy.getClaimableAmount());
		benefit.setClaimedAmount(subscribers.getBenefits().get(0).getClaimedAmount());
		benefit.setCurrentEligibleAmount(subscribers.getBenefits().get(0).getCurrentEligibleAmount());
		benefitList.add(benefit);		
		subscribers.setBenefits(benefitList);
		dependents.setDependentId(subscribers.getDependents().get(0).getDependentId());
		dependents.setDependentDateOfBirth(subscribers.getDependents().get(0).getDependentDateOfBirth());
		dependents.setDependentName(subscribers.getDependents().get(0).getDependentName());
		dependents.setDependentAddress(subscribers.getDependents().get(0).getDependentAddress());
		dependents.setDependentBenefits(benefitList);
		dependentList.add(dependents);
		subscribers.setDependents(dependentList);
		subscribersRepository.save(subscribers);
		return "Inserted Successfully";
	}

}
