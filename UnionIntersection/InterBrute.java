import java.util.*;

public class InterBrute {

    public static List<Integer> brute(int arr1[], int arr2[]) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                continue;
            }
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result.add(arr1[i]);
                    break;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 2, 3, 4 };
        int arr2[] = { 2, 2, 3, 5 };
        System.out.println(brute(arr1, arr2));// [2, 3]
    }
}