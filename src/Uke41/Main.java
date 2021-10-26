package Uke41;

import static Uke41.TabellStakk.*;
import static Uke41.TabellStakk.snu;

public class Main {

    public static void main(String[] args)  {

        TabellStakk<Integer> stakk = new TabellStakk<>();

        stakk.leggInn(1);
        stakk.leggInn(2);
        stakk.leggInn(3);
        stakk.leggInn(4);


        TabellStakk<Integer> stacker = new TabellStakk<>();

        /*
        stacker.leggInn("Olsen");
        stacker.leggInn("Hansen");
        stacker.leggInn("Nilsen");
        System.out.println(stacker);
        snu(stacker);
        System.out.println(stacker);
        */

        System.out.println(stakk);
        stakk.kopier(stakk, stacker);
        System.out.println(stakk);
        System.out.println(stacker);

    }
}
