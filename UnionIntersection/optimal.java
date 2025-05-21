import java.util.ArrayList;
import java.util.List;

public class optimal {
    public static List<Integer> union(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;

        while (i < n && j < m) {
            int val1 = arr1[i];
            int val2 = arr2[j];

            if (val1 < val2) {
                if (result.isEmpty() || result.get(result.size() - 1) != val1)
                    result.add(val1);
                i++;
            } else if (val1 > val2) {
                if (result.isEmpty() || result.get(result.size() - 1) != val2)
                    result.add(val2);
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != val1)
                    result.add(val1);
                i++;
                j++;
            }
        }

        while (i < n) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                result.add(arr1[i]);
            i++;
        }

        while (j < m) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j])
                result.add(arr2[j]);
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 4 };
        int[] arr2 = { 2, 3, 5, 6 };

        List<Integer> unionResult = union(arr1, arr2);
        System.out.println("Optimal Union: " + unionResult);// Optimal Union: [1, 2, 3, 4, 5, 6]
    }
}
