package com.example.CricketGame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OverService {

    @Autowired
    private RandomValueGenereteService randomValueGenereteService;
    public int eachBall(int calc)
    {
       if(calc>0)
       {
           double[] probability={0.1,0.1,0.175,0.175,0.175,0,0.175,0.1};
           return randomValueGenereteService.generateRandomValue(probability);
       }
       else
       {
           double[] probability={0.2,0.2,0.1,0.1,0.1,0,0.1,0.2};
           return randomValueGenereteService.generateRandomValue(probability);
       }
//       return (int)Math.random()*8;
    }
}
