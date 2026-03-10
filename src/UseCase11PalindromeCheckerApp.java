import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class (Encapsulation)
class PallindromeCheckerApp {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        input = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare characters
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result)
            System.out.println("The given string is a PALINDROME.");
        else
            System.out.println("The given string is NOT a PALINDROME.");

        sc.close();
    }
}