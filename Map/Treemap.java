import java.util.TreeMap;

public class Treemap {
    public static void numbers() {
        int arr[] = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 65 };
        TreeMap<Integer, Integer> hh = new TreeMap<>();
        for (int num : arr) {
            if (hh.containsKey(num)) {
                hh.put(num, hh.get(num) + 1);
            } else {
                hh.put(num, 1);
            }
        }
        // {1=2, 2=2, 3=2, 4=2, 5=2, 65=1}
        System.out.println(hh);
    }

    public static void characterArray() {
        String ss = "darshan";
        char arr[] = ss.toCharArray();
        TreeMap<Character, Integer> hh = new TreeMap<>();
        for (char ch : arr) {
            if (hh.containsKey(ch)) {

                hh.put(ch, hh.get(ch) + 1);
            } else {
                hh.put(ch, 1);
            }
            // {a=2, d=1, h=1, n=1, r=1, s=1}
        }
        System.out.println(hh);
    }

    public static void numbers2() {
        int arr[] = { 10, 20, 30, 40, 10, 20, 30, 40 };
        TreeMap<Integer, Integer> hh = new TreeMap<>();
        for (int num : arr) {
            hh.put(num, hh.getOrDefault(num, 0) + 1);
        }
        System.out.println(hh);
        // {10=2, 20=2, 30=2, 40=2}
    }

    public static void characters() {
        String ss = "darshan";
        char arr[] = ss.toCharArray();
        TreeMap<Character, Integer> hh = new TreeMap<>();
        for (char ch : arr) {
            hh.put(ch, hh.getOrDefault(ch, 0) + 1);
        }
        // {a=2, d=1, h=1, n=1, r=1, s=1}
        System.out.println(hh);
    }

    public static void main(String args[]) {
        numbers();
        characterArray();

        numbers2();
        characters();

    }

}
