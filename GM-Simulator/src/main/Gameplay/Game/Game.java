package main.Gameplay.Game;

import main.Team.Lineup.DefensiveLineUp;
import main.Team.Lineup.OffensiveLineUp;

public class Game {
    private double time;
    private OffensiveLineUp offense1;
    private OffensiveLineUp offense2;
    private DefensiveLineUp defense1;
    private DefensiveLineUp defense2;


    public Game(OffensiveLineUp o1, DefensiveLineUp d1, OffensiveLineUp o2, DefensiveLineUp d2){
        time = 60.0;
        offense1 = o1;
        defense1 = d1;
        offense1 = o2;
        defense1 = d2;
    }

    public void simulatePlay(){

    }

}
