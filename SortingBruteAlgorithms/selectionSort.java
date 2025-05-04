public class selectionSort {
    public static void main(String darshan[]) {
        int arr[] = { 27, 1, 2, 3, 4, 1, 2, 3, 4 };
        if (arr == null || arr.length == 0) {
            System.out.println(" array  is null  or  empty nothing to sort.");
            return;
        }
        System.out.println("Before Sorting :");
        for (int num : arr) {
            System.out.print(num + " ");// 27 1 2 3 4 1 2 3 4
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int tem = arr[mini];
            arr[mini] = arr[i];
            arr[i] = tem;
        }
        System.out.println("after sorting :");
        for (int num : arr) {
            System.out.print(num + " ");// 1 1 2 2 3 3 4 4 27
        }

    }
}