import java.util.*;

public class unionBetter {

    public static List<Integer> Better(int arr1[], int arr2[]) {
        Set<Integer> set = new TreeSet();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 4 };
        int arr2[] = { 2, 3, 5, 6 };
        System.out.println(Better(arr1, arr2));// [1, 2, 3, 4, 5, 6]

    }

}
