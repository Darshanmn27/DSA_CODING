public class reverseApproach {

    public static void reverseUsingLoops(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Input string is null or empty");
            return;
        }
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res = res + str.charAt(i);
        }
        System.out.println(res);
    }

    public static void usingStringBuilder(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Input string is null or empty");
            return;
        }
        StringBuilder rev = new StringBuilder(str);
        System.out.println(rev.reverse().toString());

    }

    public static void main(String args[]) {
        reverseUsingLoops("darshan");// nahsrad
        usingStringBuilder("ZenShan");// nahSneZ

    }
}