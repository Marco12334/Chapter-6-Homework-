import java.util.ArrayList;
import java.util.Random;

/**
 * 6.8.4. Exercise 4
 *
 * Create an ArrayList of Integers named dice4. Generate an Integer representing
 * a roll of a six-sided die 5 times, adding each result to dice4. Print the
 * ArrayList using an enhanced for loop.
 * Sample output: dice4 = 3 2 4 4 1
 */
public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> dice4 = new ArrayList<>();
        Random rand = new Random();

        // Generate 5 random dice rolls and add to ArrayList
        for (int i = 0; i < 5; i++) {
            dice4.add(rand.nextInt(6) + 1); // Generate random value from 1 to 6
        }

        // Print ArrayList using enhanced for loop
        System.out.print("dice4 = ");
        for (int roll : dice4) {
            System.out.print(roll + " ");
        }
    }
}