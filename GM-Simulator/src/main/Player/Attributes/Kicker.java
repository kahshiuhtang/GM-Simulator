package main.Player.Attributes;

public class Kicker {
	private int kickPower, kickAccuracy;
	
	protected Kicker() {
	
	}
	
	public int getKickPower() {
		return kickPower;
	}

	public void setKickPower(int kickPower) {
		this.kickPower = kickPower;
	}

	public int getKickAccuracy() {
		return kickAccuracy;
	}

	public void setKickAccuracy(int kickAccuracy) {
		this.kickAccuracy = kickAccuracy;
	}
}
