package com.example.eligibility.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eligibility.model.Benefits;
import com.example.eligibility.model.Dependents;
import com.example.eligibility.model.Policies;
import com.example.eligibility.model.Subscribers;
import com.example.eligibility.repository.PolicyRepository;
import com.example.eligibility.repository.SubscribersRepository;

@Service
public class SubscribersService {

	@Autowired
	private SubscribersRepository subscribersRepository;

	@Autowired
	private BenefitsService benefitsService;

	public List<Subscribers> getAll() {
		return subscribersRepository.findAll();
	}

	public List<Subscribers> putAll(Subscribers subscribers) {
		return subscribersRepository.findAll();
	}

	public String addSubscribers(Subscribers subscribers) {

		Subscribers subscriber=new Subscribers();
		List<Benefits> benefitList= new ArrayList();
		List <Dependents> dependentList=new ArrayList();
		Benefits benefit=new Benefits();
		Dependents dependents=new Dependents();
		boolean s=false;
		String result = null;
		System.out.println("get valuealue"+subscribers.getEmail()+subscribers.getPassword()+subscribers.getDateOfBirth()+subscribers.getAddress().getCity());
		subscriber.setId(subscribers.getId());
		subscriber.setSubscriberId(subscribers.getSubscriberId());
		subscriber.setName(subscribers.getName());
		subscriber.setAddress(subscribers.getAddress());
		subscriber.setEmail(subscribers.getEmail());
		subscriber.setPassword(subscribers.getPassword());
		subscriber.setDateOfBirth(subscribers.getDateOfBirth());
		Policies policy=benefitsService.getBenefitService((subscribers.getBenefits().get(0).getPolicyId()));
		benefit.setId(policy.getId());
		benefit.setPolicyId(policy.getPolicyId());
		benefit.setPolicyBenefits(policy.getPolicyBenefits());
		benefit.setPolicyName(policy.getPolicyName());
		benefit.setClaimedAmount(subscribers.getBenefits().get(0).getClaimedAmount());
		benefit.setCurrentEligibleAmount(subscribers.getBenefits().get(0).getCurrentEligibleAmount());
		benefitList.add(benefit);		
		subscriber.setBenefits(benefitList);
		dependents.setDependentId(subscribers.getDependents().get(0).getDependentId());
		dependents.setDependentDateOfBirth(subscribers.getDependents().get(0).getDependentDateOfBirth());
		dependents.setDependentName(subscribers.getDependents().get(0).getDependentName());
		dependents.setDependentAddress(subscribers.getDependents().get(0).getDependentAddress());
		dependents.setDependentBenefits(benefitList);
		dependentList.add(dependents);
		subscriber.setDependents(dependentList);
		if(s==false) {
			subscribersRepository.insert(subscriber);
			s=true;
			result = "Inserted Successfully";
			System.out.println("inside if success");
		}
		else {
			System.out.println("inside else");
			s=false;
			result = "Error Occured";
		}
		return result;
	}

}
