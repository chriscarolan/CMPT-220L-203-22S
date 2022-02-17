package base;
import java.lang.Math;
import java.util.*;
import java.util.stream.*;

public class Main {
    /**
     * # Lab Four
     * ---
     * <p>
     * For this lab we're going to be making and using a bunch of functions.
     * <p>
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args) {
        // Give me an example of you using switch case.
        String sport = "Basketball";

        switch (sport) {
            case "Basketball":
                System.out.println("Basketball is very fun to play and watch, great sport!");
            case "Baseball":
                System.out.println("Baseball is very difficult to play but fun to watch!");
            case "Football":
                System.out.println("Football is great, very fun to watch!");
            default:
                System.out.println("Not an generic sports fan I guess?");
        }
        // Give me an example of you using a for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("for " + i);
        }
        // Give me an example of you using a while loop
        int i = 0;
        while (i < 3) {
            System.out.println("while " + i);
            i++;
        }
        power();
        list();

        pythagorean();
    }

    // For the following todos you'll probably want to define them below and then call them from the main function above.
        static void power() {
        /**
         * I want you to write a function that will take in a number and raise it to the power given.
         * For example if given the numbers 2 and 3. The math that the function should do is 2^3
         * and should print out or return 8. Print the output.
         */
            double a = 2;
            double b = 3;

            System.out.println(Math.pow(a, b));
        }

        /**
         * I want you to write a function that will take in a list and see how many times a given number is in the list.
         * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
         * or return 3. Print the output.
         */
        static void list() {
            //char numbers[] = {2, 3, 5, 2, 3, 6, 7, 8, 2};
            //long count = numbers.stream().filter(number -> "2".equals(numbers)).count();
            //int characterFinder(char targetCharacter, String string) {
                //int total = 0;
                //for (char character: string.toCharArray()){
                    //if (character == targetCharacter) {
                        //total++;
                    //}
                //}
                //return total;
            //}

            //int output = characterFinder('2', numbers);
            //System.out.println(output);
        }


        /**
         * Create a function named summation that will take in an int[ ] and return an int.
         * I want the function to then go through the given array and sum up digits in the array.
         * Once that’s done print or return the answer. Print the output
         */
        static void summation() {
            int fun[] = {2, 4, 6, 8};

        }

        /**
         * Give me a function that gives the answer to the pythagorean theorem.
         * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
         * <p>
         * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
         * Given a and b as parameters i'd like you to return c.
         * <p>
         * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
         * <p>
         * Once that’s done print or return the answer. Print the output
         */
        static void pythagorean() {
            double a = 3;
            double b = 4;

            double powerA = (Math.pow(a, 2));
            double powerB = Math.pow(b,2);
            double c = powerA + powerB;
            System.out.println(Math.sqrt(c));

        }

        int addition(int a, int b) {
            int answer = a + b;
            return answer;
        }

        int division(int a, int b) {
            int answer = a / b;
            return answer;
        }
    }

