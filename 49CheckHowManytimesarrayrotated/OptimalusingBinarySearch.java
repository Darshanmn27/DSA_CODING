public class OptimalusingBinarySearch {

    public static int findrotationcount(int nums[]) {
        int low = 0, high = nums.length - 1;
        while (low < high) {

            int mid = (low + high) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findrotationcount(arr));// 4

    }

}
