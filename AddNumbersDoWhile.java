package Chapter4Whileloop;

import java.util.Scanner;

public class AddNumbersDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean again;

        // The loop will always run at least once
        do {
            System.out.print("Enter the first number: ");
            int a= input.nextInt();
            System.out.print("Enter the second number: ");
            int b= input.nextInt();
            int sum= a + b;
            System.out.print("Sum is:" +sum);

            System.out.println("\nWould like to use the summation again:");
            again= input.nextBoolean();

        } while (again);  // Continue looping if you want more of summation


    }
}
