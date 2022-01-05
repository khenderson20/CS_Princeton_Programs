package sec1_3.examples;

public class Flip {
    public static void main(String[] args) {
        // simulate a fair coin flip
        if(Math.random() < 0.5) System.out.println("Heads");
        else                    System.out.println("Tails");
    }
}
