package Uke39;

import hjelpeklasser.Liste;
import hjelpeklasser.TabellListe;


public class Main {


        public static void main(String[] args) {
            String[] s = {"Bladdi", "Laddi", "Test", "Hest", "Best", "Erik", "Freddy", "Hansen"};
            Liste<String> fest = new TabellListe<>(s);
            System.out.println(fest.antall());
            System.out.println(fest);
            System.out.println(fest.fjern("Erik"));
            System.out.println(fest);
            System.out.println(fest.fjern("Best"));
            System.out.println(fest);
            System.out.println(fest.fjern("Bladdi"));
            System.out.println(fest);
            System.out.println(fest.antall());
            System.out.println(fest);












        }
    }

