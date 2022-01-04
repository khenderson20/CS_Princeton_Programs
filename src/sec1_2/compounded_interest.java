package sec1_2;
/*
    1.2.24 Continuously compounded interest.
    Write a program that calculates and prints the amount of money you would have after 't' years if you invested 'P'
     dollars at an annual interest rate 'r' (compounded continuously). The desired value is given by the formula Pe^rt.
 */
import java.util.Scanner;
public class compounded_interest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int principal, years;
        double rate, amount;

        System.out.print("Enter the principal amount: $");
        principal = input.nextInt();
        System.out.print("Enter the number of years:");
        years = input.nextInt();
        System.out.print("Enter the annual interest rate (in %) : %");
        rate = input.nextDouble();

        System.out.print(String.format("%40s\n", '*').replace(" ", "*"));
        amount = principal * Math.pow(Math.E, (rate/100 * years));
        System.out.println("Formula: A = Pe^rt\n");
        System.out.printf("P = %d\ne = %.6f\nr = %.3f\nt = %d\n\n", principal, Math.E, rate/100, years);
        System.out.printf("A = %.2f\n", amount);
        System.out.print(String.format("%40s", '*').replace(" ", "*"));
    }
}
