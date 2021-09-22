package Seksjon122;

import hjelpeklasser.*;

import static hjelpeklasser.Tabell.maks;

public class Program
{
    public static void main(String ... args)      // hovedprogram
    {

        int [] a = Tabell.randPerm(30);
        int [] b = Tabell.nestMaksBytt(a);

        int m = b[0], nm = b[1];

        Tabell.skrivLn(a);
        System.out.print("Størst(" + a[m] + ") har posisjon " + m);
        System.out.println(", nest størst(" + a[nm] + ") har posisjon " + nm);
        Tabell.skrivLn(b);






    } // main

} // class Program

