public class Optimal_solution 
{
    public  static  void optimal()
    {
        int arr[] = {1, 10, 21, 30, 4};
        int n = arr.length;
        if (arr.length < 2) 
        {
            System.out.println("No Second Maximum Element");
            return;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) 
        {
            if(arr[i] > max) 
            {
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] != max) 
            {
                secondMax = arr[i];
            }
        }
        if(secondMax == Integer.MIN_VALUE) 
        {
            System.out.println("No Second Maximum Element");
        } else 
        {
            System.out.println("Second Maximum Element: " + secondMax);
        }
    }
    public static void main(String[] args) 
    {
        optimal();        
    }
    
}
