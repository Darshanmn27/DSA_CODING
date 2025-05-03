import java.util.Arrays;

public class optimalApproach {
    public static boolean containsDuplicate(int arr[]) {
        if (arr == null || arr.length < 2) {
            return false;// no duplicates possible
        }
        Arrays.sort(arr);// time O(n log n)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;// duplicate found
            }
        }
        return false;// no duplicates found

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 3, 4, 5 };
        System.out.println(containsDuplicate(arr));// true

    }

}
