package com.example.CricketGame.repository;

import com.example.CricketGame.models.Match;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepository extends MongoRepository<Match,Integer> {
}
