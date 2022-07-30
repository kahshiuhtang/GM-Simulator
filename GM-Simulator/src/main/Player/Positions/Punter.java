package main.Player.Positions;

import main.Player.Person;
import main.Player.Position;
import main.Player.Attributes.Kick;
import main.Player.Attributes.Universal;

public class Punter extends Person {

	private Kick kick;
	private Universal universal;

	public Punter() {
		super(Position.P);
		kick = new Kick(70, 65);
		universal = new Universal(40, 45, 50, 50, 70, 55, 35, 55);
	}

	public String toString(){
		return kick.toString() + universal.toString();
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
