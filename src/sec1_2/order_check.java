package sec1_2;

import java.util.Scanner;

/*
    1.2.28 Order Check.
    Write a program that takes three double command-line arguments (x, y, z) and prints 'true' if the values are
    strictly ascending or descending (x < y < z) OR (x > y > z), and 'false' otherwise.
 */
public class order_check {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x, y, z;
        boolean ascending, descending;

        System.out.print("Enter 3 numbers in any order:");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        ascending = (x < y && y < z);
        descending = (x > y && y > z);
        System.out.printf("numbers -- %d %d %d -- ascending? %b -- descending? %b", x, y, z, ascending, descending);




    }
}
