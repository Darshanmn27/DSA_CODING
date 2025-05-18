
import java.util.*;

public class usingMap {

    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int threshold = n / 3;

        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Add elements that appear more than n/3 times
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 27, 27, 27 };
        System.out.println(majorityElement(arr)); // Output: [1, 27]

    }

}
