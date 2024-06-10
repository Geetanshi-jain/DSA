import java.util.*;

public class Ans5copyElm {

    public static void main(String[] args) {
        int arr[] = { 12, 2, 3, 1, 2 };

        int arr1[] = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr1));

    }

}
