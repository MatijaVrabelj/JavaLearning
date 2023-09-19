import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Type number between 0-9");
        int number = scanner.nextInt();
        NumberInWord.printNumberInWord(number);

    }
}
