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
        blocker = new Blocker(65, 65,55);
        universal = new Universal(70, 50, 50, 40, 70, 60, 40, 75);
    }

    public String toString(){
        return blocker.toString() + universal.toString();
    }

    public Blocker getBlocker() {
        return blocker;
    }

    public void setBlocker(Blocker blocker) {
        this.blocker = blocker;
    }

    public Universal getUniversal() {
        return universal;
    }

    public void setUniversal(Universal universal) {
        this.universal = universal;
    }
}
