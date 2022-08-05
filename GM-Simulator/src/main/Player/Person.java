package main.Player;

import main.Player.Attributes.Attribute;
import main.Player.Stats.PlayerHistory;

public abstract class Person {
	private PlayerHistory history;
	private PositionName positionName;
	private Badges badges;
	private PersonalProfile profile;

	public Person(PositionName p) {
		history = new PlayerHistory();
		badges = new Badges();
		profile = new PersonalProfile(p);
		positionName = p;
	}

	public PlayerHistory getHistory() {
		return history;
	}

	public PositionName getPositionName() {
		return positionName;
	}

	public Badges getBadges() {
		return badges;
	}

	public PersonalProfile getProfile() {
		return profile;
	}

	public abstract int overall();
	public abstract int potential();
	public abstract Attribute[] getAttributes();

	public abstract int avgMainTraitOverall();


}
