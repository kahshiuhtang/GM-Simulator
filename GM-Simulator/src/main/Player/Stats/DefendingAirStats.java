package main.Player.Stats;

public class DefendingAirStats {
    private int interceptions, touchdowns, passesDefended, penalties, fumbles, fumblesLost;
    public DefendingAirStats(){
        interceptions = 0;
        touchdowns = 0;
        passesDefended = 0;
        penalties = 0;
        fumbles = 0;
        fumblesLost = 0;
    }
    public double evaluate(){
        return interceptions/2.0 + touchdowns + passesDefended/4.0-penalties/3.0-fumbles;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }


    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    public int getPassesDefended() {
        return passesDefended;
    }

    public void setPassesDefended(int passesDefended) {
        this.passesDefended = passesDefended;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }

    public int getFumbles() {
        return fumbles;
    }

    public void setFumbles(int fumbles) {
        this.fumbles = fumbles;
    }

    public int getFumblesLost() {
        return fumblesLost;
    }

    public void setFumblesLost(int fumblesLost) {
        this.fumblesLost = fumblesLost;
    }
}
