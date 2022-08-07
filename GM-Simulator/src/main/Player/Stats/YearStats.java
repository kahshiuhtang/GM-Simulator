package main.Player.Stats;

public class YearStats {
    private Stats[] yearStats;
    private int yearsCounted;
    public YearStats(){
        yearsCounted = 0;
        yearStats = new Stats[1];
    }
    public void addGameStats(Stats s){
        if(yearsCounted+1 >= yearStats.length){
            Stats[] temp = new Stats[yearStats.length*2];
            System.arraycopy(yearStats, 0, temp, 0, yearsCounted);
            yearStats = temp;
        }
        yearStats[yearsCounted] = s;
        yearsCounted++;
    }
    public int getYearsCounted(){
        return yearsCounted;
    }

    public Stats[] getYearStats(){
        return yearStats;
    }
}
