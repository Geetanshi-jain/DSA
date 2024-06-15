import java.util.*;

public class Ans27 {
    // . Write a Java program to find the number of even and odd integers in a given
    // array of integers.
    public static void main(String[] args) { //

        int[] arr = { 12, 2, 1, 32, 1, 32, 42, 1 };
        Scanner sc = new Scanner(System.in);
        int even = (int) Arrays.stream(arr).filter(num -> num % 2 == 0).count();
        System.out.println(even);
        // count odd
        System.out.println((int) Arrays.stream(arr).filter(num -> num % 2 != 0).count());

    }

}
