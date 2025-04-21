public class Two_sum_Brute
{

    public  static  int [] brute(int arr[],int tar)
    {
        if(arr==null)
        {
            System.out.println("input array is null:");
            return  new int[] {-1,-1};
        }
        if(arr.length<2)
        {
            System.out.println("array   must  contain  atleast two  elements:");
            return new int[]{-1,-1};
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==tar)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) 
    {
        int arr[]={2,7,11,15};
        int target=9;
        int  newarr[]= new int[2]; // two  store   two indexes
        newarr=brute(arr, target);
        System.out.println("{"+newarr[0]+","+ newarr[1]+"}");//{0,1}
    }
    
}