package main.Team;

public class Finance {

    private int ticketPrice, playerSalary, coachesSalary, stadiumMaintenanceCost, trainingFacilityCost, scoutingCost;

    public Finance(int tp, int ps, int cs, int sm, int tf, int sc){
        ticketPrice = tp;
        playerSalary = ps;
        coachesSalary = cs;
        stadiumMaintenanceCost = sm;
        trainingFacilityCost = tf;
        scoutingCost = sc;
    }

    public Finance(){

    }

    public int calculateRevenue(){
        return 0;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getPlayerSalary() {
        return playerSalary;
    }

    public void setPlayerSalary(int playerSalary) {
        this.playerSalary = playerSalary;
    }

    public int getCoachesSalary() {
        return coachesSalary;
    }

    public void setCoachesSalary(int coachesSalary) {
        this.coachesSalary = coachesSalary;
    }

    public int getStadiumMaintenanceCost() {
        return stadiumMaintenanceCost;
    }

    public void setStadiumMaintenanceCost(int stadiumMaintenanceCost) {
        this.stadiumMaintenanceCost = stadiumMaintenanceCost;
    }

    public int getTrainingFacilityCost() {
        return trainingFacilityCost;
    }

    public void setTrainingFacilityCost(int trainingFacilityCost) {
        this.trainingFacilityCost = trainingFacilityCost;
    }

    public int getScoutingCost() {
        return scoutingCost;
    }

    public void setScoutingCost(int scoutingCost) {
        this.scoutingCost = scoutingCost;
    }
}
