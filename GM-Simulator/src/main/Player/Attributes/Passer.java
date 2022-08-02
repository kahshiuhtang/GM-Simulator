package main.Player.Attributes;

import java.util.Random;

public class Passer extends Attribute{
	private int throwPower, shortAccuracy, mediumAccuracy, deepAccuracy, improvisation, underPressure, riskTaking;

	private int throwPowerPot, shortAccuracyPot, mediumAccuracyPot, deepAccuracyPot, improvisationPot, underPressurePot,
			riskTakingPot;
	public Passer(int tP, int sA, int mA, int dA, int i, int uP, int rT) {
		Random r = new Random();
		double sd = r.nextGaussian();
		throwPowerPot = tP + + (int)(sd*13.5+r.nextDouble()*7);
		shortAccuracyPot = sA +  (int)(sd*13.5+r.nextDouble()*7);
		mediumAccuracyPot = mA +  (int)(sd*13.5+r.nextDouble()*7);
		deepAccuracyPot =  dA + (int)(sd*13.5+r.nextDouble()*7);
		improvisationPot = i + (int)(sd*13.5+r.nextDouble()*7);
		underPressurePot = uP + (int)(sd*13.5+r.nextDouble()*7);
		riskTakingPot = rT + (int)(sd*13.5+r.nextDouble()*7);
		sd = Math.abs(r.nextGaussian());
		throwPower = throwPowerPot -  13 - ((int) (sd*5));
		shortAccuracy = shortAccuracyPot -  13 - ((int) (sd*5));
		mediumAccuracy = mediumAccuracyPot -  13 - ((int) (sd*5));
		deepAccuracy = deepAccuracyPot -  13 - ((int) (sd*5));
		improvisation = improvisationPot -  13 - ((int) (sd*5));
		underPressure = underPressurePot -  13 - ((int) (sd*5));
		riskTaking = riskTakingPot -  13 - ((int) (sd*5));
	}

	public int avgOverall(){
		return sumOverall()/7;
	}

	public int avgPotential(){
		return sumPotential()/7;
	}

	public int sumOverall(){
		return throwPower + shortAccuracy + mediumAccuracy + deepAccuracy + improvisation + underPressure + riskTaking;
	}

	public int sumPotential(){
		return throwPowerPot + shortAccuracyPot + mediumAccuracyPot + deepAccuracyPot + improvisationPot + underPressurePot + riskTakingPot;
	}

	public String toString(){
		return " Throw Power: " + throwPower + "/" + throwPowerPot + " Short Accuracy: " +
		shortAccuracy + "/" + shortAccuracyPot + " Medium Accuracy: "+
		mediumAccuracy + "/" + mediumAccuracyPot + " Deep Accuracy: " +
		deepAccuracy + "/" + deepAccuracyPot + " Improvisation: " +
		improvisation + "/" + improvisationPot + " Under Pressure: " +
		underPressure + "/" + underPressurePot + " Risk Taking: " +
		riskTaking + "/" + riskTakingPot;
	}

	public int getThrowPower() {
		return throwPower;
	}

	public void setThrowPower(int throwPower) {
		this.throwPower = throwPower;
	}

	public int getShortAccuracy() {
		return shortAccuracy;
	}

	public void setShortAccuracy(int shortAccuracy) {
		this.shortAccuracy = shortAccuracy;
	}

	public int getMediumAccuracy() {
		return mediumAccuracy;
	}

	public void setMediumAccuracy(int mediumAccuracy) {
		this.mediumAccuracy = mediumAccuracy;
	}

	public int getDeepAccuracy() {
		return deepAccuracy;
	}

	public void setDeepAccuracy(int deepAccuracy) {
		this.deepAccuracy = deepAccuracy;
	}

	public int getImprovisation() {
		return improvisation;
	}

	public void setImprovisation(int improvisation) {
		this.improvisation = improvisation;
	}

	public int getUnderPressure() {
		return underPressure;
	}

	public void setUnderPressure(int underPressure) {
		this.underPressure = underPressure;
	}

	public int getRiskTaking() {
		return riskTaking;
	}

	public void setRiskTaking(int riskTaking) {
		this.riskTaking = riskTaking;
	}

	public int getThrowPowerPot() {
		return throwPowerPot;
	}

	public void setThrowPowerPot(int throwPowerPot) {
		this.throwPowerPot = throwPowerPot;
	}

	public int getShortAccuracyPot() {
		return shortAccuracyPot;
	}

	public void setShortAccuracyPot(int shortAccuracyPot) {
		this.shortAccuracyPot = shortAccuracyPot;
	}

	public int getMediumAccuracyPot() {
		return mediumAccuracyPot;
	}

	public void setMediumAccuracyPot(int mediumAccuracyPot) {
		this.mediumAccuracyPot = mediumAccuracyPot;
	}

	public int getDeepAccuracyPot() {
		return deepAccuracyPot;
	}

	public void setDeepAccuracyPot(int deepAccuracyPot) {
		this.deepAccuracyPot = deepAccuracyPot;
	}

	public int getImprovisationPot() {
		return improvisationPot;
	}

	public void setImprovisationPot(int improvisationPot) {
		this.improvisationPot = improvisationPot;
	}

	public int getUnderPressurePot() {
		return underPressurePot;
	}

	public void setUnderPressurePot(int underPressurePot) {
		this.underPressurePot = underPressurePot;
	}

	public int getRiskTakingPot() {
		return riskTakingPot;
	}

	public void setRiskTakingPot(int riskTakingPot) {
		this.riskTakingPot = riskTakingPot;
	}
}
