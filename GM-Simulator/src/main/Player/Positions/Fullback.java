package main.Player.Positions;

import main.Player.Attributes.*;
import main.Player.Person;
import main.Player.PositionName;

public class Fullback extends Person {
	private Blocker blocker;
	private Receiver receiver;
	private Runner runner;
	private Universal universal;

	public Fullback() {
		super(PositionName.FB);
		blocker = new Blocker(60, 60, 50);
		receiver = new Receiver(45, 40, 40, 30);
		runner = new Runner(70, 55, 55, 70, 55, 55);
		universal = new Universal(65, 60, 60, 55, 65, 55, 50, 70);
	}

	public int avgMainTraitOverall(){
		return runner.sumOverall();
	}
	public int avgMainTraitPotential(){
		return runner.sumPotential();
	}

	public Attribute[] getAttributes(){
		Attribute[] ans = {blocker, receiver, runner, universal};
		return ans;
	}
	public int overall(){
		return ((((int)(blocker.sumOverall()/2.7)) + ((int)(receiver.sumOverall()/2.5)) + runner.sumOverall()/6 + universal.sumOverall()/8)/4);
	}
	public int potential(){
		return (((int)(blocker.sumPotential()/2.7)) + ((int)(receiver.sumPotential()/2.5)) + runner.sumPotential()/6 + universal.sumPotential()/8)/4;
	}

	public String toString(){
		return "Fullback: " + blocker.toString() + receiver.toString() + runner.toString() + universal.toString();
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
