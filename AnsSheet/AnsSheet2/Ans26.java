import java.util.*;
import java.util.stream.Stream;

public class Ans26 {
    // Write a Java program to move all 0's to the end of an array. Maintain the
    // relative order of the other (non-zero) array elements.
    // Input: int[] arr
    public static void moveZeroInEnd(int[] arr) {
        int nonZero = 0;
        Stream.of(arr);
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZero] = arr[i];
                nonZero++;
            }

        }

        for (int i = nonZero; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 4, 2 };
        moveZeroInEnd(arr);
        // print
        System.out.println("Array is :");
        for (int elm : arr) {
            System.out.println(elm);
        }

    }

}
