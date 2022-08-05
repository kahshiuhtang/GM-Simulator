package main.Team;

import java.util.Random;

public class Stadium {
    private int maxCapacity, yearBuilt, fanRating;
    public Stadium(){
        randomGenerate();
    }
    public void randomGenerate(){
        Random r = new Random();
        maxCapacity = 50000 + (int)(r.nextDouble()*100000);
        yearBuilt = 1990 + (int) (r.nextGaussian()*15);
        yearBuilt = Math.min(yearBuilt, 2022);
        fanRating = 5 + (int)(r.nextGaussian()*1.5);
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getFanRating() {
        return fanRating;
    }

    public void setFanRating(int fanRating) {
        this.fanRating = fanRating;
    }
}
