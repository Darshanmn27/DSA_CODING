public class Primefactors_brute 
{ 
    public static void  bruteforce()
    {
    System.out.println("\n brute force approach: ");
        int N = 90;
        if(N<=1)
        {
            System.out.println("no  prime factors ");
            return;
        }
        for (int i = 2; i <= N; i++) 
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
        bruteforce();
        
    }
    
}
