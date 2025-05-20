public class Operators {
    public static void arithmetic() {
        System.out.println("  arithmetic  operators :");
        int a = 10, b = 5;
        System.out.println(a + b);// 15
        System.out.println(a - b);// 5
        System.out.println(a * b);// 50
        System.out.println(a / b);// 2
        System.out.println(a % b);// 0
    }

    public static void assignment() {
        System.out.println("assignment  operators :");
        int a = 10;
        System.out.println(a = +80);// 80
        System.out.println(a);// 80
        System.out.println(a = -80);// -80
        System.out.println(a);// -80
        System.out.println(a *= 80);// -6400
        System.out.println(a);// -6400
        System.out.println(a /= 80);// -80
        System.out.println(a);// -80
    }

    public static void main(String[] args) {
        arithmetic();
        assignment();

    }
}