import  java.util.*;
public  class Swap 
{
    public  static  void swapping_with_temp()
    {
        int num1=2027;
        int num2=2023;
        System.out.println("before swapping ");
        System.out.println("num1 :"+ num1+"\nnum2 :"+ num2);
        int temp=num1;//2027
        num1=num2;//2023
        num2=temp;//2027   
        System.out.println("after swapping ");
        System.out.println("num1 :"+ num1+"\nnum2 :"+ num2);//  num1=2023 num2=2027
    }

    public  static  void swap_without_using_temp()
    {
        System.out.println("swap  without  using the  temp(extra) variable ");
        int num1=27;
        int num2=23;
        System.out.println("before swapping ");
        System.out.println("num1 :"+ num1+"\nnum2 :"+ num2);
        num1=num1+num2;//num1=50
        num2=num1-num2;//num2=50-23==>27
        num1=num1-num2;//num1=50-27==>23 
        System.out.println("after swapping ");
        System.out.println("num1 :"+ num1+"\nnum2 :"+ num2);//  num1=23 num2=27

    }
    public  static  void swap_using_xor()
    {
        System.out.println("swap  without  using the   xor bitwise operator  ");
        int num1=27;
        int num2=23;
        System.out.println("before swapping ");
        System.out.println("num1 :"+ num1+"\nnum2 :"+ num2);
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("after swapping ");
        System.out.println("num1 :"+ num1+"\nnum2 :"+ num2);//  num1=23 num2=27

    }


    public static void main(String[] args) 
    {
        swapping_with_temp();
        swap_without_using_temp();
        swap_using_xor();
        
    }

    
}