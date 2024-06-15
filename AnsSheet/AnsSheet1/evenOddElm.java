import java.util.Arrays;

public class evenOddElm {
    public static void main(String[] args) {
        int[] arr = { 12, 1, 3, 2, 4, 1, 7 };
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] evenarr = new int[even];
        int[] oddarr = new int[odd];
        int j = 0, k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenarr[j] = arr[i];
                j++;
            } else {
                oddarr[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(evenarr));
        System.out.println(Arrays.toString(oddarr));
    }

}
