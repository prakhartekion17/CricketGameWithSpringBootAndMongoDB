package com.example.CricketGame.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "matches")
public class Match {

    @Id
    private int id;
    private String name;
    private Team firstTeam;
    private Team secondTeam;

    private Team winningTeam;
    private int winningDifference;

    public Match() {
    }

    public Match(int id, String name, Team firstTeam, Team secondTeam) {
        this.id = id;
        this.name = name;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    public Match(int id, String name, Team firstTeam, Team secondTeam, Team winningTeam, int winningDifference) {
        this.id = id;
        this.name = name;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.winningTeam = winningTeam;
        this.winningDifference = winningDifference;
    }

    public Team getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(Team winningTeam) {
        this.winningTeam = winningTeam;
    }

    public int getWinningDifference() {
        return winningDifference;
    }

    public void setWinningDifference(int winningDifference) {
        this.winningDifference = winningDifference;
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

    public Team getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(Team firstTeam) {
        this.firstTeam = firstTeam;
    }

    public Team getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(Team secondTeam) {
        this.secondTeam = secondTeam;
    }
}
