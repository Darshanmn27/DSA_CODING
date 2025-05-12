public class UglyNumber {

    public static boolean isUglyNumber(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 30;
        System.out.println(isUglyNumber(num1));// true
        System.out.println(isUglyNumber(num2));// true
        System.out.println(isUglyNumber(28));// false

    }
}