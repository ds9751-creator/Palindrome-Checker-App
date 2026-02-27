public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "madam";
        String reversed = ""; // This starts empty

        // 2. The For Loop
        // int i = original.length() - 1  -> Start at the last character index
        // i >= 0                        -> Keep going until we hit the first character
        // i--                           -> Move one step backward each time
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // 3. Print both to see what happened
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // 4. Compare them
        if (original.equals(reversed)) {
            System.out.println("Result: It is a palindrome!");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}
