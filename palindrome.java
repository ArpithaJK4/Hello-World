public class PalindromeChecker {

    public static void main(String[] args) {
        String input = "madam";  // You can change this to test other strings.
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            // Compare characters at left and right positions
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // Characters do not match, not a palindrome
            }
            left++;
            right--;
        }
        return true;  // All characters matched, it's a palindrome
    }
}
