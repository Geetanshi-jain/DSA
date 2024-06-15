import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;

public class Ans24 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 5, 6 };
        int n = array.length + 1;
        // totoal sum
        int sum = n * (n + 1) / 2;
        // sumarr
        int sumarr = 0;
        for (int elm : array) {
            sumarr += elm;
        }

        System.out.println("sum = " + sum);
        System.out.println("misssing no : " + (sum - sumarr));
    }

}
