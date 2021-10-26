package hjelpeklasser;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class TabellListe<T> implements hjelpeklasser.Liste<T>
{



    private T[] a;
    private int antall;

    // konstruktører og metoder kommer her

    @SuppressWarnings("unchecked")          // pga. konverteringen: Object[] -> T[]
    public TabellListe(int størrelse)       // konstruktør
    {
        a = (T[])new Object[størrelse];       // oppretter tabellen
        antall = 0;                           // foreløpig ingen verdier
    }

    public TabellListe()                    // standardkonstruktør
    {
        this(10);                             // startstørrelse på 10
    }

    //String[] navn = {"Per", "Kari", "Ole", "Azra"};
    //Liste<String> liste = new TabellListe<>(navn);




    public TabellListe(T[] b)                    // en T-tabell som parameter
    {
        this(b.length);                            // kaller den andre konstruktøren

        for (T verdi : b)
        {
            if (verdi != null) a[antall++] = verdi;  // hopper over null-verdier
        }
    }




    public int antall()
    {
        return antall;          // returnerer antallet
    }

    public boolean tom()
    {
        return antall == 0;     // listen er tom hvis antall er 0
    }

    @Override
    public void nullstill() {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }


    public T hent(int indeks)
    {
        indeksKontroll(indeks, false);   // false: indeks = antall er ulovlig
        return a[indeks];                // returnerer er tabellelement
    }

    public int indeksTil(T verdi)
    {
        for (int i = 0; i < antall; i++)
        {
            if (a[i].equals(verdi)) return i;   // funnet!
        }
        return -1;   // ikke funnet!
    }

    @Override
    public T oppdater(int indeks, T verdi) {
        Objects.requireNonNull(verdi, "null er ulovlig!");
        indeksKontroll(indeks, false);  // false: indeks = antall er ulovlig

        T gammelverdi = a[indeks];      // tar vare på den gamle verdien
        a[indeks] = verdi;              // oppdaterer
        return gammelverdi;             // returnerer den gamle verdien
    }

    @Override
    public boolean fjern(T verdi) {
        Objects.requireNonNull(verdi, "null er ulovlig!");

        int fjern = indeksTil(verdi);
        if(fjern != -1) {
            a[fjern] = null;
            antall--;
            a[antall] = null;
            return true;
        }
        return false;
    }

    @Override
    public T fjern(int indeks) {
        indeksKontroll(indeks, false);  // false: indeks = antall er ulovlig
        T verdi = a[indeks];

        antall--; // sletter ved å flytte verdier mot venstre
        System.arraycopy(a, indeks + 1, a, indeks, antall - indeks);
        a[antall] = null;   // tilrettelegger for "søppeltømming"

        return verdi;
    }


    @Override
    public boolean leggInn(T verdi) {
        Objects.requireNonNull(verdi, "null er ulovlig!");

        if (antall == a.length)  // En full tabell utvides med 50%
        {
            a = Arrays.copyOf(a,(3*antall)/2 + 1);
        }

        a[antall++] = verdi;    // setter inn ny verdi
        return true;            // vellykket innlegging
    }

    @Override
    public void leggInn(int indeks, T verdi) {

        Objects.requireNonNull(verdi, "null er ulovlig!");
        indeksKontroll(indeks, true);  // true: indeks = antall er lovlig

        // En full tabell utvides med 50%
        if (antall == a.length) a = Arrays.copyOf(a,(3*antall)/2 + 1);

        // rydder plass til den nye verdien
        System.arraycopy(a, indeks, a, indeks + 1, antall - indeks);

        a[indeks] = verdi;     // setter inn ny verdi
        antall++;              // vellykket innlegging
    }

    public boolean inneholder(T verdi)
    {
        return indeksTil(verdi) != -1;
    }

    public String toString() {
        if (antall == 0) return "[]";

        StringBuilder s = new StringBuilder();
        s.append('[').append(a[0]);

        for(int i = 1; i < antall; i++) {
            s.append(", ");
            s.append(a[i]);

        }

        s.append("]");
        return s.toString();

    }


}


