public class stringManipulation {
    public static void case1() {
        String s1 = "JAVA";
        String s2 = "JAVA";
        if (s1 == s2) {
            System.out.println("references are equal");
        } else {
            System.out.println("referneces  are not  equal ");
        }
    }

    public static void case2() {
        String s1 = "DARSHAN";
        String s2 = new String("DARSHAN");
        if (s1 == s2) {
            System.out.println("references are equal");
        } else {
            System.out.println("referneces  are not  equal ");
        }

        if (s1.equals(s2)) {
            System.out.println("values are equal");
        } else {
            System.out.println("values are not  equal ");
        }
    }

    public static void main(String[] args) {
        case1();// references are equal
        case2();// referneces are not equal
        // values are equal

    }
}
