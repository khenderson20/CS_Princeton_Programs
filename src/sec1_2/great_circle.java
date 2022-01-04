package sec1_2;

import java.util.Scanner;
/*
*   1.2.33 Great Circle.
*   Write a program that takes four double command-line arguments -- x1, y1, x2, y2 -- (the latitude and longitude,
*   in degrees, of two points on the earth) and prints the great-circle distance between them.
*
*   The great-circle distance (in nautical miles) is given by the following equation.
*
*   d = 60 * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
*
*   NOTE: This equation uses degrees, whereas java's trig functions use radians.
*   Use Math.toRadians() and Math.toDegrees() to convert between the two.
*
*   Use the program to compute the great-circle distance between Paris(48.78, -2.33) and San Francisco(37.8, 122.4)
*
 */

public class great_circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x1, y1, x2, y2, distance;

        System.out.print("Enter the Latitude and Longitude of two points on the Earth (x1, y1) and (x2, y2):");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        distance = 60 * (Math.acos(Math.sin(x1) * Math.sin(x2)
                        + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));

        System.out.printf("distance in Radians = %.5f\ndistance in Degrees = %.5f", distance, Math.toDegrees(distance));

    }
}
