package main.Player.Positions;

import main.Player.Person;
import main.Player.Position;
import main.Player.Attributes.DefendAir;
import main.Player.Attributes.DefendGround;
import main.Player.Attributes.Universal;

public class Cornerback extends Person {
    public DefendAir defendAir;
    public DefendGround defendGround;
    public Universal universal;

    public Cornerback() {
        super(Position.CB);
    }
}
