public class ternary {
    public static void CheckLeap(int year) {
        System.out.println("ternaryoperators");

        String r = ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "leap year" : "normal year"));//
        System.out.println(r);
    }

    public static void checkEvenOdd(int num) {

        String res = (num % 2 == 0 ? "Even number" : "Odd number");
        System.out.println(res);
    }

    public static void main(String[] args) {
        CheckLeap(2027);// normal year
        CheckLeap(2028);// leap year
        checkEvenOdd(2028);// Even number
        checkEvenOdd(2027);// Odd number

    }

}
