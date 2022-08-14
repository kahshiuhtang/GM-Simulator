package main.Team.Lineup;

import main.Player.Person;

public class DefensiveLineUp extends LineUp{

    private Person[] players;
    public DefensiveLineUp(Person[] players){
        this.players = players;
    }

    public Person[] getLineUp() {
        return players;
    }

    public void changePlayer(Person replaced, Person replacee) {
        for(int i = 0; i < players.length;i++){
            if(players[i].equals(replaced)){
                players[i] = replacee;
                return;
            }
        }
    }

    public Person injury(int index) {
        return players[index];
    }
}
