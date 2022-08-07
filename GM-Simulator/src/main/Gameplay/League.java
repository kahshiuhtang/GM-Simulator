package main.Gameplay;

import main.Team.Team;

public class League {
    private Team[] teams;
    private int year;
    public League(int teamCount, int year){
        teams = new Team[teamCount];
        this.year = year;
        generateTeams();
    }

    public void updateYear(){
        year++;
    }

    public void generateTeams(){
        for(int i = 0; i < teams.length; i++){
            Team t = new Team();
            teams[i] = t;
        }
    }

    public Team[] getTeams() {
        return teams;
    }
}
