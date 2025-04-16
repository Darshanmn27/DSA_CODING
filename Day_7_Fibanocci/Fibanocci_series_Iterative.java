import java.util.*;
public class Fibanocci_series_Iterative 
{
    public static void bruteforce()
    {
        int N = 5;
        int a = 0, b = 1;

        System.out.print(a + ", " + b);

        for (int i = 2; i < N; i++) 
        {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
    }


       


    public static void main(String[] args) 
    {
        bruteforce();

     }        
    }

    