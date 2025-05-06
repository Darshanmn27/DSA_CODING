public class PrefixOptimal {
    public static int[] optimal(int arr[]) {

        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;

    }

    public static void main(String[] args) {
        int arr[] = { 9, -12, 34, 1, 23, 12 };
        arr = optimal(arr);

        if (arr == null || arr.length == 0) {
            System.out.println("empty or null  input array");
        } else {

            for (int num : arr) {
                System.out.print(num + " ");
            }

        }
    }

}
