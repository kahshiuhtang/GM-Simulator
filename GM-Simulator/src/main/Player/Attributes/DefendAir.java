package main.Player.Attributes;

public class DefendAir {
	private int pursuit, manCoverage, zoneCoverage, press, highlightReel;
	private int pursuitPot, manCoveragePot, zoneCoveragePot, pressPot, catchingPot, highlightReelPot;
	protected DefendAir() {
		
	}

	public int getPursuit() {
		return pursuit;
	}

	public void setPursuit(int pursuit) {
		this.pursuit = pursuit;
	}

	public int getManCoverage() {
		return manCoverage;
	}

	public void setManCoverage(int manCoverage) {
		this.manCoverage = manCoverage;
	}

	public int getZoneCoverage() {
		return zoneCoverage;
	}

	public void setZoneCoverage(int zoneCoverage) {
		this.zoneCoverage = zoneCoverage;
	}

	public int getPress() {
		return press;
	}

	public void setPress(int press) {
		this.press = press;
	}

	public int getHighlightReel() {
		return highlightReel;
	}

	public void setHighlightReel(int highlightReel) {
		this.highlightReel = highlightReel;
	}
}