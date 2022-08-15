package main.Player.Stats;

public class KickingStats {
    int fga10, fg10, fga20, fg20, fga30, fg30, fga40, fg40, fga50, fg50, longMade, fieldGoalMade, fieldGoalAttempts, extraPointAttempts, extraPointMade;
    public KickingStats(){
        fga10 = 0;
        fg10 = 0;
        fga20 = 0;
        fg20 = 0;
        fga30 = 0;
        fg30 = 0;
        fga40 = 0;
        fg40 = 0;
        fga50 = 0;
        fg50 = 0;
        longMade = 0;
        fieldGoalMade = 0;
        fieldGoalAttempts = 0;
        extraPointAttempts = 0;
        extraPointMade = 0;
    }
    public double evaluate(){
        double avgFG = ((double) fieldGoalMade)/((double) fieldGoalAttempts);
        double avgEP = ((double) extraPointMade)/((double) extraPointAttempts);
        return avgFG*5+ avgEP*5;
    }

    public int getFga10() {
        return fga10;
    }

    public void setFga10(int fga10) {
        this.fga10 = fga10;
    }

    public int getFg10() {
        return fg10;
    }

    public void setFg10(int fg10) {
        this.fg10 = fg10;
    }

    public int getFga20() {
        return fga20;
    }

    public void setFga20(int fga20) {
        this.fga20 = fga20;
    }

    public int getFg20() {
        return fg20;
    }

    public void setFg20(int fg20) {
        this.fg20 = fg20;
    }

    public int getFga30() {
        return fga30;
    }

    public void setFga30(int fga30) {
        this.fga30 = fga30;
    }

    public int getFg30() {
        return fg30;
    }

    public void setFg30(int fg30) {
        this.fg30 = fg30;
    }

    public int getFga40() {
        return fga40;
    }

    public void setFga40(int fga40) {
        this.fga40 = fga40;
    }

    public int getFg40() {
        return fg40;
    }

    public void setFg40(int fg40) {
        this.fg40 = fg40;
    }

    public int getFga50() {
        return fga50;
    }

    public void setFga50(int fga50) {
        this.fga50 = fga50;
    }

    public int getFg50() {
        return fg50;
    }

    public void setFg50(int fg50) {
        this.fg50 = fg50;
    }

    public int getLongMade() {
        return longMade;
    }

    public void setLongMade(int longMade) {
        this.longMade = longMade;
    }

    public int getFieldGoalMade() {
        return fieldGoalMade;
    }

    public void setFieldGoalMade(int fieldGoalMade) {
        this.fieldGoalMade = fieldGoalMade;
    }

    public int getFieldGoalAttempts() {
        return fieldGoalAttempts;
    }

    public void setFieldGoalAttempts(int fieldGoalAttempt) {
        this.fieldGoalAttempts = fieldGoalAttempt;
    }

    public int getExtraPointAttempts() {
        return extraPointAttempts;
    }

    public void setExtraPointAttempts(int extraPointAttempts) {
        this.extraPointAttempts = extraPointAttempts;
    }

    public int getExtraPointMade() {
        return extraPointMade;
    }

    public void setExtraPointMade(int extraPointMade) {
        this.extraPointMade = extraPointMade;
    }
}
