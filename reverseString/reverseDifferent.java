public class reverseDifferent {

    public static void reverseUsingCharacterArray(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Input string is null or empty");
            return;
        }
        char arr[] = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static String usingRecursion(String str) {

        if (str == null || str.length() <= 1) {
            return str;
        }
        return usingRecursion(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {
        reverseUsingCharacterArray("ZenState");// etatSneZ
        System.out.println("using recursion ");
        System.out.println(usingRecursion("reality"));// ytilaer
    }

}
