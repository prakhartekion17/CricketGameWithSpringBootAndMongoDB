package com.example.CricketGame.repository;

import com.example.CricketGame.models.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team,Integer> {
}
