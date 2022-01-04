package sec1_2;

import java.util.Scanner;

/*
    1.2.25 Wind Chill.
    Given the temperature 't' (in degrees Fahrenheit) and the wind speed 'v' (in miles per hour), the National
    Weather Service defines the effective temperature (the wind chill) as follows:

    w = 35.74 + (0.6215 * t) + (0.4275 * t - 35.75)v^0.16

    Write a program that takes two double command-line arguments 'temperature' and 'velocity' and prints the wind
    chill. Use Math.pow(a, b) to compute a^b.
    NOTE: the formula is not valid if 't' is larger than 50 in absolute value or if 'v' is larger than 120 or less
    than 3 (you may assume the values you get are within range).

 */
public class wind_chill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double temperature, velocity, w_chill;

        System.out.print("Enter the temperature (in degrees Fahrenheit): ");
        temperature = input.nextDouble();
        System.out.print("Enter the velocity (in miles per hour): ");
        velocity = input.nextDouble();

        System.out.print(String.format("%80s\n", "*").replace(" ", "*"));
        w_chill = 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16);
        System.out.println("Formula: C = 35.74 + (0.6215 * t) + (0.4275 * t - 35.75)v^0.16\n");
        System.out.printf("T = %f\nV = %f\n\n", temperature, velocity);
        System.out.printf("Chill (in degrees Fahrenheit) = %f\n", w_chill);
        System.out.print(String.format("%80s\n", "*").replace(" ", "*"));
    }
}
