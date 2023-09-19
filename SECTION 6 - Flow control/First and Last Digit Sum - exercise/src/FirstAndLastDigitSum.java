public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            while(number >= 10)
            {
                number/=10;
            }
            int firstDigit = number;
            return firstDigit+lastDigit;
        }

    }
}
