package main.Player.Stats;

public class BlockingStats {
    public int sacksAllowed, penalties;
    public BlockingStats(){
        sacksAllowed = 0;
        penalties = 0;
    }
    public double evalaute(){
        return 10-sacksAllowed/3-penalties/5;
    }

    public int getSacksAllowed() {
        return sacksAllowed;
    }

    public void setSacksAllowed(int sacksAllowed) {
        this.sacksAllowed = sacksAllowed;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }
}
