package com.example.CricketGame.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "players")
public class Player {

    @Id
    private int id;
    private String name;
    private int runsScored;
    private int runsGiven;
    private int ballsPlayed;
    private int ballsBowled;
    private int wicketsTaken;


    private String role;
    private int jerseyNumber;
    private int battingRating;
    private int bowlingRating;

    public Player() {
    }

    public Player(int id, String name, int runsScored, int runsGiven, int ballsPlayed, int ballsBowled, int wicketsTaken, String role, int jerseyNumber, int battingRating, int bowlingRating) {
        this.id = id;
        this.name = name;
        this.runsScored = runsScored;
        this.runsGiven = runsGiven;
        this.ballsPlayed = ballsPlayed;
        this.ballsBowled = ballsBowled;
        this.wicketsTaken = wicketsTaken;
        this.role = role;
        this.jerseyNumber = jerseyNumber;
        this.battingRating = battingRating;
        this.bowlingRating = bowlingRating;
    }

    public int getId() {
        return id;
    }

    public int getBattingRating() {
        return battingRating;
    }

    public void setBattingRating(int battingRating) {
        this.battingRating = battingRating;
    }

    public int getBowlingRating() {
        return bowlingRating;
    }

    public void setBowlingRating(int bowlingRating) {
        this.bowlingRating = bowlingRating;
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

    public int getRunsGiven() {
        return runsGiven;
    }

    public void setRunsGiven(int runsGiven) {
        this.runsGiven = runsGiven;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public void setBallsPlayed(int ballsPlayed) {
        this.ballsPlayed = ballsPlayed;
    }

    public int getBallsBowled() {
        return ballsBowled;
    }

    public void setBallsBowled(int ballsBowled) {
        this.ballsBowled = ballsBowled;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
}
