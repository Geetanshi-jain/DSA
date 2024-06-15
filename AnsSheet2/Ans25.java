import java.util.*;

public class Ans25 {
    public static void main(String[] args) {
        /*
         * Write a Java program to find common elements from three sorted (in
         * nondecreasing order) arrays.
         */
        int x = 0, y = 0, z = 0;
        int[] arr = { 1, 2, 3, 4, 3 };
        int[] arr1 = { 12, 3, 21, 4, 2 };
        int[] arr2 = { 1, 4, 2, 3, 3 };
        Arrays.sort(arr);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> al = new ArrayList<>();
        while (x < arr.length && y < arr1.length && z < arr2.length) {
            if (arr[x] == arr1[y] && arr1[y] == arr2[z]) {
                al.add(arr[x]);
                x++;
                y++;
                z++;
            } else if (arr[x] < arr1[y]) {
                x++;
            } else if (arr1[y] < arr2[z]) {
                y++;
            } else {
                z++;
            }
        }
        System.out.println(al);
    }
}
