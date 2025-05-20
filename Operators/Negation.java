public class Negation {

    public static void not() {
        System.out.println("bitwise  compliment  operator");
        int a = 5;// 101==>010
        int b = 4;// 100==>011
        int c = -20;
        System.out.println(~a);// -6
        System.out.println(~b);// -5
        System.out.println(~c);// 19
        System.out.println(~(2027));// -2028
        System.out.println(~(48));// -49
        System.out.println(~(-2027));// 2026
        System.out.println(~(-147));// 146

    }

    public static void main(String[] args) {
        not();

    }

}
