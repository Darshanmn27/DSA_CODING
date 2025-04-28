public class OptimalFloor 
{

    public  static  int optimal()
    {
        int arr[]={10,20,30,40,50,60};
        int tar=49;
        int start=0,end=arr.length-1,ans=Integer.MIN_VALUE;
        if(arr==null||arr.length==0)
        {
            return Integer.MIN_VALUE;
        }
        while (start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]<=tar)
            {
                ans=arr[mid];
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            
        }
        return ans;
    }


    public static void main(String[] args) 
    {
        System.out.println(optimal());
        
    }
    
}
