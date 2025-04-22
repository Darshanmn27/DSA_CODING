public class Optimal_subarray 
{
    public  static  void using_kadens_algorithm(int arr[])
    {
        if(arr==null||arr.length==0)
        {
            System.out.println("array  must  not  be null  or  empty");
            return ;
        }
        int maxsum=arr[0];
        int cursum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            cursum=Math.max(arr[i], cursum+arr[i]);
            maxsum=Math.max(maxsum, cursum);

        }
        System.out.println("maximum  sum :"+maxsum);
    }


    public  static  void  main (String ar[])
    {
        int arr[]=  {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        using_kadens_algorithm(arr);

    }
    
}
