package main.Player.Attributes;

import java.util.Random;

public class Blocker extends Attribute{

	private int passBlock, runBlock, pancake;

	private int passBlockPot, runBlockPot, pancakePot;

	public Blocker(int pB, int rB, int p) {
		Random r = new Random();
		double sd = r.nextGaussian();
		passBlockPot = pB + (int)(sd*13.5+r.nextDouble()*7);
		runBlockPot = rB + (int)(sd*13.5+r.nextDouble()*7);
		pancakePot = p + (int)(sd*13.5+r.nextDouble()*7);
		sd = Math.abs(r.nextGaussian());
		passBlock = passBlockPot - 13 - ((int) (sd*5));
		runBlock = runBlockPot - 13 - ((int) (sd*5));
		pancake = pancakePot - 13 - ((int) (sd*5));
	}
	public int sumOverall(){
		return passBlock + runBlock + pancake;
	}
	public int sumPotential(){
		return passBlockPot + runBlockPot + pancakePot;
	}
	public String toString(){
		return "Pass Block: "+ passBlock  + "/" + passBlockPot + " Run Block: " + runBlock + "/" + runBlockPot +" Pancake: " + pancake + "/" + pancakePot;
	}

	public int getPassBlock() {
		return passBlock;
	}

	public void setPassBlock(int passBlock) {
		this.passBlock = passBlock;
	}

	public int getRunBlock() {
		return runBlock;
	}

	public void setRunBlock(int runBlock) {
		this.runBlock = runBlock;
	}

	public int getPancake() {
		return pancake;
	}

	public void setPancake(int pancake) {
		this.pancake = pancake;
	}

	public int getPassBlockPot() {
		return passBlockPot;
	}

	public void setPassBlockPot(int passBlockPot) {
		this.passBlockPot = passBlockPot;
	}

	public int getRunBlockPot() {
		return runBlockPot;
	}

	public void setRunBlockPot(int runBlockPot) {
		this.runBlockPot = runBlockPot;
	}

	public int getPancakePot() {
		return pancakePot;
	}

	public void setPancakePot(int pancakePot) {
		this.pancakePot = pancakePot;
	}
}