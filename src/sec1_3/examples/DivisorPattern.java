package sec1_3.examples;

import java.util.Scanner;

public class DivisorPattern {
    public static void main(String[] args) {
        // print a square that visualizes divisors.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");

        int n = input.nextInt();

        for(int i = 1; i <= n; i++) {
            // print the ith line.
            for(int j = 1; j <= n; j++) {
                if((i % j == 0) || (j % i == 0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}
