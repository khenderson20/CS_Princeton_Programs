package sec1_3.examples;

public class TenHellos {
    public static void main(String[] args) {
        // print 10 Hellos.
        System.out.println("1st Hello");
        System.out.println("2nd Hello");
        System.out.println("3rd Hello");
        int i = 4;
        while(i <= 10) {
            // print the ith Hello.
            System.out.println(i + "th Hello");
            i = i + 1;
        }
    }
}
