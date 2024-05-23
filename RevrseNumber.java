public class ReverseNumber {
    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            reversedNum = reversedNum * 10 + digit;  // Append the digit to reversedNum
            num /= 10;  // Remove the last digit from num
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        int originalNumber = 12345;
        int reversedNumber = reverseNumber(originalNumber);
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
