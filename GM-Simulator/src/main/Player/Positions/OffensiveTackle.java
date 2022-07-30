package main.Player.Positions;

import main.Player.Person;
import main.Player.Position;
import main.Player.Attributes.Blocker;
import main.Player.Attributes.Universal;

public class OffensiveTackle extends Person {
    private Blocker blocker;
    private Universal universal;

    public OffensiveTackle() {
        super(Position.OT);
        blocker = new Blocker(70, 70, 60);
        universal = new Universal(75, 55, 55, 55, 65, 60, 40, 75);
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
