public class RemoveOuter {
    public static String remove(String str) {
        StringBuilder result = new StringBuilder();
        int opencount = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') {
                if (opencount > 0) {
                    result.append(c);
                }
                opencount++;
            } else {
                opencount--;
                if (opencount > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] darshan) {
        String input = "(()())(())";
        System.out.println(remove(input));// ()()()

    }

}