import java.util.Random;

/**
 * 6.8.2. Exercise 2
 *
 * Create an integer array named dice2 with a size of 6. Populate each array
 * location with a roll of a six-sided die.
 * Print the array out using an indexed for loop.
 *
 * Sample output: dice2 = 4 5 6 1 4 1
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[] dice2 = new int[6];
        Random rand = new Random();

        // Populate array with dice rolls
        for (int i = 0; i < dice2.length; i++) {
            dice2[i] = rand.nextInt(6) + 1; // Generate random value from 1 to 6
        }

        // Print array using indexed for loop
        System.out.print("dice2 = ");
        for (int i = 0; i < dice2.length; i++) {
            System.out.print(dice2[i] + " ");
        }
    }
}