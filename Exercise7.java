import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 * 6.8.7. Exercise 7
 *
 * Consider the follow ArrayList:
 * write the code necessary to determine the ArrayList size. Sample output:
 *
 * size = 4
 */
public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        int size = centennials.size();
        System.out.println("size = " + size);
    }
}