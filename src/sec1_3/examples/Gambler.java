package sec1_3.examples;

import java.util.Scanner;

public class Gambler {
    public static void main(String[] args) {
        // Run trial experiments that start with
        // $stake and terminate on $0 or $goal
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");

        int stake = input.nextInt();
        int goal = input.nextInt();
        int trials = input.nextInt();
        int bets = 0;
        int wins = 0;
        for(int t = 0; t < trials; t++) {
            // Run one experiment
            int cash = stake;
            while(cash > 0 && cash < goal) {
                bets++;
                if(Math.random() < 0.5) cash++;
                else                    cash--;
            }
            if(cash == goal) wins++;
        }
        System.out.println(100 * wins / trials + "% wins");
        System.out.println("Avg # bets: " + bets / trials);
    }
}
