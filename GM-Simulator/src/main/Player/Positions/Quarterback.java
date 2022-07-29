package main.Player.Positions;

import main.Player.Person;
import main.Player.Position;
import main.Player.Attributes.Passer;
import main.Player.Attributes.Runner;
import main.Player.Attributes.Universal;

public class Quarterback extends Person {

	private Passer passer;
	private Universal universal;
	private Runner runner;

	public Quarterback() {
		super(Position.QB);
	}

}
