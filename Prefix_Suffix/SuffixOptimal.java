public class SuffixOptimal {

    public static int[] sufixopti(int arr[]) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int n = arr.length;
        int suffix[] = new int[n];
        suffix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + arr[i];
        }
        return suffix;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 4, 5, 6 };
        arr = sufixopti(arr);
        if (arr == null || arr.length == 0) {
            System.out.println("empty or null input array");
        } else {

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

}
