package com.example.CricketGame.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomValueGenereteService {

    public int generateRandomValue(double[] probabilities) {
        double randomDouble = Math.random();
        double cumulativeProbability = 0.0;
        for (int i = 0; i < probabilities.length; i++) {
            cumulativeProbability += probabilities[i];
            if (randomDouble < cumulativeProbability) {
                return i;
            }
        }
        return probabilities.length - 1;
    }
}
