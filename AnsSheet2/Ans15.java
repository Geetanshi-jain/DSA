import java.util.*;

public class Ans15 {
    public static void main(String[] args) {
        int[] arr = { 12, 1, 23, 4, 2, 5, 2 };
        int arr1[] = { 12, 32, 3, 4, 2, 5, };
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (hs.contains(arr1[i])) {
                System.out.println(arr[i]);
            }
        }

    }
}
