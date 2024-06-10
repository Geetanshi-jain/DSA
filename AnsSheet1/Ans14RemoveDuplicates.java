import java.util.Hashtable;
import java.util.Map;

public class RemoveDuplicates {
    public static Hashtable<Integer, Integer> findUnique(int arr[]) {
        Hashtable<Integer, Integer> hs = new Hashtable<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
        }
        System.out.println(count);
        return hs;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 2, 1, 4, 3, 2 };
        Hashtable<Integer, Integer> hm = findUnique(arr);
        for (Integer val : hm.values()) {
            System.out.println(val);
        }
    }
}
