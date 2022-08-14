package main.Player.Stats;

public class PuntingStats {
    int punts, totalYards;
    public PuntingStats(){
        punts = 0;
        totalYards = 0;
    }
    public double evaluate(){
        return(((double)totalYards)/((double)punts)-39);
    }

    public int getPunts() {
        return punts;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }

    public int getTotalYards() {
        return totalYards;
    }

    public void setTotalYards(int totalYards) {
        this.totalYards = totalYards;
    }
}
