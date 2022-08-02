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

    public BlockingStats getBlockingStats() {
        return b;
    }

    public void setBlockingStats(BlockingStats b) {
        this.b = b;
    }

    public DefendingAirStats getDefendAirStats() {
        return dA;
    }

    public void setDefendAirStats(DefendingAirStats dA) {
        this.dA = dA;
    }

    public DefendingGroundStats getDefendGroundStats() {
        return dG;
    }

    public void setDefendGroundStats(DefendingGroundStats dG) {
        this.dG = dG;
    }

    public KickingStats getKickingStats() {
        return k;
    }

    public void setKickingStats(KickingStats k) {
        this.k = k;
    }

    public PassingStats getPassingStats() {
        return pa;
    }

    public void setPassingStats(PassingStats pa) {
        this.pa = pa;
    }

    public PuntingStats getPuntingStats() {
        return pu;
    }

    public void setPuntingStats(PuntingStats pu) {
        this.pu = pu;
    }

    public RushingStats getRushingStats() {
        return r;
    }

    public void setRushingStats(RushingStats r) {
        this.r = r;
    }
}
