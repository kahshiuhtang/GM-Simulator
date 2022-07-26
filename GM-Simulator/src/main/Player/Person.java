package main.Player;

import main.Player.Attributes.Attributes;

public class Person {
	private Attributes attributes;
	private Stats stats;
	private Position position;
	private Badges badges;
	private PersonalProfile profile;
	
	public Person(Position p) {
		attributes = new Attributes();
		stats = new Stats();
		badges = new Badges();
		profile = new PersonalProfile(p);
		position = p;
	}

}
