import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class Question1 {
    public static void occursmorethen3() {
        String ss = "fear leads to anger anger leads to hatred hatred leads to conflict conflict leads to suffering";
        String words[] = ss.split(" ");
        HashMap<String, Integer> hh = new HashMap<>();
        for (String s : words) {
            hh.put(s, hh.getOrDefault(s, 0) + 1);
        }
        // System.out.println(hh);
        for (Map.Entry<String, Integer> aa : hh.entrySet()) {
            if (aa.getValue() >= 4) {
                System.out.print(aa.getKey() + " ");
            }

        }

    }

    public static void main(String[] args) {
        occursmorethen3();

    }

}
