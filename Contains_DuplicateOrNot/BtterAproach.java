import java.util.HashSet;

public class BtterAproach {
    public static boolean containsDuplicate(int arr[]) {
        if (arr == null || arr.length < 2) {
            return false;// no duplicates possible
        }
        HashSet<Integer> hh = new HashSet<>();
        for (int num : arr) {
            if (!hh.add(num)) {
                return true;// duplicates found
            }
        }
        return false;// no duplicates found
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 3, 4 };
        System.out.println(containsDuplicate(arr));// true

    }

}
