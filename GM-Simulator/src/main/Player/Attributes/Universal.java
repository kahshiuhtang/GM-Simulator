package main.Player.Attributes;

import java.util.Random;

public class Universal extends Attribute{

	private int strength, agility, speed, acceleration, stamina, awareness, jumping, toughness;

	private int strengthPot, agilityPot, speedPot, accelerationPot, staminaPot, awarenessPot, jumpingPot, toughnessPot;

	public Universal(int s, int a, int sp, int ac, int st, int aw, int j, int t) {
		Random r = new Random();
		double sd = r.nextGaussian();
		strengthPot = s + (int)(sd*13.5+r.nextDouble()*7);
		agilityPot = a + (int)(sd*13.5+r.nextDouble()*7);
		speedPot = sp + (int)(sd*13.5+r.nextDouble()*7);
		accelerationPot = ac + (int)(sd*13.5+r.nextDouble()*7);
		staminaPot = st + (int)(sd*13.5+r.nextDouble()*7);
		awarenessPot =  aw + (int)(sd*13.5+r.nextDouble()*7);
		jumpingPot = j + (int)(sd*13.5+r.nextDouble()*7);
		toughnessPot = t +(int)(sd*13.5+r.nextDouble()*7);
		sd = Math.abs(r.nextGaussian());
		strength = strengthPot -  13 - ((int) (sd*5));
		agility = agilityPot -  13 - ((int) (sd*5));
		speed  = speedPot -  13 - ((int) (sd*5));
		acceleration = accelerationPot -  13 - ((int) (sd*5));
		stamina = staminaPot -  13 - ((int) (sd*5));
		awareness = awarenessPot -  13 - ((int) (sd*5));
		jumping = jumpingPot -  13 - ((int) (sd*5));
		toughness=toughnessPot -  13 - ((int) (sd*5));
	}

	public int avgOverall(){
		return sumOverall()/8;
	}

	public int avgPotential(){
		return sumPotential()/8;
	}

	public int sumOverall(){
		return strength + agility + speed + acceleration + stamina + awareness + jumping + toughness;
	}

	public int sumPotential(){
		return strengthPot + agilityPot + speedPot + accelerationPot + staminaPot + awarenessPot + jumpingPot + toughnessPot;
	}

	public String toString(){
		return "Strength: " + strength + "/" + strengthPot + " Agility: " +
		agility + "/" + agilityPot + " Speed: " +
		speed  + "/" + speedPot + " Acceleration: "+
		acceleration + "/" + accelerationPot + " Stamina: " +
		stamina + "/" + staminaPot + " Awareness: " +
		awareness + "/" + awarenessPot + " Jumping: " +
		jumping + "/" + jumpingPot + " Toughness: " +
		toughness + "/" + toughnessPot;
	}


	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public int getAwareness() {
		return awareness;
	}

	public void setAwareness(int awareness) {
		this.awareness = awareness;
	}

	public int getJumping() {
		return jumping;
	}

	public void setJumping(int jumping) {
		this.jumping = jumping;
	}

	public int getToughness() {
		return toughness;
	}

	public void setToughness(int toughness) {
		this.toughness = toughness;
	}

	public int getStrengthPot() {
		return strengthPot;
	}

	public void setStrengthPot(int strengthPot) {
		this.strengthPot = strengthPot;
	}

	public int getAgilityPot() {
		return agilityPot;
	}

	public void setAgilityPot(int agilityPot) {
		this.agilityPot = agilityPot;
	}

	public int getSpeedPot() {
		return speedPot;
	}

	public void setSpeedPot(int speedPot) {
		this.speedPot = speedPot;
	}

	public int getAccelerationPot() {
		return accelerationPot;
	}

	public void setAccelerationPot(int accelerationPot) {
		this.accelerationPot = accelerationPot;
	}

	public int getStaminaPot() {
		return staminaPot;
	}

	public void setStaminaPot(int staminaPot) {
		this.staminaPot = staminaPot;
	}

	public int getAwarenessPot() {
		return awarenessPot;
	}

	public void setAwarenessPot(int awarenessPot) {
		this.awarenessPot = awarenessPot;
	}

	public int getJumpingPot() {
		return jumpingPot;
	}

	public void setJumpingPot(int jumpingPot) {
		this.jumpingPot = jumpingPot;
	}

	public int getToughnessPot() {
		return toughnessPot;
	}

	public void setToughnessPot(int toughnessPot) {
		this.toughnessPot = toughnessPot;
	}
}
