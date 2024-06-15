import java.util.HashSet;
import java.util.Set;

public class Ans13 {

    // .Write a Java program to find the duplicate values of an array of string
    // values.

    public static void findDuplicates(String[] arr) {
        Set<String> uniqueElements = new HashSet<>();
        Set<String> duplicateElements = new HashSet<>();

        for (String str : arr) {
            if (!uniqueElements.add(str)) { // If the element is already in the set, it's a duplicate
                duplicateElements.add(str);
            }
        }

        System.out.println(duplicateElements);
    }

    public static void main(String[] args) {
        String[] arr = { "Geet", "khushbu", "Geet", "subhi", "Geet", "khushbu" };
        findDuplicates(arr);
    }

}
