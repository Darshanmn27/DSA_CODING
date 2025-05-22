public class Brute {

    public static int bruteSearch(int arr[], int tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String darshan[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 0;
        int ans = bruteSearch(arr, target);
        System.out.println(ans);
        /*
         * time complexity ==> O(n)
         * space complexity ==> O(1)
         * 
         */

    }
}