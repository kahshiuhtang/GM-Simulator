package main.Team;

import java.util.Random;

public class Coach {
    private double riskTaking, gameKnowledge, creativity, adaptability;
    private Playstyle playstyle;

    public Coach(){
        Random r= new Random();
        riskTaking = r.nextDouble()*10;
        gameKnowledge = r.nextDouble()*10;
        creativity = r.nextDouble()*10;
        adaptability = r.nextDouble()*10;
        playstyle = new Playstyle();
    }

    public double getRiskTaking() {
        return riskTaking;
    }

    public void setRiskTaking(double riskTaking) {
        this.riskTaking = riskTaking;
    }

    public double getGameKnowledge() {
        return gameKnowledge;
    }

    public void setGameKnowledge(double gameKnowledge) {
        this.gameKnowledge = gameKnowledge;
    }

    public double getCreativity() {
        return creativity;
    }

    public void setCreativity(double creativity) {
        this.creativity = creativity;
    }


    public double getAdaptability() {
        return adaptability;
    }

    public void setAdaptability(double adaptability) {
        this.adaptability = adaptability;
    }

    public Playstyle getPlaystyle() {
        return playstyle;
    }

    public void setPlaystyle(Playstyle playstyle) {
        this.playstyle = playstyle;
    }
}
