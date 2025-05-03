public class bruteForceApproach {
    public static boolean containsDuplicate(int arr[]) {
        if (arr == null || arr.length < 2) {
            return false;// no duplicates possible
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;// duplicates found
                }
            }
        }
        return false;// no duplicates found
    }

    public static void main(String ar[]) {
        int arr[] = { 1, 2, 3, 4, 1, 2, 3, 4 };
        System.out.println(containsDuplicate(arr));// true

    }
}