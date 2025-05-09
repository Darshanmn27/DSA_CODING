import java.util.Arrays;

public class Better {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 3 };
        Arrays.sort(arr);
        int n = arr.length; // time complexity ==> O(nlogn)--> due to sorting
        int i = 0; // space complexity ==>O(1) (if in place sorting )
        while (i < n) {
            int count = 1;
            while (i + 1 < n && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            System.out.println(arr[i] + " occurs " + count + " times");
            i++;

        }

    }

}
