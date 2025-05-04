public class MANIPULATION {

    public static void simpleMethods() {
        String s1 = new String("DARshan");
        System.out.println(s1.length());// 7
        System.out.println(s1.toLowerCase());// darshan
        System.out.println(s1.toUpperCase());// DARSHAN
        System.out.println(s1.charAt(4));// h
        System.out.println(s1.codePointAt(0));// 68 unicode value of D
        System.out.println(s1.codePointAt(1));// 65 unicode value of A
        System.out.println(s1.indexOf('A'));// 1
        System.out.println(s1.lastIndexOf('a'));// 5
        System.out.println(s1.contains("arshan"));// false
    }

    public static void manipulate() {
        System.out.println("  string manipulation");
        String s = "darshan GOOD Morning";
        System.out.println(s.indexOf('a'));// 1
        System.out.println(s.lastIndexOf('a'));// 5
        System.out.println(s.contains("Morning"));// true
        System.out.println(s.contains("good"));// false
        System.out.println(s.isEmpty());// false
        String str = new String("");
        System.out.println(str.isEmpty());// true
        System.out.println(s.endsWith("Morning"));// true
        System.out.println(s.startsWith("darshan"));// true
        System.out.println(s.substring(5));// an GOOD Morning
    }

    public static void manipulate3() {
        System.out.println("string manipulation ");
        String s = new String("darshan good morning");
        System.out.println(s.substring(13));// morning
        System.out.println(s.substring(8, 12));// good
    }

    public static void manipulate4() {
        String s = new String("JAVA,PYTHON,SWIFT");
        System.out.println("hello darshan good  morning ");
        String arr[] = s.split(",");
        for (String aa : arr) {// JAVA PYTHON SWIFT
            System.out.print(aa + " ");
        }
    }

    public static void manipulation() {
        System.out.println("string manipulation ");
        String s = new String("darshan");
        char arr[] = s.toCharArray();
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        // d a r s h a n
        System.out.println();
        System.out.println(arr[0]);// d

    }

    public static void main(String args[]) {
        simpleMethods();
        manipulate();
        manipulate3();
        manipulate4();
        manipulation();

    }
}