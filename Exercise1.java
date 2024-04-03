import java.util.Random;

/**
 * 6.8.1. Exercise 1
 *
 * Create an integer array named dice1 with a size of 10. Populate each array
 * location with a roll of a six-sided die.
 * Print the array out using an enhanced for loop.
 * Sample output: dice1 = 1 1 6 2 3 5 1 5 4 5
 */
public class Exercise1 {
    public static void main(String[] args) {
        int[] dice1 = new int[10];
        Random rand = new Random();

        // Populate array with dice rolls
        for (int i = 0; i < dice1.length; i++) {
            dice1[i] = rand.nextInt(6) + 1; // Generate random value from 1 to 6
        }

        // Print array using enhanced for loop
        System.out.print("dice1 = ");
        for (int roll : dice1) {
            System.out.print(roll + " ");
        }
    }
}