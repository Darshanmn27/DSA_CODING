public class Optimal {

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void optimal(int arr[], int n, int k) {
        if (arr == null || n == 0 || k < 0) {
            System.out.println("invalid input");
            return;
        }
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // time complexity O(n)
    // space complexity O(1)
    public static void main(String[] args) {
        int arr[] = { 10, 13, 15, 27, 29, 23, 97 };
        int n = arr.length;
        int k = 4;
        optimal(arr, n, k);// 29 23 97 10 13 15 27

    }

}
