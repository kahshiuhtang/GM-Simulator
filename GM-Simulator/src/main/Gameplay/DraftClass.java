package main.Gameplay;

public class DraftClass {
    private int year;
    private int players;
    private Pick[] draftClass;
    public DraftClass(int year){
        draftClass = new Pick[7];
        this.year = year;
        players = 0;
    }
    public void addPick(Pick p){
        if(players+1 > draftClass.length){
            Pick[] temp = new Pick[players*2];
            System.arraycopy(draftClass, 0, temp, 0 , players);
            draftClass = temp;
        }
        draftClass[players] = p;
        players++;
    }
    public int getPlayers(){
        return players;
    }

    public Pick[] getDraftClass(){
        return draftClass;
    }
    public int getYear(){
        return year;
    }
}
