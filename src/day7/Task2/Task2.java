package day7.Task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
 /*       Player[] p = new Player[6];
        for (int i = 0; i < 6; i++){
            p[i] = new Player();
        }*/

        Player p1 = new Player(90);
        Player p2 = new Player(92);
        Player p3 = new Player(94);
        Player p4 = new Player(96);
        Player p5 = new Player(98);
        Player p6 = new Player(100);

        Player.info();
        for (int i = 0; i < 96; i++){
            p4.run();
        }

        Player.info();
    }
}
