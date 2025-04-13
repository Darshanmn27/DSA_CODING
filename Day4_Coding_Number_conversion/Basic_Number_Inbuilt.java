import   java.util.*;
public  class Basic_Number_Inbuilt
{


    public  static   void decimal_to_binary()
    {
        int num=10;
        String res=Integer.toBinaryString(num);
        System.out.println("decimal  to  binary  number  conversion  using  the inbuilt  method :");
        System.out.println(res);//1010
    }
    public  static   void decimal_to_octa()
    {
        int num=10;
        String res=Integer.toOctalString(num);
        System.out.println("decimal  to  octa   number  conversion  using  the inbuilt  method :");
        System.out.println(res);//12
    }
    public  static   void decimal_to_hexa()
    {
        int num=10;
        String res=Integer.toHexString(num);
        System.out.println("decimal  to  hexa  number  conversion  using  the inbuilt  method :");
        System.out.println(res);//a
    }


    public   static   void binary_to_decimal()
    {
        String bin="1010";
        int dec=Integer.parseInt(bin, 2);
        System.out.println("Binary  to  decimal  number  conversion  is :");
        System.out.println(dec);//10
    }
    public   static   void Octal_decimal()
    {
        String octa="15";
        int dec=Integer.parseInt(octa, 8);
        System.out.println("octal   to  decimal  number  conversion  is :");
        System.out.println(dec);//13
    }

    public  static  void Hexato_decimal()
    {
        String hexa="A";
        int dec=Integer.parseInt(hexa,16);
        System.out.println("conversion from hexadecimal  to decimal :");
        System.out.println(dec);//10
    }


    public  static  void using_prefix_variable()
    {
        System.out.println("without  any prefix it  shows  the given number is decimal  number");
        System.out.println(918171);//given digit 
        int a=0x91;
        System.out.println("if prefix is 0x then number is hexa to integer");
        System.out.println(a);//145
        int num=0b1010;
        System.out.println("if  the  given  number prefix  is ob then we  can  call  as  the binary   to  integer");
        System.out.println(num);//10
        int    n=071;
        System.out.println("if  the  given  number prefix  is 0  then  we can call  as  the octal number ");
        System.out.println(n);//57

    }


    public static void main(String[] args) 
    {
        decimal_to_binary();
        decimal_to_octa();
        decimal_to_hexa();
        binary_to_decimal();
        Octal_decimal();
        Hexato_decimal();
        using_prefix_variable();

        
    }

    
}