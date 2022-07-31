package main.Player.Positions;

import main.Player.Person;
import main.Player.PositionName;
import main.Player.Attributes.DefendAir;
import main.Player.Attributes.DefendGround;
import main.Player.Attributes.Universal;

public class Safety extends Person {

    public DefendAir defendAir;
    public DefendGround defendGround;
    public Universal universal;

    public Safety() {
        super(PositionName.S);
        defendAir = new DefendAir(60, 60, 65, 60, 50, 65);
        defendGround = new DefendGround(60, 50, 45, 45, 55, 65, 55);
        universal = new Universal(65, 65, 70, 70, 60, 70, 70, 65);
    }

    public int overall(){
        return (defendGround.sumOverall()/7 + defendAir.sumOverall()/6 + universal.sumOverall()/8)/3;
    }

    public int potential(){
        return (defendGround.sumPotential()/7 + defendAir.sumPotential()/6 + universal.sumPotential()/8)/3;
    }

    public String toString(){
        return "Safety: " + defendAir.toString() + defendGround.toString() + universal.toString();
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
