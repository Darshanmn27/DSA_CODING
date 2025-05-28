public class Brute {
    public static int findRotationCount(int nums[]) {
        int min = nums[0];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                index = i;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findRotationCount(arr));// 4

    }
}