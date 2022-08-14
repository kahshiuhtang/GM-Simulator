package main.Team;

import java.util.Random;

public class Playstyle {

    private double manCoverScheme, zoneScheme, manPercent, zonePercent;
    private double passScheme, runScheme, passPercent, runPercent;
    public Playstyle(){
        Random r = new Random();
        manCoverScheme = r.nextDouble()*10;
        zoneScheme = r.nextDouble()*10;
        manPercent = r.nextDouble();
        zonePercent = 1-manPercent;
        passScheme = r.nextDouble()*10;
        runScheme = r.nextDouble()*10;
        passPercent = r.nextDouble();
        runPercent =  1-passPercent;
    }

    public double getManCoverScheme() {
        return manCoverScheme;
    }

    public void setManCoverScheme(double manCoverScheme) {
        this.manCoverScheme = manCoverScheme;
    }

    public double getZoneScheme() {
        return zoneScheme;
    }

    public void setZoneScheme(double zoneScheme) {
        this.zoneScheme = zoneScheme;
    }

    public double getManPercent() {
        return manPercent;
    }

    public void setManPercent(double manPercent) {
        this.manPercent = manPercent;
    }

    public double getZonePercent() {
        return zonePercent;
    }

    public void setZonePercent(double zonePercent) {
        this.zonePercent = zonePercent;
    }

    public double getPassScheme() {
        return passScheme;
    }

    public void setPassScheme(double passScheme) {
        this.passScheme = passScheme;
    }

    public double getRunScheme() {
        return runScheme;
    }

    public void setRunScheme(double runScheme) {
        this.runScheme = runScheme;
    }

    public double getPassPercent() {
        return passPercent;
    }

    public void setPassPercent(double passPercent) {
        this.passPercent = passPercent;
    }

    public double getRunPercent() {
        return runPercent;
    }

    public void setRunPercent(double runPercent) {
        this.runPercent = runPercent;
    }
}
