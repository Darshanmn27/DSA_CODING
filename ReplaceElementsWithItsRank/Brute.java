import java.util.*;

public class Brute {

    public static int[] replaceitsRankBrute(int arr[]) {
        if (arr == null) {
            System.out.println("input  array  is null.");
            return null;
        }
        if (arr.length == 0) {
            System.out.println("array  is  empty");
            return new int[0];
        }

        // extract unique elements using hashset
        Set<Integer> unique = new HashSet<>();
        for (int num : arr) {
            unique.add(num);
        }
        // convert hashset to list and sort it
        List<Integer> sorted = new ArrayList<>(unique);
        Collections.sort(sorted);
        // assign ranks using a hashmap
        Map<Integer, Integer> hh = new HashMap<>();
        int rank = 1;
        for (int num : sorted) {
            hh.put(num, rank++);
        }

        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = hh.get(arr[i]);
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = { 40, 10, 20, 30, 20 };
        arr = replaceitsRankBrute(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // out put ==> 4 1 2 3 2

    }
}