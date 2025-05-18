import java.util.ArrayList;

public class Brute {

    public static ArrayList<String> brutefilter(String str, char tar) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.trim().isEmpty()) {
            return res; // return empty list
        }
        String words[] = str.split(" ");
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (c == tar) {
                    res.add(word);
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String darhan[]) {
        String sentence = "darshan good morning today is special day for you";
        char a = 'a';
        System.out.println(brutefilter(sentence, a));// [darshan, today, special, day]

    }

}