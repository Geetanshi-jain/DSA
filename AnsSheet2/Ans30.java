public class Ans30 {
    // Write a Java program to check if an array of integers without 0 and -1.
    public static void main(String[] args) {
        boolean b = false;
        int[] arr = { 1, 0, 5, -1, -4 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] == -1) {
                b = true;
            }
        }
        System.out.println(b);

    }

}
