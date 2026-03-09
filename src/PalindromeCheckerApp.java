import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static boolean iterativePalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean recursivePalindrome(String text, int start, int end) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return recursivePalindrome(text, start + 1, end - 1);
    }

    public static boolean stackPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) stack.push(c);
        for (char c : text.toCharArray()) if (c != stack.pop()) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to test palindrome performance:");
        String input = scanner.nextLine();

        long startTime, endTime;

        startTime = System.nanoTime();
        iterativePalindrome(input);
        endTime = System.nanoTime();
        System.out.println("Iterative approach: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        recursivePalindrome(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        System.out.println("Recursive approach: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        stackPalindrome(input);
        endTime = System.nanoTime();
        System.out.println("Stack-based approach: " + (endTime - startTime) + " ns");

        scanner.close();
    }
}