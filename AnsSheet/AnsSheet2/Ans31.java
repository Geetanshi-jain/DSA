public class Ans31 {
    /*
     * Write a Java program to check if the sum of all the 10's in the array is
     * exactly 30. Return false if the condition does not satisfy, otherwise true.
     */
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 4, 5, 10, 10, 10 };
        int sum = 30;
        int s = 0;
        int num = 10;
        for (int i : arr) {
            if (i == 10) {
                s += i;
            }
            if (s == sum) {
                System.out.println("true");
            }
        }
    }
}
