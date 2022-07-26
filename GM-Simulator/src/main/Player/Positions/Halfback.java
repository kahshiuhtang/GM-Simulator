package main.Player.Positions;

import main.Player.Attributes.*;
import main.Player.Person;
import main.Player.PositionName;

public class Halfback extends Person {
	private Blocker blocker;
	private Receiver receiver;
	private Runner runner;
	private Universal universal;

	public Halfback() {
		super(PositionName.HB);
		blocker = new Blocker(50, 50, 35);
		receiver = new Receiver(55, 50, 50,35);
		runner = new Runner(65, 70, 60, 65, 70, 60);
		universal = new Universal(60, 70, 65, 70, 60, 65, 70, 65);
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
		return (((int)(blocker.sumOverall()/2.1)) + receiver.sumOverall()/3 + runner.sumOverall()/6 + universal.sumOverall()/8)/4;
	}
	public int potential(){
		return (((int)(blocker.sumPotential()/2.1)) + receiver.sumPotential()/3 + runner.sumPotential()/6 + universal.sumPotential()/8)/4;
	}
	public String toString(){
		return "Halfback: " + blocker.toString() + receiver.toString() + runner.toString() + universal.toString();
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
