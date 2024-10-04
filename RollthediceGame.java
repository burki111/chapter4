package Chapter4Whileloop;

import java.util.Random;
import java.util.Scanner;

public class RollthediceGame {
    public static void main(String[] args) {
        Random number = new Random();
        //Scanner input = new Scanner(System.in);
        int rolldie = 5;
        int totalboardspace = 20;
        int currentspacecovered = 0;

        for (int i = 1; i <= rolldie; i++) {
            int dice = number.nextInt(6) + 1;
            currentspacecovered = currentspacecovered + dice;
            System.out.println("Roll Dice No." + i + ", Your dice advanced to " + dice + " spaces");

            if (currentspacecovered == totalboardspace) {

                System.out.println("You are on exactly space board " + totalboardspace + "  You win!");
                break;
            } else if (i == rolldie && currentspacecovered < totalboardspace) {
                System.out.println("You ended on space " + currentspacecovered+ ".") ;
                        System.out.println(" Unfortuntely You lost!");

            } else if (currentspacecovered > totalboardspace) {
                System.out.println("You have advanced above the total" + totalboardspace + " spaces, You lost!");
                break;
            } else {
                int spacetogo = totalboardspace - currentspacecovered;
                System.out.println("You are currently on game space " + currentspacecovered +
                        ", You need " + spacetogo + " to win");
            }
            System.out.println();
        }
    }
}





