import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class unionBrute {

    public static List<Integer> union(int arr1[], int arr2[]) {
        List<Integer> ll = new ArrayList<>();
        for (int num : arr1) {
            ll.add(num);
        }
        for (int num : arr2) {
            ll.add(num);
        }
        Set<Integer> set = new HashSet<>(ll);
        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 4 };
        int arr2[] = { 2, 3, 5, 6 };
        System.out.println(union(arr1, arr2));// [1, 2, 3, 4, 5, 6]
    }

}
