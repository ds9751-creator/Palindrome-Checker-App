public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "level";
        char[] charArray = original.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("'" + original + "' is a palindrome.");
        } else {
            System.out.println("'" + original + "' is NOT a palindrome.");
        }
    }
}
