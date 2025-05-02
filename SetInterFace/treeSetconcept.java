import java.util.*;

public class treeSetconcept {
    public static void case1() {
        int arr[] = { 1, 2, 3, 4, 5, 27, 12, 3, 4, 5, 27 };
        TreeSet<Integer> tt = new TreeSet<>();
        for (int num : arr) {
            tt.add(num);
        }
        for (Integer aa : tt) {
            System.out.print(aa + " ");
        }
    }

    public static void case3() {
        /*
         * TreeSet<Object> aa = new TreeSet<>();
         * aa.add("darshan");
         * aa.add(2027);
         * aa.add(true);
         * aa.add(false);
         * aa.add(917172);
         * aa.add(92832.77f);
         * 
         * for (Object val : aa) {
         * System.out.print(val + " ");
         * }
         * / at treeSetconcept.case3(treeSetconcept.java:18) error occur
         * // treeset doesnot allow heterogenious data
         */
    }

    public static void main(String[] args) {
        case1();// 1 2 3 4 5 12 27 sorted order
        // insertion order is not maintained
        case3();

    }

}
