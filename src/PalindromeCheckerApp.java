public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "madam";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        if (original.equals(reversed)) {
            System.out.println("Result: It is a palindrome!");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}
