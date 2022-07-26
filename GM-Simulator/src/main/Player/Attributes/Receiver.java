package main.Player.Attributes;

public class Receiver {
	private int catching, trafficCatching, routeRunning, highlightReel;
	private int catchingPot, trafficCatchingPot, routeRunningPot, highlightReelPot;
	protected Receiver() {
		
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
}
