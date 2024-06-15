import java.util.*;

public class Ans9 {
    public static void main(String[] args) {
        // Write a Java program to insert an element (specific position) into an array.
        int arr[] = { 12, 1, 2, 3, 4, 5 };
        // using arryaList
        Scanner sc = new Scanner(System.in);
        System.out.println("enter position");
        int pos = sc.nextInt();
        System.out.println("Enter value");
        int val = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int e : arr) {
            al.add(e);
        }
        al.add(pos, val);
        System.out.println("array after insertion");
        System.out.println(al);

    }

}
