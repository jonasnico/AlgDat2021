package Forelesning_07sept;

import java.util.Arrays;

public class BubbleSort {

    // Bubble sort

    public static void main(String[] args) {
        int[] values = {5, 6, 9, 2, 8, 3, 1};

        // To for-løkker
        // ytre løkke sorterer ett tall per gjennomgang
            for (int i = 0; i < values.length - 1; i++) {

                System.out.println("Array før sortering av index " + i);
                System.out.println(Arrays.toString(values));
                // Indre løkke bobler opp tall til riktig posisjon
                for (int j = values.length - 1; j > i; j--) {
                    // Sjekk om tall på posisjon j og (j-1) er sortert riktig

                    if (values[j] < values[j - 1]) {
                        System.out.println("Inversjon! bytter plass på " + j + " og " + i);
                        System.out.println(Arrays.toString(values));

                        int tmp = values[j];
                        values[j] = values[j - 1];
                        values[j - 1] = tmp;
                    }
                }

            }
            System.out.println("Sorterte verdier");
            System.out.println(Arrays.toString(values));
        }
    }

