package main.Player.Positions;

import main.Player.Attributes.Attribute;
import main.Player.Person;
import main.Player.PositionName;
import main.Player.Attributes.Blocker;
import main.Player.Attributes.Universal;

public class OffensiveGuard extends Person {
	private Blocker blocker;
	private Universal universal;

	public OffensiveGuard() {
		super(PositionName.OG);
		blocker = new Blocker(65, 65, 55);
		universal = new Universal(70, 50, 45, 40, 70, 60, 40, 75);
	}
	public int avgMainTraitOverall(){
		return blocker.sumOverall();
	}
	public int avgMainTraitPotential(){
		return blocker.sumPotential();
	}

	public Attribute[] getAttributes(){
		Attribute[] ans = {blocker, universal};
		return ans;
	}

	public int overall(){
		return (blocker.sumOverall()/3 + universal.sumOverall()/7)/2;
	}

	public int potential(){
		return (blocker.sumPotential()/3 + universal.sumPotential()/7)/2;
	}

	public String toString(){
		return "Offensive Guard: " + blocker.toString() + universal.toString();
	}

	public Blocker getBlocker() {
		return blocker;
	}

	public void setBlocker(Blocker blocker) {
		this.blocker = blocker;
	}

	public Universal getUniversal() {
		return universal;
	}

	public void setUniversal(Universal universal) {
		this.universal = universal;
	}
}
