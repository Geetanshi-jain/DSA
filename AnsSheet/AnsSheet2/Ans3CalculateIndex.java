import java.util.Arrays;

import javax.xml.transform.Source;

public class Ans3CalculateIndex {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,2};
        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr,2);
        System.out.println(idx);

    }
    
}
