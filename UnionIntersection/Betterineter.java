import java.util.*;

public class Betterineter {

    public static List<Integer> Better(int arr1[], int arr2[]) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultset = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            if (set.contains(num)) {
                resultset.add(num);
            }
        }
        return new ArrayList<>(resultset);

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 4 };
        int[] arr2 = { 2, 2, 3, 5 };
        System.out.println("Better: " + Better(arr1, arr2));// [2, 3]

    }

}
