package javaHomeworkWeek8;

import java.util.Scanner;

/*
Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
 */
public class Prog2MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE; //declaring Variable MAX
        int max = Integer.MIN_VALUE; //declaring Variable MAX
        //While Loop
        while (true) {
            System.out.print("Enter number: ");
            if (input.hasNextInt()) {
                int num = input.nextInt();
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            } else {
                System.out.println("Invalid input!");//
                break;
            }
        }
        //Print when invalid input Min and Max values only from the input
        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
    }
}



