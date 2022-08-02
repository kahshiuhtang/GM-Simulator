package main.Player.Positions;

import main.Player.Attributes.*;
import main.Player.Person;
import main.Player.PositionName;

public class WideReceiver extends Person {

	private Blocker blocker;
	private Receiver receiver;
	private Runner runner;
	private Universal universal;

	public WideReceiver() {
		super(PositionName.WR);
		blocker = new Blocker(35, 35, 20);
		receiver = new Receiver(65, 60, 65, 55);
		runner = new Runner(45, 60, 55, 60, 65, 50);
		universal = new Universal(55, 65, 70, 70, 55, 60, 75, 60);

	}

	public Attribute[] getAttributes(){
		Attribute[] ans = {blocker, receiver, runner, universal};
		return ans;
	}
	public int avgMainTraitOverall(){
		return receiver.sumOverall();
	}
	public int avgMainTraitPotential(){
		return receiver.sumPotential();
	}

	public int overall(){
		return (((int)(blocker.sumOverall()/1.5)) + receiver.sumOverall()/4 + runner.sumOverall()/5 + universal.sumOverall()/8)/4;
	}
	public int potential(){
		return (((int)(blocker.sumPotential()/1.5)) + receiver.sumPotential()/4 + runner.sumPotential()/5 + universal.sumPotential()/8)/4;
	}

	public String toString(){
		return "Wide Receiver: " +blocker.toString() + receiver.toString() + runner.toString() + universal.toString();
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
