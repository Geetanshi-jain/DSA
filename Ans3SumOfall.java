public class Ans3SumOfall {

    public static int returnSum(int[] arr, int n, int sum) {

        if (n == arr.length) {
            return sum;
        }
        sum += arr[n];
        return returnSum(arr, n + 1, sum);
    }

    public static void main(String[] args) {
        System.out.println(returnSum(new int[] { 1, 2, 3, 4, 5 }, 0, 0));
    }

}
