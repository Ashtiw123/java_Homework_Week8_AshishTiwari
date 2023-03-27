package javaHomeworkWeek8;
/*Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
 Input an alphabet: p
 Expected Output:
 Input letter is Consonant

 */
import java.util.Scanner;

public class Prog3VowelConsonant {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = a.next().toLowerCase();
        //if Else method separating / highlighting Vowels and Consonant
        if (letter.length() != 1 || !Character.isLetter(letter.charAt(0))) {
            System.out.println("Error: Please enter a single letter.");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") ||
                letter.equals("o") || letter.equals("u")) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }

    }

}

