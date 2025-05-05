import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    public static void usingTemporaryArray() {
        int arr[] = { 10, 20, 30, 10, 27, 23 };
        int temp[] = new int[arr.length];
        if (arr == null || arr.length == 0) {
            return;

        }
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - i - 1];
        } // time complexity O(n) one pass through the array
          // space complexity O(n) extra space for temporary array
        for (int num : temp) {
            System.out.print(num + " ");// 23 27 10 30 20 10
        }

    }

    public static void usingTwoPointers() {
        int arr[] = { 10, 20, 12, 23, 34, 27 };
        System.out.println();
        System.out.println("reverse array  using two pointers ");
        if (arr == null || arr.length == 0) {
            return;

        }
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            // time complexity O(n)- half the swaps but still O(n)
            // space complexity O(1) no extra space used

        }

        for (int num : arr) {
            System.out.print(num + " ");// 27 34 23 12 20 10
        }
    }

    public static void reverseUsingCollections() {
        Integer arr[] = { 10, 20, 30, 40, 10, 20, 12, 12, 27 };
        if (arr == null || arr.length == 0) {
            return;

        }
        List<Integer> ll = Arrays.asList(arr);
        Collections.reverse(ll);
        System.out.println("\n reverse array  using  collections :");
        // time complexity O(n)
        // space complexity O(1) in place on the list works only Integer[] not int []
        for (int num : arr) {
            System.out.print(num + " ");// 27 12 12 20 10 40 30 20 10
        }
    }

    public static void reverseRecursion(int arr[], int start, int end) {
        if (arr == null || arr.length == 0) {
            return;

        }
        if (start >= end) {
            return;// space comlexity O(n) due to recursive stack calls
        } // time complexity O(n) – one recursive call per element

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseRecursion(arr, start + 1, end - 1);
    }

    public static void main(String darshan[]) {
        usingTemporaryArray();
        usingTwoPointers();
        reverseUsingCollections();
        int arr[] = { 23, 27, 25, 24, 22, 12, 13 };
        int start = 0, end = arr.length - 1;
        reverseRecursion(arr, start, end);
        System.out.println("reverse  array  using recursion ");
        for (int num : arr) {
            System.out.print(num + " ");// 13 12 22 24 25 27 23
        }
    }
}