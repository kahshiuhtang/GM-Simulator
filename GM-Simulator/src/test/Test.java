package test;

import main.Player.Attributes.Blocker;

public class Test {
    public static void main(String[] args) {
        System.out.println("Man");
        int pBP=0;
        int rBP=0;
        int pP=0;
        int pB=0;
        int rB=0;
        int p=0;

        for(int i = 0; i < 25; i++){
            Blocker b = new Blocker(70, 70, 60);
            p += b.getPancake();
            pB += b.getPassBlock();
            pBP += b.getPassBlockPot();
            pP += b.getPancakePot();
            System.out.println(b.toString());
        }
        System.out.println(p/25+ " " + pP/25 + " " + pB/25 + " " + pBP/25+ " "+ " ");
        //MyFrame f = new MyFrame();
        //f.setVisible(true);
    }
}
