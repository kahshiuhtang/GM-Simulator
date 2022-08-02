package main.Player.Positions;

import main.Player.Attributes.*;
import main.Player.Person;
import main.Player.PositionName;

public class TightEnd extends Person {

    private Blocker blocker;
    private Receiver receiver;
    private Runner runner;
    private Universal universal;

    public TightEnd() {
        super(PositionName.TE);
        blocker = new Blocker(60, 60, 45);
        receiver = new Receiver(55 ,50, 55, 45);
        runner = new Runner(55, 50, 50, 60, 55, 50);
        universal = new Universal(65, 60, 60, 60, 60, 55, 65, 70);
    }
    public Attribute[] getAttributes(){
        Attribute[] ans = {blocker, receiver, runner, universal};
        return ans;
    }

    public int overall(){
        return (((int)(blocker.sumOverall()/2.5)) + ((int)(receiver.sumOverall()/3.2)) + runner.sumOverall()/5 + universal.sumOverall()/8)/4;
    }
    public int potential(){
        return (((int)(blocker.sumPotential()/2.5)) + ((int)(receiver.sumPotential()/3.2)) + runner.sumPotential()/5 + universal.sumPotential()/8)/4;
    }

    public String toString(){
        return "Tight End: " +blocker.toString() + receiver.toString() + runner.toString() + universal.toString();
    }

    public Blocker getBlocker() {
        return blocker;
    }

    public void setBlocker(Blocker blocker) {
        this.blocker = blocker;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

    public Universal getUniversal() {
        return universal;
    }

    public void setUniversal(Universal universal) {
        this.universal = universal;
    }
}
