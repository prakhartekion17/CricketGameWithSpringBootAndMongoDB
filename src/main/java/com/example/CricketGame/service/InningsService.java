package com.example.CricketGame.service;

import com.example.CricketGame.models.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

@Service
public class InningsService {

    @Autowired
    private OverService overService;
    public Team startMatch(Team team1, Team team2, int runsToBeat,boolean firstInnings)
    {
        int firstBatter=0;
        int secondBatter=1;
        int nextBatter=2;
        int bowling=7;
        int batter=firstBatter;
        int bowler=6;
        int nextBowler=7;
        int i;
        int prevBatRuns=0,prevBatBalls=0;
        int flag=1;

        for(i=0;i<120;i++)
        {

            if(team1.getWicketsLost()>9||(!firstInnings&&team1.getRunsScored()>runsToBeat))
                break;
            int calc=team1.getPlayers().get(batter).getBattingRating()-team2.getPlayers().get(bowler).getBowlingRating();
            int eachBall= overService.eachBall(calc);
            if(eachBall!=7)
            {
                team1.setRunsScored(team1.getRunsScored()+eachBall);
                int tempRun=team1.getPlayers().get(batter).getRunsScored();
                int tempBall=team1.getPlayers().get(batter).getBallsPlayed();
                int tempRunGot=team2.getPlayers().get(bowler).getRunsGiven();
                int tempBallBowled=team2.getPlayers().get(bowler).getBallsBowled();
                team1.getPlayers().get(batter).setRunsScored(tempRun+eachBall);
                team1.getPlayers().get(batter).setBallsPlayed(tempBall+1);
                team2.getPlayers().get(bowler).setRunsGiven(tempRunGot+eachBall);
                team2.getPlayers().get(bowler).setBallsBowled(tempBallBowled+1);
//                System.out.println(tempRun);

                //Add for each player
            }
            else
            {
                team1.setWicketsLost(team1.getWicketsLost()+1);
                int tempWickets= team2.getPlayers().get(bowler).getWicketsTaken();
                team2.getPlayers().get(bowler).setWicketsTaken(tempWickets+1);

                if(batter==firstBatter)
                {
                    firstBatter=nextBatter;
                    nextBatter++;
                    batter=firstBatter;

                }
                else
                {
                    secondBatter=nextBatter;
                    nextBatter++;
                    batter=secondBatter;
                }

                //Next batsman can be taken through min heap
            }
            if((i+1)%6==0)
            {
                if(batter==firstBatter)
                    batter=secondBatter;
                else
                    batter=firstBatter;
                bowler=bowling;
                bowling++;
                if(bowling >10)
                    bowling =6;

            }

        }
        team1.setBallsPlayed(i);
        return team1;
    }
}
