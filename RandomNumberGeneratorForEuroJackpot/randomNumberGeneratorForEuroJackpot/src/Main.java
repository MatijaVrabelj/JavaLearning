import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int min = 1; // Minimum value of range
        int max = 50;
        int min2 = 1; // Minimum value of range
        int max2 = 10;// Maximum value of range
        // Print the min and max
        for(int i = 1; i<=5; i++) {
            System.out.println("Random value in int from " + min + " to " + max + ":");
            // Generate random int value from min to max
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            // Printing the generated random numbers
            System.out.println(random_int);
        }
        System.out.println("-----------------------------------------------------------");
        for(int i = 1; i<=2; i++) {
            System.out.println("Random value in int from " + min2 + " to " + max2 + ":");
            // Generate random int value from min to max
            int random_int = (int) Math.floor(Math.random() * (max2 - min2 + 1) + min2);
            // Printing the generated random numbers
            System.out.println(random_int);
        }
        }
    }

