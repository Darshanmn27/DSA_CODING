public class OptimalLowerBound 
{


    public  static  int LowerBoundOptimal()
    {
        int arr[]={10,20,30,40,50,60};
        int tar=49, start=0,end=arr.length-1;
        int ans=arr.length;
        if(arr==null ||arr.length==0)
        {
            return -1;
        }
        while (start<=end) 
        {
            int mid=(start+end)/2; //start+(end-start)/2(it  avoids overflow )
            if(arr[mid]>=tar)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            
        }
        return ans;
    }


    public static void main(String[] args) 
    {
        System.out.println(LowerBoundOptimal());
        
    }
    
}
