
/**import java.util.ArrayList;

public class ansr12 {
    // . Write a Java program to find the duplicate values of an array of integer
    // values.
    public static void duplicate(int[] arr) {
        ArrayList al = new ArrayList();
        boolean mkr = true;
        for (int i = 0; i < arr.length; i++) {

            if (al.contains(arr[i])) {

                System.out.println(arr[i]);
               
            } else {
                al.add(arr[i]);

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 1, 21, 1, 1, 2, 3, 4, 2, 4 };
        duplicate(arr);

    }
//drawback   of this code is   it gives ans : 1 1 2    4
}**/

import java.util.HashSet;
import java.util.Set;

public class Ans12 {
    // Write a Java program to find the duplicate values of an array of integer
    // values.
    public static void findDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElements.add(num)) { // If the element is already in the set, it's a duplicate
                duplicateElements.add(num);
            }
        }

        // Print duplicate elements
        System.out.println("Duplicate elements: " + duplicateElements);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 1, 21, 1, 1, 2, 3, 4, 2, 4 };
        findDuplicates(arr);
    }
}
