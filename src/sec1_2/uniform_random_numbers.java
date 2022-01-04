package sec1_2;

/*
*   1.2.30 Uniform random numbers.
*   Write a program that prints five uniform random numbers between 0 and 1, their average value, their minimum
*   value and maximum value.
*   Use Math.random(),
*       Math.min(),
*       Math.max().
*
 */
public class uniform_random_numbers {
    public static void main(String[] args) {

        double r1, r2, r3, r4, r5, avg, min, max;

        r1 = Math.random();
        r2 = Math.random();
        r3 = Math.random();
        r4 = Math.random();
        r5 = Math.random();

        avg = (r1 + r2 + r3 + r4 + r5 / 5);
        min = Math.min(r1, Math.min(r2, Math.min(r3, Math.min(r4, r5))));
        max = Math.max(r1, Math.max(r2, Math.max(r3, Math.max(r4, r5))));
        System.out.printf("r1 - %f\nr2 - %f\nr3 - %f\nr4 - %f\nr5 - %f\nAverage = %f\nMin = %f\nMax = %f", r1, r2, r3,
                r4, r5, avg, min, max);
    }
}
