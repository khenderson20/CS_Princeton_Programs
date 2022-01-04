package sec1_2;

import java.util.Scanner;

/*
    1.2.26 Polar coordinates.
    Write a program that converts from Cartesian to polar coordinates.
    Your program should accept two double command-line arguments 'x' and 'y' and print the polar coordinates 'r' and
    'theta'. Use the method Math.atan2(y, x) to compute the arc-tangent value of y/x that is in the range from -pi to pi

    r = sqrt(x^2 + y^2)
    theta = atan(y / x)
 */

public class polar_coordinates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x, y, r, theta;

        System.out.print("Input two points (x,y):");
        x = input.nextDouble();
        y = input.nextDouble();

        System.out.print(String.format("%40s\n", "*").replace(" ", "*"));
        System.out.printf("x: %.2f\ny: %.2f\n\n", x, y);
        System.out.print("r = sqrt(x^2 + y^2)\ntheta = atan2(y / x)\n\n");
        r = Math.sqrt(Math.pow(x, 2) + Math.pow(y , 2));
        theta = Math.atan2(y, x);
        System.out.printf("--Polar Coordinates--\nr = %f\ntheta (in radians) = %f\n", r, theta);
        System.out.print(String.format("%40s", "*").replace(" ", "*"));
    }
}
