package Uke38.UkesOppgaver;

public class Avsnitt1_5_1 {
    public static void main(String[] args) {
        //System.out.println(a(10));
        //tverrsum(12);
        //System.out.println(sifferrot(956847));
        //System.out.println(sifferrot2(956847));
        System.out.println(kvadratrot(5));

    }

    public static int aRekursiv(int n)           // n må være et ikke-negativt tall
    {
        if (n == 0) return 1;              // a0 = 1
        else if (n == 1) return 2;         // a1 = 2
        else return 2*aRekursiv(n-1) + 3*aRekursiv(n-2);   // to rekursive kall
    }

    //---Oppgave 1.5.1 - 1 ---

    public static int aIterativ(int n){
        if (n < 0) throw new IllegalArgumentException("n er negativ!");

        // Måtte se på løsningsforslag

        int x = 0;
        int y = 1;
        int z = 1;

        for (int i = 0; i < n; i++) {
            z = 2*y + 3*x;
            x = y;
            y = z;
        }
        return z;
    }

    //---Oppgave 1.5.1 - 3 ---

    public static int tverrsum(int n) {
        int sum = 0;                            //Deklarer en variabel for å lagre sum
        int i = 1;                              //Teller for å visualisere hva som skjer
       // System.out.println("i\tn\tdigit\tsum"); //Skriver ut oversikt over iterasjonene
        while(n > 0) {                          //Løkka går til tallet blir null
            int digit = n % 10;                 //Henter ut verdien helt til høyre for int n. Modulus operatoren brukes fordi den gir det resterende av å dele tallet på 10
            sum += digit;                       //Her legges resten til sum variabelen
          //  System.out.println(i + "\t" + n + "\t" + digit + "\t" + sum);
            n = n / 10;                         //Flytter alle tallene en plass til høyre ved å dele tallet på 10, tallet blir 10 ganger mindre. Her får man i praksis det neste tallet helt til høyre, som neste iterasjon jobber med
            i++;
        }
       // System.out.println("\t" + n + "\t\t" + sum);
        return sum;

    }

    public static int sifferrot(int n) {

        while (n >=10) {
            n = tverrsum(n);
        }
        return n;
    }

    //Fra fasit:
    //Vi har for alle ikke-negative heltall n at 9 går opp i n hvis og bare hvis 9 går opp i tverrsummen til n.
    // Se oppgave 5a) nedenfor. Det betyr at sifferroten til et heltall n der 9 går opp, er lik 9. Hvis n ikke går opp,
    // er sifferroten lik resten når n deles med 9.

    public static int sifferrot2(int n)
    {
        n %= 9;
        return n == 0 ? 9 : n;
    }

    public static int kvadratrot(int n) {
        int sqr = n * n;
        for (int i = 0; i > n; i++) {
            return kvadratrot(sqr);
        }
        return sqr;
    }
}
