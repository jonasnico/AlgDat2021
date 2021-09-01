package UkesOppgaver1.Seksjon113;

public class Oppgave5 {

   // 5.	Lag en metode public static int[] minmaks(int[] a). Den skal ved hjelp av en int-tabell med lengde 2
    //      returnere posisjonene til minste og største verdi i tabellen a. Hvis du har funnet at m1 er posisjonen til
    //      den minste og m2 til den største, kan du returnere tabellen b definert ved:   int[] b = {m1, m2};
    //      Hvor mange sammenligninger bruker metoden din?

    public static int[] minmaks(int[] a) {
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            int posisjon = a[i];

            if (posisjon < min) {
                min = posisjon;

            } else max = posisjon;
        }
        return new int [] {min, max};
    }

    public static void main(String[] args) {
        int [] a = {3,9,8};
        int minmax [] = minmaks(a);
        System.out.println("Det minste tallet er " +minmax[0]);
        System.out.println("Det største tallet er " +minmax[1]);
    }
}
