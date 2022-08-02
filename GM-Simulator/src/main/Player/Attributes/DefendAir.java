package main.Player.Attributes;

import java.util.Random;

public class DefendAir extends Attribute{
	private int pursuit, manCoverage, zoneCoverage, press, highlightReel, catching;

	private int pursuitPot, manCoveragePot, zoneCoveragePot, pressPot, catchingPot, highlightReelPot;
	
	public DefendAir(int p, int mC, int zC, int pr, int hR, int c) {
		Random r = new Random();
		double sd = r.nextGaussian();
		pursuitPot = p + (int)(sd*13.5+r.nextDouble()*7);
		manCoveragePot = mC + (int)(sd*13.5+r.nextDouble()*7);
		zoneCoveragePot = zC + (int)(sd*13.5+r.nextDouble()*7);
		pressPot = pr + (int)(sd*13.5+r.nextDouble()*7);
		highlightReelPot = hR + (int)(sd*13.5+r.nextDouble()*7);
		catchingPot = c + (int)(sd*13.5+r.nextDouble()*7);
		sd = Math.abs(r.nextGaussian());
		pursuit = pursuitPot - 13 - ((int) (sd*5));
		manCoverage = manCoveragePot - 13 - ((int) (sd*5));
		zoneCoverage = zoneCoveragePot - 13 - ((int) (sd*5));
		press = pressPot - 13 - ((int) (sd*5));
		highlightReel = highlightReelPot - 13 - ((int) (sd*5));
		catching = catchingPot - 13 - ((int) (sd*5));

	}

	public int avgOverall(){
		return sumOverall()/6;
	}

	public int avgPotential(){
		return sumPotential()/6;
	}

	public int sumOverall(){
		return pursuit + manCoverage + zoneCoverage + press + highlightReel + catching;
	}

	public int sumPotential(){
		return pursuitPot + manCoveragePot + zoneCoveragePot + pressPot + catchingPot + highlightReelPot;
	}
	public String toString(){
		return "Pursuit: " +pursuit + "/" + pursuitPot + " Man Coverage:" +
		manCoverage + "/" + manCoveragePot + " Zone Coverage:"+
		zoneCoverage + "/" + zoneCoveragePot + " Press:"+
		press + "/" + pressPot + " Highlight Reel:"+
		highlightReel + "/" + highlightReelPot + " Catching:"+
		catching + "/" + catchingPot;
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

	public int getCatching() {
		return catching;
	}

	public void setCatching(int catching) {
		this.catching = catching;
	}


	public int getPursuitPot() {
		return pursuitPot;
	}

	public void setPursuitPot(int pursuitPot) {
		this.pursuitPot = pursuitPot;
	}

	public int getManCoveragePot() {
		return manCoveragePot;
	}

	public void setManCoveragePot(int manCoveragePot) {
		this.manCoveragePot = manCoveragePot;
	}

	public int getZoneCoveragePot() {
		return zoneCoveragePot;
	}

	public void setZoneCoveragePot(int zoneCoveragePot) {
		this.zoneCoveragePot = zoneCoveragePot;
	}

	public int getPressPot() {
		return pressPot;
	}

	public void setPressPot(int pressPot) {
		this.pressPot = pressPot;
	}

	public int getCatchingPot() {
		return catchingPot;
	}

	public void setCatchingPot(int catchingPot) {
		this.catchingPot = catchingPot;
	}

	public int getHighlightReelPot() {
		return highlightReelPot;
	}

	public void setHighlightReelPot(int highlightReelPot) {
		this.highlightReelPot = highlightReelPot;
	}

}