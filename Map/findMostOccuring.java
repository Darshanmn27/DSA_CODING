import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;;

public class findMostOccuring {
    public static void findmostoccuring() {
        String ss = "fear leads to anger anger leads to hatred hatred leads to conflict conflict leads to suffering to to darshan darshan darshan";
        String words[] = ss.split(" ");
        HashMap<String, Integer> hh = new HashMap<>();
        for (String word : words) {
            hh.put(word, hh.getOrDefault(word, 0) + 1);
        }
        int max = 0;
        for (int count : hh.values()) {
            if (count > max) {
                max = count;
            }
        }

        System.out.println("most occuring words:");
        for (Map.Entry<String, Integer> e : hh.entrySet()) {
            if (e.getValue() == max) {
                System.out.println(e.getKey());
            }
        }
    }

    public static void main(String[] args) {
        findmostoccuring();

    }

}
