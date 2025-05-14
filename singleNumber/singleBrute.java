import java.util.HashMap;
import java.util.Map;

public class singleBrute {

    public static int singleNumber(int arr[]) {
        if (arr == null || arr.length == 0) {
            System.out.println("array is null or length is 0");
            return -1;
        }
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }
        System.out.println("element  not  found ");
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 23, 2027, 2027, 2027, 23, 27, 12, 12, 12 };
        int res = singleNumber(arr);
        System.out.println(res);// 27

    }
}