package main.Gameplay;

import main.Player.Person;

public class Pick {

    private int round;
    private int position;
    private Person player;
    public Pick(int round, int position, Person p){
        this.round = round;
        this.position = position;
        this.player = p;
    }

}
