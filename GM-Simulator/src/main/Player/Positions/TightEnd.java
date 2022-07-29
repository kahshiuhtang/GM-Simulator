package main.Player.Positions;

import main.Player.Person;
import main.Player.Position;
import main.Player.Attributes.Blocker;
import main.Player.Attributes.Receiver;
import main.Player.Attributes.Runner;
import main.Player.Attributes.Universal;

public class TightEnd extends Person {

    private Blocker blocker;
    private Receiver receiver;
    private Runner runner;
    private Universal universal;

    public TightEnd() {
        super(Position.TE);
        // TODO Auto-generated constructor stub
    }
}
