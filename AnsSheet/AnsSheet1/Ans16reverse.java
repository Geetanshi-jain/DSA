import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Ans16reverse {
    public static void reverse(int[] arr) {
        // Way 1 : for loop :without extra spae
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + "  ");
        }
        // 2.
        System.out.println("using Collections ");
        Collections.reverse(Arrays.asList(arr));
        for (int elm : arr) {
            System.out.print(elm + "  ");
        }
    }

    // using recursion

    public static void recursion(int[] arr, int n) {
        if (n == arr.length) {
            return;
        }
        recursion(arr, n + 1);
        System.out.print(arr[n] + "  ");
    }

    public static void main(String args[]) { // Driver code to test above function int []arr = new int[]{1,2,3}}
        reverse(new int[] { 1, 2, 3, 4, 5, 32, 1 });
        System.out.println("Using Recursion");
        recursion(new int[] { 12, 2, 13, 6, 5, 3 }, 0);

    }
}
