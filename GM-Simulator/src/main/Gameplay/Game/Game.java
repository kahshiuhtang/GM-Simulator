package main.Gameplay.Game;

import main.Player.Person;

public class Game {
    private double time;
    private Person[] offense1;
    private Person[] offense2;
    private Person[] defense1;
    private Person[] defense2;


    public Game(Person[] o1, Person[] d1, Person[] o2, Person[] d2){
        time = 60.0;
        offense1 = o1;
        defense1 = d1;
        offense1 = o2;
        defense1 = d2;
    }

    public void simulatePlay(){

    }

}
