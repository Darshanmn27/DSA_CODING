public class stringManipulate2 {
    public static void case3() {
        String s1 = new String("DARSHAN");
        String s2 = new String("DARSHAN");
        if (s1 == s2) {
            System.out.println("references are equal");
        } else {
            System.out.println("references are not equal");
        }
        if (s1.equals(s2)) {
            System.out.println("values are equal");
        } else {
            System.out.println("values are not equal ");
        }
    }

    public static void case4() {
        String s1 = "DARSHAN";
        String s2 = "darshan";
        if (s1 == s2) {
            System.out.println("references are equal");
        } else {
            System.out.println("references are not equal");
        }

        if (s1.equals(s2)) {
            System.out.println("values are equal");
        } else {
            System.out.println("values are not equal");
        }
    }

    public static void main(String[] args) {
        case3();
        // references are not equal
        // values are equal
        case4();
        // references are not equal
        // values are not equal
    }

}
