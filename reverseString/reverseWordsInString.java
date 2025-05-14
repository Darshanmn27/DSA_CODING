public class reverseWordsInString {

    public static String reverseWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return "";
        }
        String words[] = str.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("darshan good  morning"));// morning good darshan

    }

}
