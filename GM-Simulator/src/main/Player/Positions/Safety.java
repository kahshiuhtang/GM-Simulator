package main.Player.Positions;

import main.Player.Person;
import main.Player.Position;
import main.Player.Attributes.DefendAir;
import main.Player.Attributes.DefendGround;
import main.Player.Attributes.Universal;

public class Safety extends Person {

    public DefendAir defendAir;
    public DefendGround defendGround;
    public Universal universal;

    public Safety() {
        super(Position.S);
        defendAir = new DefendAir(60, 60, 65, 60, 50, 65);
        defendGround = new DefendGround(60, 50, 45, 45, 55, 65, 55);
        universal = new Universal(65, 65, 70, 70, 60, 70, 70, 65);
    }

    public String toString(){
        return defendAir.toString() + defendGround.toString() + universal.toString();
    }

    public DefendAir getDefendAir() {
        return defendAir;
    }

    public void setDefendAir(DefendAir defendAir) {
        this.defendAir = defendAir;
    }

    public DefendGround getDefendGround() {
        return defendGround;
    }

    public void setDefendGround(DefendGround defendGround) {
        this.defendGround = defendGround;
    }

    public Universal getUniversal() {
        return universal;
    }

    public void setUniversal(Universal universal) {
        this.universal = universal;
    }
}
