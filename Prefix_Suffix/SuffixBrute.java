public class SuffixBrute {

    public static int[] computeSuffixBrute(int arr[]) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int n = arr.length;
        int suffix[] = new int[n];
        for (int i = 0; i < n; i++) {
            suffix[i] = 0;
            for (int j = i; j < n; j++) {
                suffix[i] = suffix[i] + arr[j];
            }
        }
        return suffix;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 4, 5, 6 };
        arr = computeSuffixBrute(arr);

        if (arr == null || arr.length == 0) {
            System.out.println("empty or null input array");
        } else {

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

    }

}
