package com.example.CricketGame.service;

import com.example.CricketGame.models.Match;
import com.example.CricketGame.models.Team;
import com.example.CricketGame.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {

    @Autowired
    private MatchRepository matchRepository;
    public void getResult(Team team1, Team team2, Match match)
    {
        System.out.println("First Innings..................");
        System.out.println("Batting Stats");
        for(int i=0;i<11;i++)
        {
            System.out.print(team1.getPlayers().get(i).getName());
            System.out.println(" "+team1.getPlayers().get(i).getRunsScored());
        }
        System.out.println("Bowling Stats..............");
        for(int i=6;i<11;i++)
        {
            System.out.println(team2.getPlayers().get(i).getName()+"  "+team2.getPlayers().get(i).getBallsBowled()+"    "+team2.getPlayers().get(i).getRunsGiven()+"    "+team2.getPlayers().get(i).getWicketsTaken());
        }
        System.out.println("Second Innings....................");
        for(int i=0;i<11;i++)
        {
            System.out.print(team2.getPlayers().get(i).getName());
            System.out.println(" "+team2.getPlayers().get(i).getRunsScored());
        }
        System.out.println("Bowling Stats...............");
        for(int i=6;i<11;i++)
        {
            System.out.println(team1.getPlayers().get(i).getName()+"  "+team1.getPlayers().get(i).getBallsBowled()+"    "+team1.getPlayers().get(i).getRunsGiven()+"    "+team1.getPlayers().get(i).getWicketsTaken());
        }
        System.out.println(team1.getRunsScored());

        System.out.println(team2.getRunsScored());
        if(team1.getRunsScored()>team2.getRunsScored()) {
//            System.out.println("India won the match");
            match.setWinningTeam(team1);
            match.setWinningDifference(team1.getRunsScored()-team2.getRunsScored());
        }
        else if(team1.getRunsScored()<team2.getRunsScored()) {
//            System.out.println("Australia won the match");
            match.setWinningTeam(team2);
            match.setWinningDifference(team2.getRunsScored()-team1.getRunsScored());
        }
        else {
            System.out.println("Match Draw");
        }
        System.out.println("Match ID:"+match.getId());

        System.out.println("Wining Team:"+match.getWinningTeam().getName()+" and won bye:"+match.getWinningDifference());

        matchRepository.save(match);
        return;
    }
}
