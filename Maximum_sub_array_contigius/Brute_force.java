public  class Brute_force 
{

    public  static  void maximum_sum_contiguous_subarray(int arr[])
    {
        int maxsum=Integer.MIN_VALUE;
        if(arr==null||arr.length==0)
        {
            System.out.println("array  must  not  be null  or  empty");
            return ;
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];

                }
                maxsum=Math.max(maxsum, sum);
            }
        }
        System.out.println("Maximum sum :"+maxsum);
    }
    public  static  void  main(String args[])
    {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        maximum_sum_contiguous_subarray(arr);

    }

    
}