import java.util.ArrayList;

public class MergeSortExample {
    public static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;

            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        // all the elements temporary array to array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);// left half
        mergeSort(arr, mid + 1, high);// right half
        merge(arr, low, mid, high);// merging sorted halves
    }

    public static void main(String darshan[]) {
        int arr[] = { 5, 4, 3, 2, 1, 9, 8, 7, 27, 18, 29, 34, 56, 57 };
        int n = arr.length;
        System.out.println("before  sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.println("after sorting ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // out put ==> 1 2 3 4 5 7 8 9 18 27 29 34 56 57
    }
}