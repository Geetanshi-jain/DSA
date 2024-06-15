public class Ans7DeleteElm {

    public static void main(String[] args) {
        int arr[] = { 12, 2, 1, 4, 6, 5 };
        int del = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (del == arr[i]) {
                for (int j = i; j < arr.length - 1; j++)
                    arr[j] = arr[j + 1];
            }
        }
        for (int e : arr) {
            System.out.println(e);
        }
    }

}
