public class optimalSingle {

    public static int singleNumber(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input  array  must  not  be  null or  empty ");
        }
        int ones = 0, twos = 0;
        for (int num : arr) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;

    }

    public static void main(String[] args) {
        int arr[] = { 20, 27, 23, 20, 23, 20, 23 };
        int res = singleNumber(arr);
        System.out.println(res);// 27

    }

}
