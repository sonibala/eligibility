package com.example.eligibility.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eligibility.model.EligibilityCheck;
import com.example.eligibility.model.Subscribers;
import com.example.eligibility.repository.SubscribersRepository;

@Service
public class EligibilityService {

	@Autowired
	private SubscribersRepository subscribersRepository;

	public EligibilityCheck getEligibility(String subscriberId, String uniqueId, String plan) {
		EligibilityCheck eligible= new EligibilityCheck();
		Boolean isEligibile=false;
		Subscribers subscribers=subscribersRepository.findBySubscriberId(subscriberId);
		if(subscribers.getDependents().get(0).getDependentId().equals(uniqueId)&&subscribers.getBenefits().get(0).getPolicyId().equals(plan)) {
			eligible.setSubscriberId(subscribers.getSubscriberId());
			eligible.setUniqueId(subscribers.getDependents().get(0).getDependentId());
			eligible.setPlanCode(subscribers.getBenefits().get(0).getPolicyId());
			if(subscribers.getDependents().get(0).getDependentBenefits().get(0).getCurrentEligibleAmount()>0) {
				isEligibile=true;
				eligible.setEligible(isEligibile);   

			}
			eligible.setRelationShip(subscribers.getDependents());
			eligible.setTotalEligibleAmount(subscribers.getBenefits().get(0).getTotalEligibleAmount());
			eligible.setCurrentEligibleAmount(subscribers.getBenefits().get(0).getCurrentEligibleAmount());


		}
		return eligible;

	}

}
