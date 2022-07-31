package main.Team;

import main.Player.Person;
import main.Player.Positions.*;

public class Team {
    public Person[] team;
    public Team(){
        team = new Person[53];
        generateTeam();
    }
    public void generateTeam(){
        for(int i = 0; i < 53; i++){
            if(i < 2){
                Quarterback q = new Quarterback();
                team[i] = q;
            }else if(i < 4){
                Center c = new Center();
                team[i] = c;
            }else if(i < 7){
                OffensiveGuard og = new OffensiveGuard();
                team[i] = og;
            }else if(i < 11){
                OffensiveTackle ot = new OffensiveTackle();
                team[i] = ot;
            }else if(i < 17){
                WideReceiver wr = new WideReceiver();
                team[i] = wr;
            }else if(i < 20){
                Halfback hb = new Halfback();
                team[i] = hb;
            }else if(i < 21){
                Fullback fb = new Fullback();
                team[i]= fb;
            }else if(i < 24) {
                TightEnd te = new TightEnd();
                team[i] = te;
            }else if (i < 29){
                DefensiveTackle dt = new DefensiveTackle();
                team[i] = dt;
            }else if(i < 33){
                DefensiveEnd de = new DefensiveEnd();
                team[i] = de;
            }else if(i < 40){
                Linebacker lb = new Linebacker();
                team[i] = lb;
            }else if(i < 45){
                Safety s = new Safety();
                team[i] = s;
            }else if(i < 50){
                Cornerback cb = new Cornerback();
                team[i] = cb;
            }else if(i < 51){
                Kicker k = new Kicker();
                team[i] = k;
            }else if(i < 52){
                Punter p = new Punter();
                team[i] = p;
            }else{
                Quarterback qb = new Quarterback();
                team[i] = qb;
            }
        }
    }

    public String overall(){
        for(int i = 0; i < 53; i++){
            System.out.println(team[i].overall());
            System.out.println(team[i].overall() + "/" + team[i].potential());
            System.out.println();
            System.out.println();
        }
        return "";
    }
    public String potential(){
        for(int i = 0; i < 53; i++){
            System.out.println(team[i].overall() + "/" + team[i].potential());
            System.out.println();
        }
        return "";
    }
    public String toString(){
        for(int i = 0; i < 53; i++){
            System.out.println(team[i].toString());
            System.out.println(team[i].overall() + "/" + team[i].potential());
            System.out.println();
        }
        return "";
    }
}
