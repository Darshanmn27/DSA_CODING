import java.util.*;
public class Optimal 
{
    public static void optimal_solution()
    {
        int N = 84;
        if(N<=1)
        {
            System.out.println("no  prime factors ");
            return;
        }
        while (N % 2 == 0) //// Print all 2's
        {
            System.out.print(2 +" ");
            N /= 2;
        }
        for (int i = 3; i * i <= N; i += 2) //// Now check odd numbers
        {
            while (N % i == 0) 
            {
                System.out.print(i + " ");
                N /= i;
            }
        }   
        if (N > 1) // // If N is still prime
        {
            System.out.print(N);
        }
    
    }


    public static void main(String[] args) 
    {
        optimal_solution();
        
    }

    
}