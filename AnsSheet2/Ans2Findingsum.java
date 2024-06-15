import java.util.Arrays;

public class Ans2Findingsum {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5 };
        int sum = Arrays.stream(array).sum();
        int sum1 = 0;
        // Secand way
        for (int elm : array) {
            sum1 += elm;
        }
        System.out.println(sum1);
    }
}
