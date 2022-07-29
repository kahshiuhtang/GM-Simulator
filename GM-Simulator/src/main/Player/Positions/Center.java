package main.Player.Positions;

import main.Player.Person;
import main.Player.Position;
import main.Player.Attributes.Blocker;
import main.Player.Attributes.Universal;

public class Center extends Person {
    private Blocker blocker;
    private Universal universal;

    public Center() {
        super(Position.C);
    }
}
