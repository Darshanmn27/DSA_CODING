public  class Numbers 
{

    public  static  void  reverse_number()
    {
        int num=2027;
        int rev=0;
        while (num>0) 
        {
            int r= num%10;  // remainders 
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println("revers number is ");
        System.out.println(rev);//7202

    }


    public  static  void palindrome_number()
    {
        System.out.println("palindrome nu,mber checking given number :");
        int num=1221;
        int rev=0;
        int temp=num;
        while (num>0) 
        {
            int r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println("given number is palindrome number");
        }
        else
        {
            System.out.println("  not  a  palindrome number");
        }
    }

    public  static  boolean check_armstrong_number(int num)
    {
       // int num=377;
        int temp=num;
        int arm=0;
        int count=0;
        while (num>0) 
        {
            count++;
            num=num/10;
        }
        num=temp;
        while (num>0) 
        {
            int r= num%10;
            arm=arm+(int)Math.pow(r, count);
            num=num/10;
        }
        if(arm==temp)
        {
            return true;
        }
        else
        {
           return false;
        }
    }


    public  static  void rangeofarmstrongnumber()
    {
        System.out.println("range  of  a armstrong numbers are :");
        for(int i=1;i<=1000;i++)
        {
            if(check_armstrong_number(i))
            {
                System.out.print(i+" ");
            }
        }
    }

    public  static  void lcm_hcf()
    {
        int num1=12;
        int num2=18;
        int hcf=1;
        int lcm=0;
        for(int i=1;i<=num1&&i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                hcf=i;
            }
        }
        lcm=(num1*num2)/hcf;

        System.out.println("\n LCM is :");
        System.out.println(lcm);
        System.out.println("HCF is :");
        System.out.println(hcf);

    }

    public  static  void factorial()
    {
        int num=4;
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial  of  a  given  number is ");
        System.out.println(fact);
    }
    public static void main(String[] args) 
    {
        reverse_number();
        palindrome_number();
        check_armstrong_number(2027);
        rangeofarmstrongnumber();
        lcm_hcf();
        factorial();
        
    }

    
}