package com.example.eligibility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eligibility.model.Policies;
import com.example.eligibility.service.BenefitsService;
import com.example.eligibility.service.SubscribersService;

@RestController
public class BenefitsController {

	@Autowired
	private BenefitsService benefitsService;
	
	@GetMapping(path="/getBenefitService",produces = "application/json")
    public Policies getBenefit(@RequestParam String policyId) {
        System.out.println("-----get mapping---");
        return benefitsService.getBenefitService(policyId);
    }
}
