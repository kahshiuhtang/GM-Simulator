package main.Player.Attributes;

public class Blocker {
	private int passBlock, runBlock, pancake;
	private int passBlockPot, runBlockPot, pancakePot;
	protected Blocker() {
		
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
}