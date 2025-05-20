public class BitwiseOperators {
    public static void and() {
        System.out.println("and  operator ");
        int a = 5;// 101
        int b = 4;// 100
        System.out.println(10 & 5);// 0
        System.out.println((a & b));// 4
        System.out.println(5 & 7);// 5
        System.out.println(10 & 2);// 2

    }

    public static void or() {
        System.out.println("bitwise or  operator");
        int a = 5;// 101
        int b = 4;// 100
        System.out.println((a | b));// 101 ==>5
        System.out.println(5 | 7);// 101 111==>111==>7
        System.out.println(10 | 2);// 1010 ,0010==> 1010==> 10

    }

    public static void xor() {
        System.out.println("bitwise xor  operator");
        int a = 5;// 101
        int b = 4;// 100
        System.out.println((a ^ b));// 001 ==>1
        System.out.println(5 ^ 7);// 101 111==>010==>2
        System.out.println(10 ^ 2);// 1010 ,0010==> 1000==>8

    }

    public static void main(String[] args) {
        and();
        or();
        xor();

    }

}
