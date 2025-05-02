import java.util.LinkedHashSet;

public class linkedHashSet {
    // insertion order is maintained
    // duplicates are not allowed allowes heterogenious data
    public static void case1() {
        int arr[] = { 10, 20, 1, 12, 23, 33, 1, 2027, 1947 };
        LinkedHashSet<Integer> ll = new LinkedHashSet<>();
        for (int num : arr) {
            ll.add(num);
        }
        for (Integer aa : ll) {
            System.out.print(aa + " ");
        }
    }

    public static void case2() {
        System.out.println("linkedhashset allowes heterogenious data ");
        LinkedHashSet<Object> ll = new LinkedHashSet<>();
        ll.add("darshan");
        ll.add(2027);
        ll.add("darshan");
        ll.add(2027.27f);
        ll.add(true);
        ll.add(false);
        ll.add(true);
        for (Object aa : ll) {
            System.out.print(aa + " ");
        }
    }

    public static void main(String[] args) {
        case1();
        // 10 20 1 12 23 33 2027 1947
        case2();
        // darshan 2027 2027.27 true false

    }

}
