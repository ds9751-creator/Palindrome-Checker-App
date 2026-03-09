import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome (case-insensitive & ignoring spaces).");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}