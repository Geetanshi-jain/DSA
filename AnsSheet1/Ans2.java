public class Ans2 {
    public static void printNeg(int arr[], int n) {
        if (n == arr.length) {
            return;
        }
        if (arr[n] < 0) {
            System.out.println(arr[n]);
        }
        printNeg(arr, n + 1);
    }

    public static void main(String[] args) {
        printNeg(new int[] { 12, 2, 3, -4, -2 }, 0);

    }

}
