public class bubbleSort {
    public static void main(String[] darshan) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        if (arr == null || arr.length == 0) {
            System.out.println(" array  is null  or  empty nothing to sort.");
            return;
        }
        System.out.println("before sorting :");
        for (int num : arr) {
            System.out.print(num + " ");// 13 46 24 52 20 9
        }
        System.out.println();
        for (int i = arr.length - 1; i > 0; i--) {
            boolean isSwapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        System.out.println("after sorting ");
        for (int num : arr) {
            System.out.print(num + " ");// 9 13 20 24 46 52
        }

    }

}