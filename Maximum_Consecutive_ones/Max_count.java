public class Max_count
{
    public  static void maximum_consecutive_ones()
    {
        int arr[]={1,1,1,1,1,1,12,2,3,4,5,5,67,7,1,1,1,1,6,6,6,1};
        int count =0,max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
                max=Math.max(max, count);
            }
            else
            {
                count=0;
            }
        }
        System.out.println("Maximum consecutive 1's:"+max);
    }
    public static void main(String[] args) 
    {
        maximum_consecutive_ones();
        
    }
}