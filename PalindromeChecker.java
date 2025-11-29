package Phase1Projects;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        String reversedWord = new StringBuilder(word).reverse().toString();

        if(word.equalsIgnoreCase(reversedWord)) {
            System.out.println("The word is a palindrome!");
        } else {
            System.out.println("The word is not a palindrome!");
        }
    }
}