import java.util.*;

public class ApproachUsingTreeSet {

    public static int[] TreesetApproach(int arr[]) {
        if (arr == null) {
            System.out.println("input array  is null");
            return null;
        }
        if (arr.length == 0) {
            System.out.println("array  is  empty");
            return new int[0];
        }
        // treeset to get unique elements in a sorted order
        Set<Integer> sorted = new TreeSet<>();
        for (int num : arr) {
            sorted.add(num);
        }

        // assign ranks using a hashmap

        Map<Integer, Integer> rank = new HashMap<>();
        int ran = 1;
        for (int num : sorted) {
            rank.put(num, ran++);
        }

        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rank.get(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 40, 10, 20, 30, 20 };
        arr = TreesetApproach(arr);
        System.out.println("  ranked  output ");
        for (int num : arr) {
            System.out.print(num + " ");
        } // 4 1 2 3 2

    }

}
