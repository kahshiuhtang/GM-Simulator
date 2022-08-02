package main.Player.Stats;

public class DefendingGroundStats {
    private int forcedFumbles, fumbleRecovery, yardsReturned, touchdowns, sacks, tackles, soloTackles, assistedTackles, TFL, safety, penalties, fumbles, fumblesLost;
    public DefendingGroundStats(){
        forcedFumbles = 0;
        fumbleRecovery = 0;
        yardsReturned = 0;
        touchdowns = 0;
        sacks = 0;
        tackles = 0;
        soloTackles = 0;
        assistedTackles = 0;
        TFL = 0;
        safety = 0;
        penalties = 0;
        fumbles = 0;
        fumblesLost = 0;
    }

    public int getForcedFumbles() {
        return forcedFumbles;
    }

    public void setForcedFumbles(int forcedFumbles) {
        this.forcedFumbles = forcedFumbles;
    }

    public int getFumbleRecovery() {
        return fumbleRecovery;
    }

    public void setFumbleRecovery(int fumbleRecovery) {
        this.fumbleRecovery = fumbleRecovery;
    }

    public int getYardsReturned() {
        return yardsReturned;
    }

    public void setYardsReturned(int yardsReturned) {
        this.yardsReturned = yardsReturned;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    public void setTouchdowns(int touchdowns) {
        this.touchdowns = touchdowns;
    }

    public int getSacks() {
        return sacks;
    }

    public void setSacks(int sacks) {
        this.sacks = sacks;
    }

    public int getTackles() {
        return tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }

    public int getSoloTackles() {
        return soloTackles;
    }

    public void setSoloTackles(int soloTackles) {
        this.soloTackles = soloTackles;
    }

    public int getAssistedTackles() {
        return assistedTackles;
    }

    public void setAssistedTackles(int assistedTackles) {
        this.assistedTackles = assistedTackles;
    }

    public int getTFL() {
        return TFL;
    }

    public void setTFL(int TFL) {
        this.TFL = TFL;
    }

    public int getSafety() {
        return safety;
    }

    public void setSafety(int safety) {
        this.safety = safety;
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
