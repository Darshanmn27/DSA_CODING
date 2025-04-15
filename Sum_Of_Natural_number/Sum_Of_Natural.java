import  java.util.*;
public class Sum_Of_Natural
{

    public  static  void  brute_force()
    {
        int num=5;
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("total  sum is :");
        System.out.println(sum);//15
    }

    public  static  void better_approach()
    {
        int num=5;
        int sum=(num*(num+1))/2;// (5*6)/2==> 30/2==>15
        System.out.println("sum  of  natural  number with  the  help  of the better approach is :");
        System.out.println(sum);//15
    }
    

    public static void main(String[] args) 
    {
        brute_force();
        better_approach();
        
    }
}