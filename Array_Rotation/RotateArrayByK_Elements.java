public class RotateArrayByK_Elements {
    public static void Brute(int arr[], int n, int k) {
        if (arr == null || n == 0 || k < 0) {
            System.out.println("Invalid input ");
            return;
        }
        k = k % n; // handle k>n
        int temp[] = new int[n];
        int index = 0;
        for (int i = k; i < n; i++) {
            temp[index++] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            temp[index++] = arr[i];
        }

        for (int num : temp) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 27, 26 };
        int n = arr.length;
        int k = 3;
        Brute(arr, n, k);

    }

}
