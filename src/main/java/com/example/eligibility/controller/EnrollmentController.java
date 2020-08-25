package com.example.eligibility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eligibility.model.Policies;
import com.example.eligibility.model.Subscribers;
import com.example.eligibility.service.PoliciesService;
import com.example.eligibility.service.SubscribersService;

@RestController
public class EnrollmentController {

	@Autowired
	private SubscribersService subscribersService;
	
	@Autowired
	private PoliciesService policiesService;
	
	@PostMapping(path="/enrollment",consumes = "application/json")
    public String addSubscriberslist(@RequestBody Subscribers subscribers) {
        return subscribersService.addSubscribers(subscribers);
    }
	
	@GetMapping(path="/getPolicyDetails",produces = "application/json")
    public Policies getPolicyDetails(@RequestParam String policyId) {
        return policiesService.getPolicyDetails(policyId);
    }
}
