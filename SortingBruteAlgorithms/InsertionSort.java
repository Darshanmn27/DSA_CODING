public class InsertionSort {
    public static void main(String[] darshan) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        if (arr == null || arr.length == 0) {
            System.out.println(" array  is null  or  empty nothing to sort.");
            return;
        }

        System.out.println("before sorting ");
        for (int num : arr) {
            System.out.print(num + " ");// 13 46 24 52 20 9
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println("after sorting ");
        for (int num : arr) {
            System.out.print(num + " ");// 9 13 20 24 46 52
        }

    }

}
