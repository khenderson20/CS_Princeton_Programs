package sec1_3.examples;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (n) to see it's binary form:");
        int n = input.nextInt();
        int power = 1;

        while(power <= n/2) {
            power = 2 * power;
            // now power is the largest power of 2 <= n.
        }
            while(power > 0) {
                // cast out powers of 2 in decreasing order.
                if(n < power) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                    n -= power;
                }
                power /= 2;
            }
            System.out.print('\n');

    }
}
