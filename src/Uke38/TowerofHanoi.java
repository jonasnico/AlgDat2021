package Uke38;

public class TowerofHanoi {

    public static void main(String[] args) {
        towerofHanoi(4);
    }


    /**
     * Lager en funksjon som kjører "tower of hanoi"
     * ved hjelp av rekursive kall
     * @param num_pieces Antall brikker å bruke i spillet
     */

    public static void towerofHanoi(int num_pieces) {
        hanoiMove(num_pieces, 'A', 'C', 'B');
    }

    /**
     * Utfører et rekursivt
     * @param piece_number Brikken vi skal flytte på nå
     * @param from Stikken vi flytter fra => "A"
     * @param to Stikken vi flytter til => "C"
     * @param helper Hjelpestikken => "B"
     */

    public static void hanoiMove(int piece_number, char from, char to, char helper) {

        //Vi slutter rekursjon når vi har kommet til øverste brikke
        if (piece_number < 0) {
            return;
        }

        //Punkt 1: Flytt alt fra stikke C over til stikke B.
        //         Bruk Stikke A som hjelpestikke
        hanoiMove(piece_number -1, to, helper, from);


        //Punkt 2: Flytt øverste brikke fra A til C
        //         Trenger ingen hjelpestikke => flytter bare en brikke
        System.out.println("Flytter " + piece_number + " " + from + "-" + to);


        //Punkt 3: Flytt alt på stikk B (fra punkt 1) til stikke C
        //         Bruk stikke A som hjelpestikke
        hanoiMove(piece_number-1, helper, to, from);

    }






}


