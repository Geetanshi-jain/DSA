import java.util.HashSet;

import javax.sound.sampled.SourceDataLine;

public class Ans16 {

    public static void main(String[] args) {
        int[] arr = { 12, 3, 2, 4, 1, 2, 2, 3 };
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }

        for (int elm : s) {
            System.out.println(elm);
        }
    }

}
