package sec1_2;

import java.util.Scanner;

/*
*   1.2.34 Three-sort
*   Write a program that takes three integer command-line arguments and prints them in ascending order.
*   Use Math.min() and Math.max().
*
 */
public class three_sort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, n3;
        System.out.print("Enter three integers in any order:");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        int min = Math.min(n1, Math.min(n2, n3));
        int max = Math.max(n1, Math.max(n2, n3));
        int median = n1 + n2 + n3 - min - max;

        System.out.printf("%d %d %d", min, median, max);
    }
}
