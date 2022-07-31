package main.Player.Attributes;

import java.util.Random;

public class Kick {
	private int kickPower, kickAccuracy;
	private int kickPowerPot, kickAccuracyPot;

	public Kick(int kP, int kA) {
		Random r = new Random();
		double sd = r.nextGaussian();
		kickPowerPot = kP + (int)(sd*13.5+r.nextDouble()*7);
		kickAccuracyPot = kA + (int)(sd*13.5+r.nextDouble()*7);
		sd = Math.abs(r.nextGaussian());
		kickPower = kickPowerPot -  13 - ((int) (sd*5));
		kickAccuracy = kickAccuracyPot -  13 - ((int) (sd*5));
	}

	public int sumOverall(){
		return kickPower + kickAccuracy;
	}

	public int sumPotential(){
		return kickPowerPot + kickAccuracyPot;
	}

	public String toString(){
		return "KickPower: " + kickPower + "/" + kickPowerPot + " Kick Accuracy: " +
		kickAccuracy + "/" + kickAccuracyPot;
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

	public int getKickPowerPot() {
		return kickPowerPot;
	}

	public void setKickPowerPot(int kickPowerPot) {
		this.kickPowerPot = kickPowerPot;
	}

	public int getKickAccuracyPot() {
		return kickAccuracyPot;
	}

	public void setKickAccuracyPot(int kickAccuracyPot) {
		this.kickAccuracyPot = kickAccuracyPot;
	}
}
