package main.Player;

public class Person {
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

	public int overall() {
		return 0;
	}
	public int potential(){
		return 0;
	}
}
