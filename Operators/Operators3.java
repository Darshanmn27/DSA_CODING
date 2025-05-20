public class Operators3 {
    public static void logical() {
        int a = 10, b = 20;
        System.out.println("using  and  operation");
        System.out.println(a == b && b > a);// false
        System.out.println(a >= b && b >= a);// false
        System.out.println(a == b && b > a);// false
        System.out.println(a <= b && b == a);// false
        System.out.println(a == b && b <= a);// false
        System.out.println("using  or operation");
        System.out.println(a == b || b > a);// true
        System.out.println(a >= b || b >= a);// true
        System.out.println(a == b || b > a);// true
        System.out.println(a <= b || b == a);// true
        System.out.println(a == b || b <= a);// false
        System.out.println("using  not operation");
        System.out.println(a == b != b > a);// true
        System.out.println(a >= b != b >= a);// true
        System.out.println(a == b != b > a);// true
        System.out.println(a <= b != (b == a));// true
        System.out.println(a == b != b <= a);// false
    }

    public static void shift() {
        int a = 10;
        System.out.println("shift left");
        System.out.println(a << 1);// 20
        System.out.println(1 << 1);// 2
        System.out.println(2 << 1);// 4
        System.out.println(3 << 4);// 48
        System.out.println("shift right");
        System.out.println(a >> 1);// 5
        System.out.println(1 >> 1);// 0
        System.out.println(2 >> 1);// 1
        System.out.println(3 >> 4);// 0

    }

    public static void main(String[] args) {
        logical();
        shift();

    }

}
