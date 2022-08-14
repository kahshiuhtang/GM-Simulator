package main.Player.Stats;

public class PlayerHistory {
    private YearStats[] yearlyStats;
    public PlayerHistory(){
        yearlyStats = new YearStats[1];
    }
    public YearStats[] getStats(){
        return yearlyStats;
    }
}
