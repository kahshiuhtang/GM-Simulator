package main.Player.Stats;

public class RushingStats {
    private int rushes, yards, touchdowns, longRush, fumbles;
    public RushingStats(){
        rushes = 0;
        yards = 0;
        touchdowns = 0;
        longRush = 0;
        fumbles = 0;
    }

    public int getRushes() {
        return rushes;
    }

    public void setRushes(int rushes) {
        this.rushes = rushes;
    }

    public int getYards() {
        return yards;
    }

    public void setYards(int yards) {
        this.yards = yards;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    public int getLongRush() {
        return longRush;
    }

    public void setLongRush(int longRush) {
        this.longRush = longRush;
    }

    public int getFumbles() {
        return fumbles;
    }

    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }
}
