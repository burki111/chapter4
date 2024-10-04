package Chapter4Whileloop;

import java.util.Scanner;

public class InputValidationWhileLoop {
    public static void main(String args[]) {

        int hourlypay = 15;
        int weeklyhours= 40;

        System.out.println("Enter the number of weekly hours you have worked:");
        Scanner input = new Scanner(System.in);

        int weeklyworked = input.nextInt();

        while(weeklyworked>weeklyhours){
            System.out.println("Incorrect: Your weekly working hours must be btw 1 to 40, Try again");
             weeklyworked = input.nextInt();
        }
        double payforweeklyhours = hourlypay*weeklyhours;
        System.out.println("Your weekly pay is: "+payforweeklyhours);
    }
}
