package com.example.CricketGame.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "teams")
public class Team {


    @Id
    private int id;
    private String name;
    private int runsScored;
    private int wicketsLost;

    private int ballsPlayed;
    private List<Player> players;

    public Team(int runsScored, int wicketsLost, int ballsPlayed) {
        this.runsScored = runsScored;
        this.wicketsLost = wicketsLost;
        this.ballsPlayed = ballsPlayed;
    }

    public Team() {
    }

    public Team(int id, String name, int runsScored, int wicketsLost, int ballsPlayed, List<Player> players) {
        this.id = id;
        this.name = name;
        this.runsScored = runsScored;
        this.wicketsLost = wicketsLost;
        this.ballsPlayed = ballsPlayed;
        this.players = players;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getWicketsLost() {
        return wicketsLost;
    }

    public void setWicketsLost(int wicketsLost) {
        this.wicketsLost = wicketsLost;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public void setBallsPlayed(int ballsPlayed) {
        this.ballsPlayed = ballsPlayed;
    }


    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
