public class Fibanocci_series_Dynamic 
{

    public static void fibanocci_dynamic()
    {
        System.out.println(" dynamic programming concepts :");
        int N = 0;
        if(N<=0)
        {
            return ;
        }
        int[] fib = new int[N];
        System.out.println("integer array default  values");
        for(int num:fib)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < N; i++) 
        {
            fib[i] = fib[i-1] + fib[i-2];
        }

        for (int i = 0; i < N; i++) 
        {
            System.out.print(fib[i] + " ");
        }
    }


    public static void main(String[] args) 
    {
        fibanocci_dynamic();
        
    }
    
}
