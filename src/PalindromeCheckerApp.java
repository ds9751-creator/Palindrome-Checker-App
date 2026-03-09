import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;

interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) {
            stack.push(c);
        }
        for (char c : text.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (char c : text.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String text) {
        return strategy.isPalindrome(text);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine();

        System.out.println("Choose strategy: 1 = Stack, 2 = Deque");
        int choice = scanner.nextInt();
        scanner.nextLine();

        PalindromeStrategy strategy = (choice == 1) ? new StackStrategy() : new DequeStrategy();
        PalindromeContext context = new PalindromeContext(strategy);

        if (context.executeStrategy(input)) {
            System.out.println("The string is a palindrome using the chosen strategy.");
        } else {
            System.out.println("The string is NOT a palindrome using the chosen strategy.");
        }

        scanner.close();
    }
}