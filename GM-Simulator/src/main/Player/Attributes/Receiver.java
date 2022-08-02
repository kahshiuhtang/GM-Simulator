package main.Player.Attributes;

import java.util.Random;

public class Receiver extends Attribute{
	private int catching, trafficCatching, routeRunning, highlightReel;
	private int catchingPot, trafficCatchingPot, routeRunningPot, highlightReelPot;

	public Receiver(int c, int tC, int rR, int hR) {
		Random r = new Random();
		double sd = r.nextGaussian();
		catchingPot = c + (int)(sd*13.5+r.nextDouble()*7);
		trafficCatchingPot = tC + (int)(sd*13.5+r.nextDouble()*7);
		routeRunningPot = rR + (int)(sd*13.5+r.nextDouble()*7);
		highlightReelPot = hR + (int)(sd*13.5+r.nextDouble()*7);
		sd = Math.abs(r.nextGaussian());
		catching = catchingPot -  13 - ((int) (sd*5));
		trafficCatching = trafficCatchingPot -  13 - ((int) (sd*5));
		routeRunning = routeRunningPot -  13 - ((int) (sd*5));
		highlightReel = highlightReelPot -  13 - ((int) (sd*5));
	}

	public int sumOverall(){
		return catching + trafficCatching + routeRunning + highlightReel;
	}

	public int sumPotential(){
		return catchingPot + trafficCatchingPot + routeRunningPot + highlightReelPot;
	}

	public String toString(){
		return "Catching: " + catching + "/" + catchingPot + " Traffic Catching: " +
		trafficCatching + "/" + trafficCatchingPot + " Route Running: " +
		routeRunning + "/" + routeRunningPot + " Highlight: " +
		highlightReel + "/" + highlightReelPot;
	}

	public int getCatching() {
		return catching;
	}

	public void setCatching(int catching) {
		this.catching = catching;
	}

	public int getTrafficCatching() {
		return trafficCatching;
	}

	public void setTrafficCatching(int trafficCatching) {
		this.trafficCatching = trafficCatching;
	}

	public int getRouteRunning() {
		return routeRunning;
	}

	public void setRouteRunning(int routeRunning) {
		this.routeRunning = routeRunning;
	}

	public int getHighlightReel() {
		return highlightReel;
	}

	public void setHighlightReel(int highlightReel) {
		this.highlightReel = highlightReel;
	}

	public int getCatchingPot() {
		return catchingPot;
	}

	public void setCatchingPot(int catchingPot) {
		this.catchingPot = catchingPot;
	}

	public int getTrafficCatchingPot() {
		return trafficCatchingPot;
	}

	public void setTrafficCatchingPot(int trafficCatchingPot) {
		this.trafficCatchingPot = trafficCatchingPot;
	}

	public int getRouteRunningPot() {
		return routeRunningPot;
	}

	public void setRouteRunningPot(int routeRunningPot) {
		this.routeRunningPot = routeRunningPot;
	}

	public int getHighlightReelPot() {
		return highlightReelPot;
	}

	public void setHighlightReelPot(int highlightReelPot) {
		this.highlightReelPot = highlightReelPot;
	}
}
