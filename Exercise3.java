import java.util.ArrayList;
import java.util.Random;

/**
 * 6.8.3. Exercise 3
 *
 * Create an ArrayList of Integers named dice3. Generate an Integer representing
 * a roll of a six-sided die 10 times, adding each result to dice3. Print the
 * ArrayList using an enhanced for loop.
 * Sample output: dice3 = 3 5 5 1 2 5 3 2 6 5
 */
public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> dice3 = new ArrayList<>();
        Random rand = new Random();

        // Generate 10 random dice rolls and add to ArrayList
        for (int i = 0; i < 10; i++) {
            dice3.add(rand.nextInt(6) + 1); // Generate random value from 1 to 6
        }

        // Print ArrayList using enhanced for loop
        System.out.print("dice3 = ");
        for (int roll : dice3) {
            System.out.print(roll + " ");
        }
    }
}