package main.Team.History;

import main.Gameplay.DraftClass;
import main.Team.Team;

public class Year {

    private DraftClass draftClass;
    private Team team;

    public Year(Team t, DraftClass c){
        draftClass = c;
        team = t;
    }

    public DraftClass getDraftClass() {
        return draftClass;
    }

    public Team getTeam() {
        return team;
    }
}
