package Uke41;

import Oblig2Test.DobbeltLenketListe;
import hjelpeklasser_oblig2.ListeT;

public class StackTest<T> extends TabellStakk<T> {

    public static void main(String[] args) {

        String [] liste = {"Hans", "Petter"};
    }

    static void updateA() {
        updateB();
        updateC();
        System.out.println("updateA");

    }

     static void updateB() {
        updateC();
         System.out.println("updateB");
    }
    static void updateC() {
        System.out.println("updateC");
    }
}
