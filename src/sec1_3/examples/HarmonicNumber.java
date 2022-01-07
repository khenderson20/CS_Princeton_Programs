package sec1_3.examples;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        // compute the nth harmonic number.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (n) to compute the nth harmonic number:");

        int n = input.nextInt();
        double sum = 0.0;

        for(int i = 1; i <= n; i++) {
            // add the ith term to the sum.
            sum += 1.0/i;
        }
        System.out.println(sum);
    }
}
