import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 * 6.8.8. Exercise 8
 *
 * Consider the follow ArrayList:
 * write the code necessary to determine if the centennial (1876, at 100 years)
 * is present.
 *
 * Sample output:
 *
 * centennial present = true
 */
public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        boolean centennialPresent = centennials.contains(LocalDate.of(1876, Month.JULY, 4));
        System.out.println("centennial present = " + centennialPresent);
    }
}