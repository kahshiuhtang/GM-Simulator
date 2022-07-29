package main.Player.Positions;

import main.Player.Person;
import main.Player.Position;
import main.Player.Attributes.Blocker;
import main.Player.Attributes.Receiver;
import main.Player.Attributes.Runner;
import main.Player.Attributes.Universal;

public class Fullback extends Person {
	private Blocker blocker;
	private Receiver receiver;
	private Runner runner;
	private Universal universal;

	public Fullback() {
		super(Position.FB);
	}

}
