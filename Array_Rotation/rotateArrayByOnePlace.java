public class rotateArrayByOnePlace {
    // left rotate the arry by one place
    public static void brute(int arr[], int n) {
        if (arr == null || n == 0) {
            System.out.println("Invalid input  array  is null  or empty.");
            return;
        }
        int temp[] = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];

        for (int num : temp) {
            System.out.print(num + " ");
        }
        // time complexity O(n)
        // space complexity O(n)
    }

    public static void optimal(int arr[], int n) {
        if (arr == null || n == 0) {
            System.out.println("Invalid input  array  is null  or empty.");
            return;
        }
        int temp = arr[0];
        System.out.println("\n optimal solution ");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // time complexity O(n)
        // space complexity O(1) no extra space is used
        arr[n - 1] = temp;
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 12, 27, 34 };
        int n = arr.length;
        brute(arr, n);// 20 12 27 34 10
        int arr2[] = { 29, 27, 23, 24, 25 };
        int n2 = arr2.length;
        optimal(arr2, n2);
        // 27 23 24 25 29
    }

}
