package main.Player.Stats;

public class PassingStats {
    private int completions, attempts, yards, touchdowns, interceptions, longPass;
    public PassingStats(){
        completions = 0;
        attempts = 0;
        yards = 0;
        touchdowns = 0;
        interceptions = 0;
        longPass = 0;
    }

    public int getCompletions() {
        return completions;
    }

    public void setCompletions(int completions) {
        this.completions = completions;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
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

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public int getLongPass() {
        return longPass;
    }

    public void setLongPass(int longPass) {
        this.longPass = longPass;
    }
}
