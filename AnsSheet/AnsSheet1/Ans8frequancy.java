import java.util.HashMap;

public class Ans8frequancy {

    public static void main(String[] args) {
        int[] array = { 1, 2, 2, 3, 4, 4, 4, 5 }; // example array
        HashMap<Integer, Integer> frequencyMap = findFrequency(array);

        for (int key : frequencyMap.keySet()) {
            System.out.println("Element: " + key + ", Frequency: " + frequencyMap.get(key));
        }
    }

    public static HashMap<Integer, Integer> findFrequency(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }
}
