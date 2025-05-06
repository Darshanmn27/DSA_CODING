public class PrefixBrute {

    public static int[] computeprefix(int arr[]) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int n = arr.length;

        int prefix[] = new int[n];
        for (int i = 0; i < n; i++) {
            prefix[i] = 0;
            for (int j = 0; j <= i; j++) {
                prefix[i] = prefix[i] + arr[j];
            }
        }
        return prefix;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 4, 5, 6 };
        arr = computeprefix(arr);
        if (arr == null || arr.length == 0) {
            System.out.println("empty or null  input array");
        } else {

            for (int num : arr) {
                System.out.print(num + " ");
            }

        }

    }
}