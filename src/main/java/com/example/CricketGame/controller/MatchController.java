package com.example.CricketGame.controller;

import com.example.CricketGame.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController {

    @Autowired

    private MatchService matchService;

    @RequestMapping("/start")
    public void startMatch()
    {
        matchService.startMatch();
    }
}
