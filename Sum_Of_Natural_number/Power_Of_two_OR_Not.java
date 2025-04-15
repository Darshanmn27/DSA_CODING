public class Power_Of_two_OR_Not 
{


    public  static   void brute()
    {

        int num=168;
        while (num%2==0)
        {
            num=num/2;
        }
        if(num==1)
        {
            System.out.println("power  of  two");
        }
        else
        {
            System.out.println("not  power  of  two");
        }

    }

    public   static  void optimal()
    {
        int  num=1024;
        if(((num&num-1)==0))
        {
            System.out.println("power  of  two ");
        }
        else
        {
            System.out.println("not  power of two ");
        }

    }

    public static void main(String[] args) 
    {
        brute();
        optimal();
        
    }
    
}
