package Uke38;

public class Recursion {

    public static void main(String[] args) {
        int value = 15;
        int return_value = recursiveFunction(value);
        System.out.println("Main: " + return_value);

        // Fakultet: n!
        // 5! = 5*4*3*2*1 => 120
        // 8! = 8*7*6*5*4*3*2*1
        // 52! = veldig veldig stort tall. - 52*51*50....
        int five_factorial = factorial(5);
        System.out.println("5! = " + five_factorial);
        System.out.println("8! = " + factorial(8));
        System.out.println("52! = " + factorial(52));
    }

    /**
     * This function calculates n! (n factorial) using a recursive
     * function call
     * @param n - value to compute the factorial of
     * @return n! - n factorial
     */
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            //8*7*6....
            return n*factorial(n-1);
        }
    }

   static int recursiveFunction(int value) {
       System.out.println("Recursive function: " + value);

       if (value <= 5) {
           return -9;
       } else {
           return recursiveFunction(value - 1);
       }
   }
}
