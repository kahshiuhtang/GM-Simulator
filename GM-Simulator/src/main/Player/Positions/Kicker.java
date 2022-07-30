package main.Player.Positions;

import main.Player.Person;
import main.Player.Position;
import main.Player.Attributes.Kick;
import main.Player.Attributes.Universal;

public class Kicker extends Person{
	public Kick kick;
	private Universal universal;
	public Kicker() {
		super(Position.K);
		kick = new Kick(65, 70);
		universal = new Universal(40, 45, 50, 45, 70, 55, 35, 45);
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
