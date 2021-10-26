package Uke42;

import hjelpeklasser.BinTre;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] posisjon = {1,2,3,5,6,7,10,11,12,13,21,24,25,42,43};
        Character[] verdi = {'D', 'I', 'H', 'L', 'O', 'B', 'A', 'E', 'N', 'G', 'K', 'M',
        'J', 'F', 'C'};

        int[] posisjon2 = {1,2,3,4,5,6,7,10,11,13,14,22,23,28,29};
        Character[] verdi2 = {'E', 'I', 'B', 'G', 'A', 'H', 'K', 'L', 'O', 'D', 'N', 'M',
        'C', 'J', 'F'};

        BinTre<Character> tre = new BinTre<>(posisjon, verdi);  // den nye konstruktøren

        BinTre<Character> tre2 = new BinTre<>(posisjon2,verdi2);


        int[] posisjon3 = {1,2,3,5,10,11,22,23,44,47};
        Integer[] verdi3 = {1,2,3,4,5,6,7,8,9,10};

        BinTre<Integer> tre3 = new BinTre<>(posisjon3, verdi3);



        int[] posisjon4 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Integer[] verdi4 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        BinTre<Integer> tre4 = new BinTre<>(posisjon4, verdi4);

        System.out.println(tre4.hent(11));

        int[] pos;


        int n = 15, k = 1;
        for (int i = 1; i <= n; i++)
        {

            k *= 2;
        }


    }
}
