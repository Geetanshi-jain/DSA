import java.util.Arrays;

public class sortNumStr {
    public static void main(String[] args) {
        int[] numericArr = { 12, 2, 3, 2, 1, 43, 2 };
        Arrays.sort(numericArr);
        for (int elm : numericArr) {
            System.out.println(elm);
        }
        String[] str = { "manu", "khushu", "Geeet", "geeks" };
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        int sum = Arrays.stream(numericArr).sum();
        System.out.println(sum);
    }

}
