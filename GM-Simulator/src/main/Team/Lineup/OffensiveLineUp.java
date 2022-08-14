package main.Team.Lineup;

import main.Player.Person;

public class OffensiveLineUp extends LineUp{

    private Person[] players;
    public OffensiveLineUp(Person[] players){
        this.players = players;
    }

    @Override
    public Person[] getLineUp() {
        return players;
    }

    @Override
    public void changePlayer(Person replaced, Person replacee) {
        for(int i = 0; i < players.length;i++){
            if(players[i].equals(replaced)){
                players[i] = replacee;
                return;
            }
        }
    }

    @Override
    public Person injury(int index) {
        return players[index];
    }
}
