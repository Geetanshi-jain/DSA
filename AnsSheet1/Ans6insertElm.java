public class Ans6insertElm {

    public static void main(String[] args) {
        int pos = 3;
        int elm = 200;
        int arr[] = { 1, 2, 3, 4, 5, 6, 6 };
        for (int i = arr.length - 1; i > pos - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = elm;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
