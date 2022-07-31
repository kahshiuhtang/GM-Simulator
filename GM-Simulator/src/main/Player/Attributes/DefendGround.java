package main.Player.Attributes;

import java.util.Random;

public class DefendGround {
	private int tackle, powerRush, skillRush, blockShed, runStop, playRecognition, hitPower;
	private int tacklePot, powerRushPot, skillRushPot, blockShedPot, runStopPot, playRecognitionPot, hitPowerPot;

	public DefendGround(int t, int pR, int sR, int bS, int rS, int plR, int hP) {
		Random r = new Random();
		double sd = r.nextGaussian();
		tacklePot = t + (int)(sd*13.5+r.nextDouble()*7);
		powerRushPot = pR + (int)(sd*13.5+r.nextDouble()*7);
		skillRushPot = sR + (int)(sd*13.5+r.nextDouble()*7);
		blockShedPot = bS + (int)(sd*13.5+r.nextDouble()*7);
		runStopPot = rS + (int)(sd*13.5+r.nextDouble()*7);
		playRecognitionPot = plR + (int)(sd*13.5+r.nextDouble()*7);
		hitPowerPot = hP + (int)(sd*13.5+r.nextDouble()*7);
		sd = Math.abs(r.nextGaussian());
		tackle = tacklePot -  13 - ((int) (sd*5));
		powerRush =  powerRushPot - 13 - ((int) (sd*5));
		skillRush = skillRushPot - 13 - ((int) (sd*5));
		blockShed = blockShedPot - 13 - ((int) (sd*5));
		runStop = runStopPot - 13 - ((int) (sd*5));
		playRecognition = playRecognitionPot - 13 - ((int) (sd*5));
		hitPower = hitPowerPot - 13 - ((int) (sd*5));
	}

	public int sumOverall(){
		return  tackle + powerRush + skillRush + blockShed + runStop + playRecognition + hitPower;
	}

	public int sumPotential(){
		return tacklePot + powerRushPot + skillRushPot + blockShedPot + runStopPot + playRecognitionPot + hitPowerPot;
	}

	public String toString(){
		return "Tackle: " + tackle + "/" + tacklePot + " Power Rush: " +
		powerRush + "/" +  powerRushPot + " Skill Rush: " +
		skillRush + "/" + skillRushPot + " Block Shed: " +
		blockShed + "/" + blockShedPot + " Run Stop: " +
		runStop + "/" + runStopPot + " Play Recognition: " +
		playRecognition + "/" + playRecognitionPot + " Hit Power: " +
		hitPower + "/" + hitPowerPot;
	}

	public int getTackle() {
		return tackle;
	}

	public void setTackle(int tackle) {
		this.tackle = tackle;
	}

	public int getPowerRush() {
		return powerRush;
	}

	public void setPowerRush(int powerRush) {
		this.powerRush = powerRush;
	}

	public int getSkillRush() {
		return skillRush;
	}

	public void setSkillRush(int skillRush) {
		this.skillRush = skillRush;
	}

	public int getBlockShed() {
		return blockShed;
	}

	public void setBlockShed(int blockShed) {
		this.blockShed = blockShed;
	}

	public int getRunStop() {
		return runStop;
	}

	public void setRunStop(int runStop) {
		this.runStop = runStop;
	}

	public int getPlayRecognition() {
		return playRecognition;
	}

	public void setPlayRecognition(int playRecognition) {
		this.playRecognition = playRecognition;
	}

	public int getHitPower() {
		return hitPower;
	}

	public void setHitPower(int hitPower) {
		this.hitPower = hitPower;
	}

	public int getTacklePot() {
		return tacklePot;
	}

	public void setTacklePot(int tacklePot) {
		this.tacklePot = tacklePot;
	}

	public int getPowerRushPot() {
		return powerRushPot;
	}

	public void setPowerRushPot(int powerRushPot) {
		this.powerRushPot = powerRushPot;
	}

	public int getSkillRushPot() {
		return skillRushPot;
	}

	public void setSkillRushPot(int skillRushPot) {
		this.skillRushPot = skillRushPot;
	}

	public int getBlockShedPot() {
		return blockShedPot;
	}

	public void setBlockShedPot(int blockShedPot) {
		this.blockShedPot = blockShedPot;
	}

	public int getRunStopPot() {
		return runStopPot;
	}

	public void setRunStopPot(int runStopPot) {
		this.runStopPot = runStopPot;
	}

	public int getPlayRecognitionPot() {
		return playRecognitionPot;
	}

	public void setPlayRecognitionPot(int playRecognitionPot) {
		this.playRecognitionPot = playRecognitionPot;
	}

	public int getHitPowerPot() {
		return hitPowerPot;
	}

	public void setHitPowerPot(int hitPowerPot) {
		this.hitPowerPot = hitPowerPot;
	}
}
