import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 6.8.5. Exercise 5
 *
 * Consider the following source:
 *
 * int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
 * int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};
 *
 * Create an new ArrayList named intersection that contains only those items that
 * occur in both lists. If a value is duplicated in either list and it occurs in
 * both lists, it should only occur once in the intersection list. For the lists
 * provided, your ArrayList should contain: 2 4 8 10
 */
public class Exercise5 {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};

        ArrayList<Integer> intersection = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements from list1 to set1
        for (int num : list1) {
            set1.add(num);
        }

        // Add elements from list2 to set2
        for (int num : list2) {
            set2.add(num);
        }

        // Find intersection of set1 and set2
        set1.retainAll(set2);

        // Add elements from set1 to intersection ArrayList
        for (int num : set1) {
            intersection.add(num);
        }

        System.out.println("intersection = " + intersection);
    }
}