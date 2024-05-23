public class ReverseString {
    public static String reverseString(String s) {
        String reversedStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedStr += s.charAt(i);
        }
        return reversedStr;
    }

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);
        System.out.println(reversedString);
    }
}
