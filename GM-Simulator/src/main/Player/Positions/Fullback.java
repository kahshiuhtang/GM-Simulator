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
		blocker = new Blocker(60, 60, 50);
		receiver = new Receiver(45, 40, 40, 30);
		runner = new Runner(70, 55, 55, 70, 55, 55);
		universal = new Universal(65, 60, 60, 55, 65, 55, 50, 70);
	}

	public String toString(){
		return blocker.toString() + receiver.toString() + runner.toString() + universal.toString();
	}

	public Blocker getBlocker() {
		return blocker;
	}

	public void setBlocker(Blocker blocker) {
		this.blocker = blocker;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public Runner getRunner() {
		return runner;
	}

	public void setRunner(Runner runner) {
		this.runner = runner;
	}

	public Universal getUniversal() {
		return universal;
	}

	public void setUniversal(Universal universal) {
		this.universal = universal;
	}
}
