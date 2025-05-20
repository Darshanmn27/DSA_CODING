```java
import java.util.*;

public class basic 
{
    public static void arithmetic()
    {
        System.out.println("  arithmetic  operators :");
        int a=10,b=5;
        System.out.println(a+b);//15
        System.out.println(a-b);//5
        System.out.println(a*b);//50
        System.out.println(a/b);//2
        System.out.println(a%b);//0
    }
    public static void assignment()
    {
        System.out.println("assignment  operators :");
        int a=10;
        System.out.println(a=+80);//80
        System.out.println(a);//80
        System.out.println(a=-80);//-80
        System.out.println(a);//-80
        System.out.println(a*=80);//-6400
        System.out.println(a);//-6400
        System.out.println(a/=80);//-80
        System.out.println(a);//-80
        System.out.println(a%=80);//0
        System.out.println(a);//0


    }


    public static void unary()
    {
        System.out.println("unary operators");
        int a=10;
        System.out.println((a++));//10
        System.out.println(a);//11
        System.out.println((++a));//12
        System.out.println(a);//12
        System.out.println((a--));//12
        System.out.println(a);//11
        System.out.println((--a));//10
        System.out.println(a);//10
    
    }

    public static void relational()
    {
        System.out.println("relational");
        int a=20,b=10;
        System.out.println(a==b);//false
        System.out.println(a>b);//true
        System.out.println(a>=b);//true
        System.out.println(a<b);//false
        System.out.println(a<=b);//false
        System.out.println(a!=b);//true
    
    }

    public static  void logical()
    {
        int a=10,b=20;
        System.out.println("using  and  operation");
        System.out.println(a==b&&b>a);//false
        System.out.println(a>=b&&b>=a);//false
        System.out.println(a==b&&b>a);//false
        System.out.println(a<=b&&b==a);//false
        System.out.println(a==b&&b<=a);//false
        System.out.println("using  or operation");
        System.out.println(a==b||b>a);//true
        System.out.println(a>=b||b>=a);//true
        System.out.println(a==b||b>a);//true
        System.out.println(a<=b||b==a);//true
        System.out.println(a==b||b<=a);//false
        System.out.println("using  not operation");
        System.out.println(a==b!=b>a);//true
        System.out.println(a>=b!=b>=a);//true
        System.out.println(a==b!=b>a);//true
        System.out.println(a<=b!=(b==a));//true
        System.out.println(a==b!=b<=a);//false
    }

    public static void shift()
    {
        int a=10;
        System.out.println("shift left");
        System.out.println(a<<1);//20
        System.out.println(1<<1);//2
        System.out.println(2<<1);//4
        System.out.println(3<<4);//48
        System.out.println("shift right");
        System.out.println(a>>1);//5
        System.out.println(1>>1);//0
        System.out.println(2>>1);//1
        System.out.println(3>>4);//0

        
    }
    public static void ternary()
    {
        System.out.println("ternaryoperators");
        int year=2024;
        String r=((year%4==0&& year%100!=0 ||year%400==0?"leap year":"normal year"));//leap year
        System.out.println(r);
    }

    public static void and()
    {
        System.out.println("and  operator ");
        int a=5;//101
        int b=4;//100
        System.out.println(10&5);
        System.out.println((a&b));//    100
        System.out.println(5&7);//101  111
        System.out.println(10&2);//1010 ,0010

    }
    public static void or()
    {
        System.out.println("bitwise or  operator");
        int a=5;//101
        int b=4;//100
        System.out.println((a|b));// 101
        System.out.println(5|7);//101  111==>111
        System.out.println(10|2);//1010 ,0010==> 1010

    }
    public static void xor()
    {
        System.out.println("bitwise xor  operator");
        int a=5;//101
        int b=4;//100
        System.out.println((a^b));// 001
        System.out.println(5^7);//101  111==>010
        System.out.println(10^2);//1010 ,0010==> 1000

    }
    public static void not()
    {
        System.out.println("bitwise  compliment  operator");
        int a=5;//101==>010
        int b=4;//100==>011
        int c=-20;
        System.out.println(~a);//-6
        System.out.println(~b);//-5
        System.out.println(~c);//19

    }


    public static void main(String[] args) 
    {

        arithmetic();
        assignment();
        unary();
        relational();
        logical();
        shift();
        ternary();
        and();
        or();
        xor();
        not();
        
    }

    
}
```