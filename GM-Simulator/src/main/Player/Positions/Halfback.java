package main.Player.Positions;

import main.Player.Person;
import main.Player.Position;
import main.Player.Attributes.Blocker;
import main.Player.Attributes.Receiver;
import main.Player.Attributes.Runner;
import main.Player.Attributes.Universal;

public class Halfback extends Person {
	private Blocker blocker;
	private Receiver receiver;
	private Runner runner;
	private Universal universal;

	public Halfback() {
		super(Position.HB);
		blocker = new Blocker(50, 50, 35);
		receiver = new Receiver(55, 50, 50,35);
		runner = new Runner(65, 70, 60, 65, 70, 60);
		universal = new Universal(60, 70, 65, 70, 60, 65, 70, 65);
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
