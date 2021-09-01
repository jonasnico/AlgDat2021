package Seksjon122;

import hjelpeklasser.*;

public class Program
{
    public static void main(String ... args)      // hovedprogram
    {
        //int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
        //for (int k : a) System.out.print(k + " ");  // skriver ut a
        //int m = Tabell.maks(a);   // finner posisjonen til største verdi
        //System.out.println("\nStørste verdi ligger på plass " + m);
        int c [] = Tabell.naturligeTall(22);
        int a [] = null;
        Tabell.min(c,0,22);
        Tabell.maks(a,1,5);

    } // main

} // class Program

