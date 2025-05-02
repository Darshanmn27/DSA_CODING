import java.util.*;

public class hashSet {
    public static void hash() {
        int arr[] = { 27, 1, 2, 3, 27, 1, 2, 3, 4, 99, 1, 233 };
        HashSet<Integer> hh = new HashSet<>();
        for (int num : arr) {
            hh.add(num);
        } // set doesnot allow duplicate values
        for (Integer num : hh) {
            System.out.print(num + " ");
        } // not following insertion order
          // 1 2 3 99 4 233 27
    }

    public static void hashing() {
        System.out.println("set  doesnot allowes dupliacte values ");
        HashSet<Object> aa = new HashSet<>();
        aa.add("darshan");
        aa.add(2027);
        aa.add(2027.27f);
        aa.add(true);
        aa.add('d');
        // set allowes to store heterogenious data
        for (Object a : aa) {
            System.out.print(a + " ");
        }
        // d darshan 2027.27 2027 true
    }

    public static void main(String args[]) {
        hash();
        hashing();

    }

}