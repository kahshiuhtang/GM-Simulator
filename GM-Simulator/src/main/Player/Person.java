package main.Player;

public class Person {
	private Stats stats;
	private Position position;
	private Badges badges;
	private PersonalProfile profile;

	public Person(Position p) {
		stats = new Stats();
		badges = new Badges();
		profile = new PersonalProfile(p);
		position = p;
	}

}
