import java.util.Arrays;

public class Ans29 {

    public static void main(String[] args) {

        int[] arr1 = { 2, 3, 5, 4, 2 };

        int allelmsum = Arrays.stream(arr1).sum();
        Arrays.sort(arr1);
        System.out.println((allelmsum - arr1[0] - arr1[arr1.length - 1]) / arr1.length);

    }

}
