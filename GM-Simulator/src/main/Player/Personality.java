package main.Player;

import java.util.Random;

public class Personality {

	private WorkEthic workEthic;
	private Interactions interactions;
	private Desires desires;
	public Personality() {
		workEthic = new WorkEthic();
		interactions = new Interactions();
		desires = new Desires();
	}

	public WorkEthic getWorkEthic() {
		return workEthic;
	}

	public void setWorkEthic(WorkEthic workEthic) {
		this.workEthic = workEthic;
	}

	public Interactions getInteractions() {
		return interactions;
	}

	public void setInteractions(Interactions interactions) {
		this.interactions = interactions;
	}

	public Desires getDesires() {
		return desires;
	}

	public void setDesires(Desires desires) {
		this.desires = desires;
	}

	private class WorkEthic{
		private double drive, intelligence, consistency;

		public WorkEthic(){
			Random r = new Random();
			drive = r.nextDouble()*10;
			intelligence = r.nextDouble()*10;
			consistency = r.nextDouble()*10;
		}

		public double getDrive() {
			return drive;
		}

		public void setDrive(double drive) {
			this.drive = drive;
		}

		public double getIntelligence() {
			return intelligence;
		}

		public void setIntelligence(double intelligence) {
			this.intelligence = intelligence;
		}

		public double getConsistency() {
			return consistency;
		}

		public void setConsistency(double consistency) {
			this.consistency = consistency;
		}
	}

	private class Interactions{
		private double humble, confidence, approachable;

		public Interactions(){
			Random r = new Random();
			humble = r.nextDouble()*10;
			confidence = r.nextDouble()*10;
			approachable = r.nextDouble()*10;
		}

		public double getHumble() {
			return humble;
		}

		public void setHumble(double humble) {
			this.humble = humble;
		}

		public double getConfidence() {
			return confidence;
		}

		public void setConfidence(double confidence) {
			this.confidence = confidence;
		}

		public double getApproachable() {
			return approachable;
		}

		public void setApproachable(double approachable) {
			this.approachable = approachable;
		}
	}

	private class Desires{
		private double fame, money, legacy, loyalty;
		public Desires(){
			Random r = new Random();
			fame = r.nextDouble()*10;
			money = r.nextDouble()*10;
			legacy = r.nextDouble()*10;
			loyalty = r.nextDouble()*10;
		}

		public double getFame() {
			return fame;
		}

		public void setFame(double fame) {
			this.fame = fame;
		}

		public double getMoney() {
			return money;
		}

		public void setMoney(double money) {
			this.money = money;
		}

		public double getLegacy() {
			return legacy;
		}

		public void setLegacy(double legacy) {
			this.legacy = legacy;
		}
	}
}
