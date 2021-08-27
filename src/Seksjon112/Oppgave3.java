package Seksjon112;

public class Oppgave3 {

    // 3.	Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første
    //      av dem. Hva må endres for at den skal returnere posisjonen til den siste?

    public static int maks(int[] a) { // a er en en heltallstabell

        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int max_index = 0; // indeks til foreløpig største verdi (m for maks)

        for (int i = 1; i < a.length; i++) {         // obs: starter med i = 1

            if (a[i] >= a[max_index]) max_index = i; // indeksen oppdateres; la til = tegn og den traverserer videre.
                                                     //
                                                     // Med bare = stopper
        }                                            // den på første forekomst og gir indeks til denne

        return max_index;                            // returnerer indeksen/posisjonen til største
    }

    public static void main(String[] args) {

        int [] a = {4, 5, 8, 9, 14, 2, 1, 17, 7, 20};

        int maks = maks(a);

        System.out.println("Indeksen til det største tallet er " +maks + " og verdien er " + a[maks]);

    }
}
