package main.Player.Positions;

import main.Player.Attributes.Attribute;
import main.Player.Person;
import main.Player.PositionName;
import main.Player.Attributes.Kick;
import main.Player.Attributes.Universal;

public class Kicker extends Person{
	public Kick kick;
	private Universal universal;
	public Kicker() {
		super(PositionName.K);
		kick = new Kick(65, 70);
		universal = new Universal(40, 45, 50, 45, 70, 55, 35, 45);
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
		return "Kicker: " + kick.toString() + universal.toString();
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
