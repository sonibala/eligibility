package com.example.eligibility.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.eligibility.model.Subscribers;

@Repository
public interface SubscribersRepository  extends MongoRepository<Subscribers, List<Subscribers>>{

    Subscribers findBySubscriberId(String subscribers);

}
