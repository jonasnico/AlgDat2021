package Uke42;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        int[] array = {1,2,5,10,20,21,3,6,13,26,27};

        boblesortering(array);


        System.out.println(Arrays.toString(array));
    }

    public static void boblesortering(int[] array) {
        for (int i = array.length; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                if (array[j-1] > array[j]) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    }



