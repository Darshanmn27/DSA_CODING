public class Better {

    public static void rotate(int arr[], int n, int k) {
        if (arr == null || n == 0 || k < 0) {
            System.out.println("Invalid input");
            return;
        }
        k = k % n;
        int temp[] = new int[n];
        System.arraycopy(arr, k, temp, 0, n - k);
        System.arraycopy(arr, 0, temp, n - k, k);

        for (int num : temp) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 27, 89, 37, 65 };
        int n = arr.length;
        int k = 3;
        rotate(arr, n, k);// 89 37 65 10 20 27

    }

}
