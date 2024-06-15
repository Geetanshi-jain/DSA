import java.util.*;

public class Ans28 {

    public static int minmaxdiff(int[] arr) {
        Arrays.sort(arr);
        if (arr.length == 0) {
            return -1;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            return arr[arr.length - 1] - arr[0];
        }
    }

    public static void main(String[] args) {
        // Write a Java program to get the difference between the largest and smallest
        // values in an array of integers. The length of the array must be 1 and above.
        int[] arr = { 1 };
        int[] arr1 = { 2, 3, 53, 4, 2 };
        System.out.println(minmaxdiff(arr1));
        System.out.println(minmaxdiff(arr));
                }

}
