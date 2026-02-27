import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "racecar";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is NOT a palindrome.");
        }
    }
}
