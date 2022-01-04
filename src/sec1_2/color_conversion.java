package sec1_2;

import java.util.Scanner;

/*
*   1.2.32 Color conversion.
*   Several formats are used to represent color.
*   For example, the primary format for LCDs, digital cameras, and web pages, known as RGB format, specifies the
*   level of (R) Red, (G) Green, and (B) Blue on an integer scale from 0 to 255.
*   The primary format for publishing books and magazines, is known as CMYK format, which specifies the level of
*   (C)     (M)        (Y)      (K)
*   Cyan    Magenta    Yellow   Black
*   from 0.0 to 1.0.
*
*   Write a program that converts RGB to CMYK.
*   Take three integers -- R, G, B -- and print the equivalent CMYK values.
*   IF the RGB values are all 0, then the CMY values are all 0 and the K value is 1;
*   otherwise use the formulas below.
*
*   w = max(r/255, g/255, b/255)
*   c = (w - (r/255)) / w
*   m = (w - (g/255)) / w
*   y = (w - (b/255)) / w
*   k = 1 - w
*
 */
public class color_conversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean rgbZero;
        double r, g, b;
        double w, c, m, y, k;
        // gather input.
        System.out.print("Enter three RGB values:");
        r = input.nextDouble();
        g = input.nextDouble();
        b = input.nextDouble();

        // check if values are zero
        rgbZero = (r == 0 && g == 0 && b == 0);
        final double max;
        max = Math.max(r / 255, Math.max(g / 255, b / 255));
        w = max;
        if(rgbZero) {
            c = 0;
            m = 0;
            y = 0;
        } else {
            // calculate CMYK values.
            c = (w - (r/255)) / w;
            m = (w - (g/255)) / w;
            y = (w - (b/255)) / w;
        }
        k = 1 - w;
        // print the values
        System.out.printf("---RGB Values---\nR = %f\nG = %f\nB = %f\n\n---CMYK Values---\nC = %f\nM = %f\nY = %f\nK =" +
                " %f\n", r, g, b, c, m, y, k);
    }
}
