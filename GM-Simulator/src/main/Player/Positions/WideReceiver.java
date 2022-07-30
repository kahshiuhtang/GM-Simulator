package main.Player.Positions;

import main.Player.Person;
import main.Player.Position;
import main.Player.Attributes.Blocker;
import main.Player.Attributes.Receiver;
import main.Player.Attributes.Runner;
import main.Player.Attributes.Universal;

public class WideReceiver extends Person {

	private Blocker blocker;
	private Receiver receiver;
	private Runner runner;
	private Universal universal;

	public WideReceiver() {
		super(Position.WR);
		blocker = new Blocker(35, 35, 20);
		receiver = new Receiver(65, 60, 65, 55);
		runner = new Runner(45, 60, 55, 60, 65, 50);
		universal = new Universal(55, 65, 70, 70, 55, 60, 75, 60);

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
