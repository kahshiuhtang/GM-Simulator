package main.Player.Positions;

import main.Player.Attributes.Attribute;
import main.Player.Person;
import main.Player.PositionName;
import main.Player.Attributes.Passer;
import main.Player.Attributes.Runner;
import main.Player.Attributes.Universal;

public class Quarterback extends Person {

	private Passer passer;
	private Universal universal;
	private Runner runner;

	public Quarterback() {
		super(PositionName.QB);
		passer = new Passer(65, 75, 70, 65, 65, 60, 60);
		universal = new Universal(40, 45, 50, 40, 40, 65, 35, 50);
		runner = new Runner(30, 50, 45, 45, 35, 50);
	}

	public Attribute[] getAttributes(){
		Attribute[] ans = {passer, runner, universal};
		return ans;
	}
	public int overall(){
		return (passer.sumOverall()/6 + universal.sumOverall()/8 + runner.sumOverall()/4)/3;
	}

	public int potential(){
		return(passer.sumPotential()/6 + universal.sumPotential()/8 + runner.sumPotential()/4)/3;
	}
	public String toString(){
		return "Quarterback: " +passer.toString() + universal.toString() + runner.toString();
	}

	public Passer getPasser() {
		return passer;
	}

	public void setPasser(Passer passer) {
		this.passer = passer;
	}

	public Universal getUniversal() {
		return universal;
	}

	public void setUniversal(Universal universal) {
		this.universal = universal;
	}

	public Runner getRunner() {
		return runner;
	}

	public void setRunner(Runner runner) {
		this.runner = runner;
	}
}
