package sec1_3.examples;

import java.util.Scanner;
public class PowersOfTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // print the first n powers of 2.
        System.out.print("Enter an integer (n) to compute 2^n powers:");
        int n = input.nextInt();
        int power = 1;
        int i = 0;
        System.out.printf(" i %10s\n--------------------\n", "power");
        while(i <= n) {
            System.out.printf("%2d %10d\n", i, power);
            power = 2 * power;
            i = i + 1;
        }
    }
}
