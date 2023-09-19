public class numberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        
        if (number < 0) {
            number *= -1;
        }
         int stored = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        return stored == reverse;
    }
}