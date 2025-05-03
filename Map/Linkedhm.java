import java.util.*;

public class Linkedhm {

    public static void numberoccurances() {
        int arr[] = { 1, 2, 3, 4, 5, 5, 6, 5, 6 };
        LinkedHashMap<Integer, Integer> lh = new LinkedHashMap<>();
        for (int num : arr) {
            lh.put(num, lh.getOrDefault(num, 0) + 1);
        }
        System.out.println(lh);
        // {1=1, 2=1, 3=1, 4=1, 5=3, 6=2}

    }

    public static void character() {
        String s = "darshangoodmorning";
        char arr[] = s.toCharArray();
        LinkedHashMap<Character, Integer> lhp = new LinkedHashMap<>();
        for (char ch : arr) {
            lhp.put(ch, lhp.getOrDefault(ch, 0) + 1);
        }
        System.out.println(lhp);
    }
    // {d=2, a=2, r=2, s=1, h=1, n=3, g=2, o=3, m=1, i=1}

    public static void main(String[] args) {
        numberoccurances();
        character();

    }

}
