package com.example.CricketGame.service;

import com.example.CricketGame.models.Player;
import com.example.CricketGame.models.Team;
import com.example.CricketGame.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TeamService {

//    @Autowired
//    private TeamRepository teamRepository;
    private static int counter=1;
    public Team createTeam1(String name)
    {

        Team team1=new Team(0,0,0);
        team1.setId(counter);
        counter++;
        team1.setName(name);
        Player p1= new Player(1,"Smriti Mandhana",0,0,0,0,0,"Batter",18,97,54);
        Player p2= new Player(2,"Shafali Verma",0,0,0,0,0,"Batter",17,94,54);
        Player p3= new Player(3,"Harleen Deol",0,0,0,0,0,"Batter",98,90,59);
        Player p4= new Player(4,"Harmanpreet Kaur",0,0,0,0,0,"Batter",7,90,58);
        Player p5= new Player(5,"Devika Purnendu Vaidya",0,0,0,0,0,"All Rounder",12,97,30);
        Player p6= new Player(6,"Richa Ghosh",0,0,0,0,0,"Wicket Keeper",13,96,35);
        Player p7= new Player(7,"Deepti Sharma",0,0,0,0,0,"Bowler",6,78,84);
        Player p8= new Player(8,"Radha Yadav",0,0,0,0,0,"Bowler",21,70,94);
        Player p9= new Player(9,"Rajeshwari Gayakwad",0,0,0,0,0,"Bowler",1,55,90);
        Player p10= new Player(10,"Kesavarajugari Anjali Sarvani",0,0,0,0,0,"Bowler",28,45,97);
        Player p11= new Player(11,"Renuka Singh Thakur",0,0,0,0,0,"Bowler",10,23,99);

        List<Player> teamPlayers= Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
        team1.setPlayers(teamPlayers);
//        teamRepository.save(team1);
        return team1;
    }
    public Team createTeam2(String name)
    {

        Team team2=new Team(0,0,0);
        team2.setId(counter);
        counter++;
        team2.setName(name);
        Player p1= new Player(1,"Beth Mooney",0,0,0,0,0,"Batter",6,97,54);
        Player p2= new Player(2,"Phoebe Litchfield",0,0,0,0,0,"Batter",5,94,38);
        Player p3= new Player(3,"Tahlia McGrath",0,0,0,0,0,"Batter",11,90,55);
        Player p4= new Player(4,"Ash Gardner",0,0,0,0,0,"Batter",63,87,45);
        Player p5= new Player(5,"Ellyse Perry",0,0,0,0,0,"All Rounder",8,88,67);
        Player p6= new Player(6,"Grace Harris",0,0,0,0,0,"Wicket Keeper",48,90,33);
        Player p7= new Player(7,"Darcie Brown",0,0,0,0,0,"Bowler",17,75,88);
        Player p8= new Player(8,"Annabel Sutherland",0,0,0,0,0,"Bowler",14,55,80);
        Player p9= new Player(9,"Heather Graham",0,0,0,0,0,"Bowler",1,34,90);
        Player p10= new Player(10,"Alana King",0,0,0,0,0,"Bowler",27,23,95);
        Player p11= new Player(11,"Kim Garth",0,0,0,0,0,"Bowler",99,56,98);


        List<Player> teamPlayers= Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11);
        team2.setPlayers(teamPlayers);
//        teamRepository.save(team2);
        return team2;
    }
}
