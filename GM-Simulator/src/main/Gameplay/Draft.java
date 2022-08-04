package main.Gameplay;

import main.Player.Person;
import main.Player.Positions.*;

import java.util.Random;

public class Draft {
    private Person[] draftClass;
    public Draft(){
        draftClass = new Person[450];
        generateDraftClass();
    }
    public void printClass(){
        for(int i = 0; i < 450; i++){
            draftClass[i].toString();
        }
    }
    public void generateDraftClass(){
        Random r = new Random();
        for(int i = 0; i < draftClass.length; i++){
            double val = r.nextDouble();
            if(val < 0.0566){
                Quarterback q = new Quarterback();
                draftClass[i] = q;
            }else if(val < 0.09434){
                Center c = new Center();
                draftClass[i] =c;
            }else if(val < 0.13208){
                OffensiveGuard og = new OffensiveGuard();
                draftClass[i] = og;
            }else if(val < 0.188679){
                OffensiveTackle ot = new OffensiveTackle();
                draftClass[i] = ot;
            }else if(val < 0.301887){
                WideReceiver wr = new WideReceiver();
                draftClass[i] = wr;
            }else if(val < 0.35849){
                Halfback hb = new Halfback();
                draftClass[i] = hb;
            }else if(val < 0.377358){
                Fullback fb = new Fullback();
                draftClass[i] = fb;
            }else if(val < 0.471698){
                DefensiveTackle dt = new DefensiveTackle();
                draftClass[i] = dt;
            }else if(val < 0.5471698){
                DefensiveEnd de = new DefensiveEnd();
                draftClass[i] = de;
            }else if(val < 0.603773585){
                TightEnd te = new TightEnd();
                draftClass[i] = te;
            }else if(val < 0.735849){
                Linebacker lb = new Linebacker();
                draftClass[i] = lb;
            }else if(val < 0.83018868){
                Safety s = new Safety();
                draftClass[i] = s;
            }else if(val < 0.9245283){
                Cornerback cb = new Cornerback();
                draftClass[i] = cb;
            }else if(val < 0.9433962){
                Kicker k = new Kicker();
                draftClass[i] = k;
            }else if (val < 0.96226415){
                Punter p = new Punter();
                draftClass[i] = p;
            }else if(val < 0.981132){
                OffensiveGuard og = new OffensiveGuard();
                draftClass[i] = og;
            }else{
                OffensiveTackle ot = new OffensiveTackle();
                draftClass[i] = ot;
            }
        }
    }

}
