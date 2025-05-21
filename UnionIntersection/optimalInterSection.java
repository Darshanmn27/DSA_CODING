import java.util.*;

public class optimalInterSection {

    public static List<Integer> optimal(int arr1[], int arr2[]) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;
        while (i < n && j < m) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 4 };
        int[] arr2 = { 2, 2, 3, 5 };
        System.out.println("Optimal: " + optimal(arr1, arr2));// Optimal: [2, 3]

    }

}
