import java.util.HashMap;

public class Optimal {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 1, 1 };
        HashMap<Integer, Integer> hh = new HashMap<>(); // time complexity =O(n)
                                                        // space complexity =O(n)
        for (int num : arr) {
            hh.put(num, hh.getOrDefault(num, 0) + 1);
        }
        for (int key : hh.keySet()) {
            System.out.println(key + " occurs" + hh.get(key) + " times ");
        }

    }

}
