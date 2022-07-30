package main.Player.Attributes;

import java.util.Random;

public class Runner {
	private int truck, elusiveness, vision, carrying, skillMove, playRecognition;
	private int truckPot, elusivenessPot, visionPot, carryingPot, skillMovePot, playRecognitionPot;

	public Runner(int t, int e, int v, int c, int sM, int pR) {
		Random r = new Random();
		double sd = r.nextGaussian();
		truckPot = t + (int)(sd*13.5+r.nextDouble()*7);
		elusivenessPot = e + (int)(sd*13.5+r.nextDouble()*7);
		visionPot = v + (int)(sd*13.5+r.nextDouble()*7);
		carryingPot = c + (int)(sd*13.5+r.nextDouble()*7);
		skillMovePot = sM + (int)(sd*13.5+r.nextDouble()*7);
		playRecognitionPot = pR + (int)(sd*13.5+r.nextDouble()*7);
		sd = Math.abs(r.nextGaussian());
		truck = truckPot -  13 - ((int) (sd*5));
		elusiveness = elusivenessPot -  13 - ((int) (sd*5));
		vision = visionPot -  13 - ((int) (sd*5));
		carrying = carryingPot -  13 - ((int) (sd*5));
		skillMove = skillMovePot -  13 - ((int) (sd*5));
		playRecognition = playRecognitionPot -  13 - ((int) (sd*5));
	}

	public String toString(){
		return "Truck: " + truck + "/" + truckPot + " Elusiveness: " +
		elusiveness + "/" + elusivenessPot + " Vision: " +
		vision + "/" + visionPot + " Carrying: " +
		carrying + "/" + carryingPot + " Skill Move: " +
		skillMove + "/" + skillMovePot + " Play Recognition: " +
		playRecognition + "/" + playRecognitionPot;
	}

	public int getTruck() {
		return truck;
	}

	public void setTruck(int truck) {
		this.truck = truck;
	}

	public int getVision() {
		return vision;
	}

	public void setVision(int vision) {
		this.vision = vision;
	}

	public int getCarrying() {
		return carrying;
	}

	public void setCarrying(int carrying) {
		this.carrying = carrying;
	}

	public int getSkillMove() {
		return skillMove;
	}

	public void setSkill(int skillMove) {
		this.skillMove = skillMove;
	}

	public int getPlayRecognition() {
		return playRecognition;
	}

	public void setPlayRecognition(int playRecognition) {
		this.playRecognition = playRecognition;
	}

	public int getElusiveness() {
		return elusiveness;
	}

	public void setElusiveness(int elusiveness) {
		this.elusiveness = elusiveness;
	}

	public int getTruckPot() {
		return truckPot;
	}

	public void setTruckPot(int truckPot) {
		this.truckPot = truckPot;
	}

	public int getElusivePot() {
		return elusivenessPot;
	}

	public void setElusivePot(int elusivePot) {
		this.elusivenessPot = elusivePot;
	}

	public int getVisionPot() {
		return visionPot;
	}

	public void setVisionPot(int visionPot) {
		this.visionPot = visionPot;
	}

	public int getCarryingPot() {
		return carryingPot;
	}

	public void setCarryingPot(int carryingPot) {
		this.carryingPot = carryingPot;
	}

	public int getSkillPot() {
		return skillMovePot;
	}

	public void setSkillPot(int skillPot) {
		this.skillMovePot = skillMovePot;
	}

	public int getPlayRecognitionPot() {
		return playRecognitionPot;
	}

	public void setPlayRecognitionPot(int playRecognitionPot) {
		this.playRecognitionPot = playRecognitionPot;
	}

	public int getElusivenessPot() {
		return elusivenessPot;
	}

	public void setElusivenessPot(int elusivenessPot) {
		this.elusivenessPot = elusivenessPot;
	}
}
