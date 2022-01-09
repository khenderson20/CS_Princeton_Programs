package sec1_3.examples;

import java.util.Scanner;

/*
*   This program uses Newton's Method to compute the square root of the integer entered to 15 decimal places of
*   accuracy.
*
*   Computing the square root of a positive number c is equivalent to finding the positive root of the function
*   f(x) = x^2 - c
*
 */

public class Sqrt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (c) to calculate it's square root:");

        double c = input.nextDouble();
        final double EPSILON = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > EPSILON * t) {
            // Replace t by the average of t and c/t.
            t = (c/t + t) / 2.0;
        }
        System.out.println(t);
    }
}
