package Seksjon112;

//1.	Anta at vi har en min-metode, dvs. en metode som finner (og returnerer) posisjonen til den minste verdien i
//      en tabell. Hva ville metodekallet min(a) returnere med hvis a er tabellen i Figur 1.1.2?

//      int[] array = { 8	4	17	10	6	20	1	11	15	3	18	9	2	7	19 }

//      Den vil returnere med tallet 5, indexen til 20

public class Oppgave1 {


    public static int maks(int[] a) { // a er en en heltallstabell
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int max_index = 0; // indeks til foreløpig største verdi (m for maks)

        for (int index = 1; index < a.length; index++) { // obs: starter med i = 1
            if (a[index] > a[max_index])

                max_index = index;
        }
        return max_index; // returnerer indeksen/posisjonen til største
    }

    public static void main(String[] args) {

        int [] a = {1,3,7,9,12,17,6,22,11};
        int maks_index = maks(a);
        System.out.println("Indeksen til det største tallet er " + maks_index + " og verdien er " + a[maks_index]);
    }
}
