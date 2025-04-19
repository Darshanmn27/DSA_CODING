public class Better 
{
    public  static  void  better_approach()
    {       
        System.out.println("\n better  approach: ");
        int N = 90;
        if(N<=1)
        {
            System.out.println("no  prime factors ");
            return;
        }
        for (int i = 2; i*i <= N; i++) 
        {
            while (N % i == 0) 
            {
                System.out.print(i + " ");
                N /= i;
            }
        }
        if(N>1)
        {
            System.out.print(N);
        }
    }


    public static void main(String[] args) 
    {
       better_approach();
        
    }
    
}
