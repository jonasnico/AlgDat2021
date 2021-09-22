package hjelpeklasser;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class Tabell     // Samleklasse for tabellmetoder
{
    private Tabell() {}   // privat standardkonstruktør - hindrer instansiering


    public static void fratilKontroll(int tablengde, int fra, int til)
    {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");

        if (fra == til)
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");

    }

    public static void vhKontroll(int tablengde, int v, int h)
    {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }

    // Metoden bytt(int[] a, int i, int j)       Programkode 1.1.8 d)

    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Metoden public static void bytt(char[] c, int i, int j)

    public static void bytt(char[] c, int i, int j) {

        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    // Metoden public static void skriv(int[] a, int fra, int til)

    public static void skriv(int[] a, int fra, int til) {

        fratilKontroll(a.length, fra, til);
        if (til - fra > 0) System.out.print(a[fra]);
        for (int i = fra + 1; i < til; i++) {
            System.out.print(" " + a[i]);
        }
    }

    // Metoden public static void skriv(int[] a)

    public static void skriv(int[] a) {

        skriv(a, 0, a.length);
    }

    // Metoden public static void skrivLn(int [] a, int fra, int til)

    public static void skrivLn(int [] a, int fra, int til) {

        skriv(a,fra,til);
        System.out.println();
        }



    // Metoden public static void skrivLn(int[] a)

    public static void skrivLn(int[] a) {

        skrivLn(a, 0, a.length);
    }

    // Metoden public static void skriv(char[] c, int fra, int til)

    public static void skriv(char[] c, int fra, int til) {

        fratilKontroll(c.length, fra, til);
        if (til - fra > 0) System.out.print(c[fra]);
        for (int i = fra + 1; i < til; i++) {
            System.out.print(" " + c[i]);
        }
    }

    // Metoden public static void skriv(char[] c)

    public static void skriv(char[] c) {

        skriv(c, 0, c.length);

        }


    // Metoden public static void skrivLn(char [] c, int fra, int til)

    public static void skrivLn(char[] c, int fra, int til) {

        skriv(c, fra, til);
        System.out.println();
    }

    // Metoden public static void skrivLn(char[] c)

    public static void skrivLn(char[] c) {

        skrivLn(c, 0, c.length);
    }

    // Metoden randPerm(int n)                   Programkode 1.1.8 e)

    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k+1);        // en tilfeldig tall fra 0 til k
            bytt(a,k,i);                   // bytter om
        }

        return a;                        // permutasjonen returneres
    }
    // Metoden randPerm(int[] a)                 Programkode 1.1.8 f)

    public static void randPerm(int[] a)  // stokker om a
    {
        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--)
        {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a,k,i);
        }
    }

    // Metoden maks(int[] a, int fra, int til)   Programkode 1.2.1 b)

    public static int maks(int[] a, int fra, int til)
    {
        if (a == null)
            throw new NullPointerException
                    ("parametertabellen a er null");

        fratilKontroll(a.length,fra,til);

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }
    // Metoden maks(int[] a)                     Programkode 1.2.1 c)

    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a,0,a.length);     // kaller metoden over
    }

    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        if (m == 0)                            // den største ligger først
        {
            nm = maks(a, 1, n);                  // leter i a[1:n>
        }
        else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        }
        else
        {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }

        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks

    public static int[] nestMaksBytt(int[] a)  // legges i class Tabell
    {

        if (a.length < 2) throw   // må ha minst to verdier!
                new IllegalArgumentException("a.length(" + a.length + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        bytt(a, 0, m); // bytter om slik at den største kommer forrest

        int k = maks(a, 1, a.length);

        if (k == m) k = 0; // den nest største lå opprinnelig forrest

        bytt(a, 0, m); // bytter tilbake

        return new int[] {m,k};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks

    // min-metodene - se Oppgave 1 i Avsnitt 1.2.1
    public static int min(int[] a, int fra, int til)
    {
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til minste verdi i a[fra:til>
        int minverdi = a[fra];   // minste verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] < minverdi)
            {
                m = i;                // indeks til minste verdi oppdateres
                minverdi = a[m];     // minste verdi oppdateres
            }
        }
        System.out.println("Den minste verdien er " +minverdi + " og har indeks " + m);
        return m;  // posisjonen til minste verdi i a[fra:til>
    }

    public static int min2(int[] a)  // bruker hele tabellen
    {
        return min(a,0,a.length);     // kaller metoden over
    }

    public static int[] naturligeTall1(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("For lite tall!");
        }
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        return a;
    }

    public static int[] naturligeTall(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n(" + n + ") er mindre enn 1!");
        }
        int [] a = new int[n];            // en tabell med plass til n tall
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;

        }
        return a;
    }

    public static int[] heleTall(int fra, int til) {

        if (fra > til) {
            throw new IllegalArgumentException("Illegalt intervall");
        }
        if (fra == til) {
            return new int[0];
        }
        int [] a = new int[til - fra];
        for (int i = fra; i < til; i++) {

            a[i-fra] = i;   // legger inn tallene 1, 2, . , n
        }
        return a;
    }
}
