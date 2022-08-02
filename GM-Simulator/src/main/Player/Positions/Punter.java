package main.Player.Positions;

import main.Player.Attributes.Attribute;
import main.Player.Person;
import main.Player.PositionName;
import main.Player.Attributes.Kick;
import main.Player.Attributes.Universal;

public class Punter extends Person {

	private Kick kick;
	private Universal universal;

	public Punter() {
		super(PositionName.P);
		kick = new Kick(70, 65);
		universal = new Universal(40, 45, 50, 50, 70, 55, 35, 55);
	}

	public int avgMainTraitOverall(){
		return kick.sumOverall();
	}
	public int avgMainTraitPotential(){
		return kick.sumPotential();
	}

	public Attribute[] getAttributes(){
		Attribute[] ans = {kick, universal};
		return ans;
	}
	public int overall(){
		return (kick.sumOverall()/2 + universal.sumOverall()/6)/2;
	}

	public int potential(){
		return (kick.sumPotential()/2 + universal.sumPotential()/6)/2;
	}

	public String toString(){
		return "Punter: " + kick.toString() + universal.toString();
	}

	public Kick getKick() {
		return kick;
	}

	public void setKick(Kick kick) {
		this.kick = kick;
	}

	public Universal getUniversal() {
		return universal;
	}

	public void setUniversal(Universal universal) {
		this.universal = universal;
	}
}
