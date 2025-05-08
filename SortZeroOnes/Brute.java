import java.util.Arrays;

public class Brute {

    public static void main(String[] args) {

        int arr[] = { 1, 0, 0, 1, 2, 0, 0, 2, 1, 0, 2 };
        if (arr == null || arr.length == 0) {
            System.out.print("Array  is  null  or  empty.");
            return;
        }
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}