import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * 6.8.6. Exercise 6
 *
 * Consider the follow ArrayList:
 * As you can observe, a java programmer has mistakenly entered the 1900
 * date item into the ArrayList. Without removing the associated
 * centennials.add(...) source line, write the code to remove the errant
 * entry. Print out the resulting ArrayList and size as follows:
 */
public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1900, Month.JULY, 4)); // Errant entry
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Before removal:");
        for (LocalDate date : centennials) {
            System.out.println(formatter.format(date));
        }
        System.out.println("size = " + centennials.size());

        // Remove errant entry
        centennials.remove(LocalDate.of(1900, Month.JULY, 4));

        System.out.println("\nAfter removal:");
        for (LocalDate date : centennials) {
            System.out.println(formatter.format(date));
        }
        System.out.println("size = " + centennials.size());
    }
}