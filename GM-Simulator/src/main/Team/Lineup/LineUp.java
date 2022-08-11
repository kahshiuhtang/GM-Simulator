package main.Team.Lineup;

import main.Player.Person;

public abstract class LineUp {

    public LineUp(){

    }
    public abstract LineUp getLineUp();
    public abstract void changePlayer(Person replaced, Person replacee);
    public abstract Person injury();

}
