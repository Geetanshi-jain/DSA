import java.util.*;
import java.lang.*;

public class Ans6Ans7 {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 43, 2, 32, 1 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr, n);
        // Ans 6 finding index
        System.out.println("Index = " + idx);
        // Ans 7
        Integer[] array = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer element : array) {
            arrayList.add(element);
        }

        arrayList.remove(Integer.valueOf(2));
        System.out.println("ArrayList after deleteing  2" + arrayList);

    }

}
