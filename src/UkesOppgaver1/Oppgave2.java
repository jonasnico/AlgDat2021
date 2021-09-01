package UkesOppgaver1;

public class Oppgave2 {

    // 2.	Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode som finner
    //      (og returnerer) posisjonen til den minste verdien i en tabell.

    public static int min(int[] a) {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int min_index = 0; // indeks til foreløpig minste verdi (m for maks)

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[min_index])
                min_index = i;
        }
        return min_index;
    }

    public static void main(String[] args) {

        int [] a = {3,6,8,12,2,19,8,7,5,4};
        int min = min(a);
        System.out.println("Indeksen til det minste tallet er " + min + " og verdien er "  + a[min]);
    }
}
