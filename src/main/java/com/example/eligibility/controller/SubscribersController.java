package com.example.eligibility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eligibility.service.SubscribersService;
import com.example.eligibility.model.Policies;
import com.example.eligibility.model.Subscribers;
import java.util.List;

@RestController
public class SubscribersController {

	@Autowired
	private SubscribersService subscribersService;
	
	@PostMapping(path="/enrollment",consumes = "application/json")
    public String addSubscriberslist(@RequestBody Subscribers subscribers) {
        System.out.println("-----get mapping---");
        return subscribersService.addSubscribers(subscribers);
    }
}
