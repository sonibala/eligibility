package com.example.eligibility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eligibility.model.EligibilityCheck;
import com.example.eligibility.model.Policies;
import com.example.eligibility.service.EligibilityService;
import com.example.eligibility.service.PoliciesService;
import com.example.eligibility.service.SubscribersService;

@RestController
public class EligibilityController {

	@Autowired
	private EligibilityService eligibilityService;
	
	@GetMapping(path="/getBenefits",produces = "application/json")
    public EligibilityCheck getBenefit(@RequestParam String subscriberId,@RequestParam String uniqueId,@RequestParam String plan) {
        return eligibilityService.getEligibility(subscriberId, uniqueId, plan);
    }
}
