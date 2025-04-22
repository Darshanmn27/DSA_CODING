public class Better 
{
    public  static  void better_approach_subarray(int arr[])
    {
        int maxsum=Integer.MIN_VALUE;

        if(arr==null||arr.length==0)
        {
            System.out.println("array  must  not  be null  or  empty");
            return ;
        }
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                maxsum=Math.max(maxsum, sum);
            }
        }
        System.out.println("maximum  sum :"+maxsum);


    }

    public  static  void  main(String  args[])
    {
      int arr[]=  {-2, 1, -3, 4, -1, 2, 1, -5, 4};
      better_approach_subarray(arr);


    }
    
}
