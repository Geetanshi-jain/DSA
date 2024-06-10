import java.util.Arrays;

public class Ans15mergeTwoarryToThird {

    public static void main(String[] args) {
        int[] arr = { 12, 3, 2, 1, 4, 3 };
        int arr1[] = { 1, 2, 4, 3, 21 };
        int arr2[] = new int[arr.length + arr1.length];
        // Copy elm from 1 to another
        for (int i = 0; i <= arr1.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = arr.length; i < arr2.length; i++) {
            arr2[i] = arr1[i - arr.length];
        }
        // for printing
        System.out.println(Arrays.toString(arr2));

    }
}
