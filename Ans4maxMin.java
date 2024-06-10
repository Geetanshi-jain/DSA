import java.util.*;

public class Ans4maxMin {
    public static int max(int[] arr, int n, int mx) {

        if (n == arr.length) {
            return mx;
        }
        mx = Math.max(arr[n], mx);
        return max(arr, n + 1, mx);
    }

    public static int min(int[] arr, int n, int mn) {
        if (n == arr.length) {
            return mn;
        }
        mn = Math.min(arr[n], mn);
        return min(arr, n + 1, mn);
    }
    // using Stream

    public static void main(String[] args) {
        System.out.println(max(new int[] { 1, 2, 4, 30, 2, 1 }, 0, 0));
        int[] arr = { 2, 3, 2, 1, 1, 4 };
        System.out.println(min(arr, 0, arr[0]));
        // by using java streams
        System.out.println(Arrays.stream(arr).min().getAsInt());
    }

}
