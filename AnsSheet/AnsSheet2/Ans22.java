//22. Write a Java program to find all pairs of elements in an array whose sum is equal to specified no.

import java.util.Scanner;

public class Ans22 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 1, 4, 2, 56, 5, 98 };
        System.out.println("Array element are: ");
        System.out.println("enter no of sum : ");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + "   " + arr[j]);
                }
            }
        }
    }
}