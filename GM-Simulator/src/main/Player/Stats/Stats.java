package main.Player.Stats;

public class Stats {
    private BlockingStats b;
    private DefendingAirStats dA;
    private DefendingGroundStats dG;
    private KickingStats k;
    private PassingStats pa;
    private PuntingStats pu;
    private RushingStats r;
    public Stats(){
        b = new BlockingStats();
        dA = new DefendingAirStats();
        dG = new DefendingGroundStats();
        k = new KickingStats();
        pa = new PassingStats();
        pu = new PuntingStats();
        r = new RushingStats();

    }
}
