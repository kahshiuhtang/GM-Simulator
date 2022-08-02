package main.Player.Positions;

import main.Player.Attributes.Attribute;
import main.Player.Person;
import main.Player.PositionName;
import main.Player.Attributes.DefendAir;
import main.Player.Attributes.DefendGround;
import main.Player.Attributes.Universal;

public class DefensiveTackle extends Person {

	public DefendAir defendAir;
	public DefendGround defendGround;
	public Universal universal;

	public DefensiveTackle() {
		super(PositionName.DT);
		defendAir = new DefendAir(50, 50, 40, 25, 25, 40);
		defendGround = new DefendGround(65, 60, 60, 65, 70, 45, 65);
		universal = new Universal(75, 55, 55, 50, 65, 65, 50, 75);
	}

	public Attribute[] getAttributes(){
		Attribute[] ans = {defendAir, defendGround, universal};
		return ans;
	}
	public int overall(){
		return (defendGround.sumOverall()/7 + ((int)(defendAir.sumPotential()/3.5)) + universal.sumOverall()/8)/3;
	}

	public int potential(){
		return (defendGround.sumPotential()/7 + ((int)(defendAir.sumPotential()/3.5)) + universal.sumPotential()/8)/3;
	}

	public String toString(){
		return "Defensive Tackle: " + defendAir.toString() + defendGround.toString() + universal.toString();
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
