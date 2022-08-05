package main.Gameplay;

import main.Team.Team;

public class League {
    private Team[] teams;
    public League(int teamCount){
        teams = new Team[teamCount];
        generateTeams();
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
