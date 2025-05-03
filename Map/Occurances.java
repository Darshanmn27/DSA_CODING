import java.util.*;

public class Occurances {

    public static void numbers() {
        int arr[] = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 65 };
        HashMap<Integer, Integer> hh = new HashMap<>();
        for (int num : arr) {
            if (hh.containsKey(num)) {
                hh.put(num, hh.get(num) + 1);
            } else {
                hh.put(num, 1);
            }
        }
        // {1=2, 65=1, 2=2, 3=2, 4=2, 5=2}
        System.out.println(hh);
    }

    public static void characterArray() {
        String ss = "darshan";
        char arr[] = ss.toCharArray();
        HashMap<Character, Integer> hh = new HashMap<>();
        // expected output {a=2, r=1, s=1, d=1, h=1, n=1}
        for (char ch : arr) {
            if (hh.containsKey(ch)) {

                hh.put(ch, hh.get(ch) + 1);
            } else {
                hh.put(ch, 1);
            }
        }
        System.out.println(hh);
    }

    public static void numbers2() {
        int arr[] = { 10, 20, 30, 40, 10, 20, 30, 40 };
        HashMap<Integer, Integer> hh = new HashMap<>();
        for (int num : arr) {
            hh.put(num, hh.getOrDefault(num, 0) + 1);
        }
        System.out.println(hh);
        // {20=2, 40=2, 10=2, 30=2}
    }

    public static void characters() {
        String ss = "darshan";
        char arr[] = ss.toCharArray();
        HashMap<Character, Integer> hh = new HashMap<>();
        for (char ch : arr) {
            hh.put(ch, hh.getOrDefault(ch, 0) + 1);
        }
        // {a=2, r=1, s=1, d=1, h=1, n=1}
        System.out.println(hh);
    }

    public static void main(String args[]) {
        numbers();
        characterArray();

        numbers2();
        characters();

    }

}
