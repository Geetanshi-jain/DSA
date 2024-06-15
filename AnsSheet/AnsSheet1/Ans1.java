public class Ans1 {
    public static void recursiveprinting(int[] arr, int n) {
        if (n == arr.length) {
            return;
        }
        if (arr[n] < 0) {
            System.out.println(arr[n]);
        }
        recursiveprinting(arr, n + 1);
    }

    public static void main(String[] args) {
        recursiveprinting(new int[] { 12, -2, 3, -4, -5, 6 }, 0);
    }
}