package main.Player.Attributes;

public class Attributes {
	private Blocker b;
	private DefendAir dA;
	private DefendGround dG;
	private Kicker k;
	private Passer p;
	private Receiver re;
	private Runner ru;
	private Universal u;
	public Attributes() {
		b = new Blocker();
		dA = new DefendAir();
		dG = new DefendGround();
		k = new Kicker();
		p = new Passer();
		re = new Receiver();
		ru = new Runner();
		u = new Universal();
	}
}
