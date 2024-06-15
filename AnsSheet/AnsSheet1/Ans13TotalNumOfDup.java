import java.util.Hashtable;

public class Ans13TotalNumOfDup {
    public static Hashtable<Integer, Integer> findUnique(int arr[]) {
        Hashtable<Integer, Integer> hs = new Hashtable<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i])) {
                count++;

            }
            hs.put(arr[i], arr[i]);

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
