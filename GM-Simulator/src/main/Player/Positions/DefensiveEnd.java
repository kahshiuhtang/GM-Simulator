package main.Player.Positions;

import main.Player.Person;
import main.Player.Position;
import main.Player.Attributes.DefendAir;
import main.Player.Attributes.DefendGround;
import main.Player.Attributes.Universal;

public class DefensiveEnd extends Person {
    public DefendAir defendAir;
    public DefendGround defendGround;
    public Universal universal;

    public DefensiveEnd() {
        super(Position.DE);
        defendAir = new DefendAir(60, 50, 45, 30, 25, 45);
        defendGround = new DefendGround(70, 65, 65, 70, 65, 50, 70);
        universal = new Universal(75 ,60 ,60 ,60 ,65,65, 60 ,75);
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
