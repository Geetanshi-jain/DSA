import java.util.Arrays;

public class Ans18Search {
    public static void main(String[] args) {
        int[] arr = { 12, 1, 2, 1, 4, 232 };
        Arrays.sort(arr);
        System.out.println(arr.toString());
        System.out.println(Arrays.binarySearch(arr, 1));
    }// nlogn

}
