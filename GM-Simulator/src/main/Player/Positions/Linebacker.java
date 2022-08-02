package main.Player.Positions;

import main.Player.Attributes.Attribute;
import main.Player.Person;
import main.Player.PositionName;
import main.Player.Attributes.DefendAir;
import main.Player.Attributes.DefendGround;
import main.Player.Attributes.Universal;

public class Linebacker extends Person {

	public DefendAir defendAir;
	public DefendGround defendGround;
	public Universal universal;

	public Linebacker() {
		super(PositionName.LB);
		defendAir = new DefendAir(60, 55, 60, 50, 55, 55);
		defendGround = new DefendGround(60, 55, 50, 60, 70, 70, 65);
		universal = new Universal(70, 65, 65, 65, 65, 75, 70, 70);
	}
	public int avgMainTraitOverall(){
		return (defendAir.sumOverall() + defendGround.sumOverall())/2;
	}
	public int avgMainTraitPotential(){
		return (defendAir.sumPotential() + defendGround.sumPotential())/2;
	}
	public Attribute[] getAttributes(){
		Attribute[] ans = {defendAir, defendGround, universal};
		return ans;
	}
	public int overall(){
		return (defendGround.sumOverall()/7 + defendAir.sumOverall()/5 + universal.sumOverall()/8)/3;
	}

	public int potential(){
		return (defendGround.sumPotential()/7 + defendAir.sumPotential()/5 + universal.sumPotential()/8)/3;
	}

	public String toString(){
		return "Linebacker: " +defendAir.toString() + defendGround.toString() + universal.toString();
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
