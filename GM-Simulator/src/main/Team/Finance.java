package main.Team;

import java.util.Random;

public class Finance {

    private double ticketPrice, playerSalary, coachesSalary, stadiumMaintenanceCost, trainingFacilityCost, scoutingCost;

    public Finance(int tp, int ps, int cs, int sm, int tf, int sc){
        ticketPrice = tp;
        playerSalary = ps;
        coachesSalary = cs;
        stadiumMaintenanceCost = sm;
        trainingFacilityCost = tf;
        scoutingCost = sc;
    }

    public Finance(){
        Random r = new Random();
        ticketPrice = r.nextDouble()*10;
        playerSalary = r.nextDouble()*10;
        coachesSalary = r.nextDouble()*10;
        stadiumMaintenanceCost = r.nextDouble()*10;
        trainingFacilityCost = r.nextDouble()*10;
        scoutingCost = r.nextDouble()*10;
    }

    public double calculateRevenue(){
        return 0;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getPlayerSalary() {
        return playerSalary;
    }

    public void setPlayerSalary(int playerSalary) {
        this.playerSalary = playerSalary;
    }

    public double getCoachesSalary() {
        return coachesSalary;
    }

    public void setCoachesSalary(int coachesSalary) {
        this.coachesSalary = coachesSalary;
    }

    public double getStadiumMaintenanceCost() {
        return stadiumMaintenanceCost;
    }

    public void setStadiumMaintenanceCost(int stadiumMaintenanceCost) {
        this.stadiumMaintenanceCost = stadiumMaintenanceCost;
    }

    public double getTrainingFacilityCost() {
        return trainingFacilityCost;
    }

    public void setTrainingFacilityCost(int trainingFacilityCost) {
        this.trainingFacilityCost = trainingFacilityCost;
    }

    public double getScoutingCost() {
        return scoutingCost;
    }

    public void setScoutingCost(int scoutingCost) {
        this.scoutingCost = scoutingCost;
    }
}
