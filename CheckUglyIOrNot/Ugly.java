public class Ugly {

    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        int factors[] = { 2, 3, 5 };
        for (int fact : factors) {
            while (num % fact == 0) {
                num = num / fact;
            }
        }
        return num == 1;

    }

    public static void main(String[] args) {

        System.out.println(isUgly(90));// true
        System.out.println(isUgly(45));// true
        System.out.println(isUgly(38));// false

    }

}
