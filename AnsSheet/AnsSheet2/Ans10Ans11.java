import java.util.Arrays;
import java.util.*;

public class Ans10Ans11 {

    // Write a Java program to find the maximum and minimum value of an array.
    public static void main(String[] args) {
        int[] arr = { 12, 32, 12, 5, 6, 4, 332 };
        // Short ans
        Arrays.sort(arr);
        System.out.println("maximum element is: " + arr[arr.length - 1]);
        System.out.println("Minimum val = " + arr[0]);

        // reverse an array
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

}
