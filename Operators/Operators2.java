public class Operators2 {
    public static void unary() {
        System.out.println("unary operators");
        int a = 10;
        System.out.println((a++));// 10
        System.out.println(a);// 11
        System.out.println((++a));// 12
        System.out.println(a);// 12
        System.out.println((a--));// 12
        System.out.println(a);// 11
        System.out.println((--a));// 10
        System.out.println(a);// 10
    }

    public static void relational() {
        System.out.println("relational");
        int a = 20, b = 10;
        System.out.println(a == b);// false
        System.out.println(a > b);// true
        System.out.println(a >= b);// true
        System.out.println(a < b);// false
        System.out.println(a <= b);// false
        System.out.println(a != b);// true
    }

    public static void main(String[] args) {
        unary();
        relational();

    }

}
