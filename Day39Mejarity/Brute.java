import java.util.*;

public class Brute {

    public static List<Integer> mejarityElement(int arr[]) {
        int n = arr.length;
        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int count = 0;
            // Avoid counting duplicates already in the list
            if (!ls.contains(arr[i])) {
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                    }
                }
                if (count > n / 3) {
                    ls.add(arr[i]);
                }
            }
        }

        return ls;

    }

    public static void main(String args[]) {
        int[] arr = { 1, 1, 1, 3, 3, 2, 2, 2 };
        System.out.println(mejarityElement(arr)); // Output: [1, 2]

    }
}