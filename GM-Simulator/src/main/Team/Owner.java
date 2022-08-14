package main.Team;

import java.util.Random;

public class Owner {
    private double approval;
    private double tolerance;
    public Owner(){
        Random r = new Random();
        tolerance = r.nextDouble()*10;
    }
    public void setApproval(Team team){

    }

    public double getApproval() {
        return approval;
    }

    public void setApproval(double approval) {
        this.approval = approval;
    }

    public double getTolerance() {
        return tolerance;
    }

    public void setTolerance(double tolerance) {
        this.tolerance = tolerance;
    }
}
