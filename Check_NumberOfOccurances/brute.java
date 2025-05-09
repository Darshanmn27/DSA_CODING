public class brute {
    public static void main(String darshan[]) {
        int arr[] = { 1, 2, 3, 4, 5, 5, 12, 12, 90, 27 };
        int n = arr.length;
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) { // time complexity ==> O(n1)
                              // space complexity ==> O(n) due to the visited array
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + "  occurs " + count + " times");
        }

    }
}