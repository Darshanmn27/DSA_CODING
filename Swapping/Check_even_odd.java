public class Check_even_odd 
{

    public  static  void using_if_else()
    {
        int num=20285;
        if(num%2==0)
        {
            System.out.println("even  number");
        }
        else
        {
            System.out.println("odd number");
        }
    }

    public  static  void using_ternory()
    {
        System.out.println("using  the ternory  operator :");
        int num=2027;
        String result = (num % 2 == 0) ? num + " is an Even number." : num + " is an Odd number.";
        System.out.println(result);

    }

    public  static  void usingbitwise()
    {
        int num=3037;
        if ((num & 1) == 0) 
        {
            System.out.println(num + " is an Even number.");
        }
        else 
        {
            System.out.println(num + " is an Odd number.");
        }
    }


    public static void main(String[] args) 
    {
        using_if_else();
        using_ternory();
        usingbitwise();
        
    }
    
}
