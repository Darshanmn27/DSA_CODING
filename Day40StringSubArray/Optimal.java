import java.util.ArrayList;
import java.util.List;

public class Optimal {

    public static List<String> filterwords(String str, char tar) {
        List<String> result = new ArrayList<>();
        if (str == null || str.trim().isEmpty()) {
            return result; // return empty list
        }
        String words[] = str.split(" ");
        for (String word : words) {
            if (word.indexOf(tar) != -1) {
                result.add(word);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String sentence = "darshan good morning today is special day for you";
        char a = 'a';
        System.out.println(filterwords(sentence, a));// [darshan, today, special, day]

    }

}
