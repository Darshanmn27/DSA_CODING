public class Recursive_Approach 
{

    public  static  int fib(int num)
    {
        if(num==0)
        {
            return 0;
        }
        if(num==1)
        {
            return 1;
        }
        return fib(num-1)+fib(num-2);
    }


    public static void main(String[] args) 
    {
        int num=5;
        for(int i=0;i<num;i++)
        {
            System.out.print(fib(i)+" ");
        }
        
    }
    
}
