package main.Player.Positions;

import main.Player.Person;
import main.Player.PositionName;
import main.Player.Attributes.DefendAir;
import main.Player.Attributes.DefendGround;
import main.Player.Attributes.Universal;

public class Cornerback extends Person {
    public DefendAir defendAir;
    public DefendGround defendGround;
    public Universal universal;

    public Cornerback() {
        super(PositionName.CB);
        defendAir = new DefendAir(65,65,60,65,55,65);
        defendGround = new DefendGround(55,35,30,30,40,55,50);
        universal = new Universal(60, 70, 70, 70, 60, 70, 75, 60);
    }

    public int overall(){
        return (defendGround.sumOverall()/5 + defendAir.sumOverall()/6 + universal.sumOverall()/8)/3;
    }

    public int potential(){
        return (defendGround.sumPotential()/5 + defendAir.sumPotential()/6 + universal.sumPotential()/8)/3;
    }

    public String toString(){
        return "Cornerback: " + defendAir.toString() + defendGround.toString() + universal.toString();
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
