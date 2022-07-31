package main.Player;

import main.Player.Stats.Stats;

public abstract class Person {
	private Stats stats;
	private PositionName positionName;
	private Badges badges;
	private PersonalProfile profile;

	public Person(PositionName p) {
		stats = new Stats();
		badges = new Badges();
		profile = new PersonalProfile(p);
		positionName = p;
	}

	public abstract int overall();
	public abstract int potential();
}
