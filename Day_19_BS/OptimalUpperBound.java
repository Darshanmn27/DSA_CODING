public class OptimalUpperBound 
{

    public  static  int OptimalUpperBound()
    {
        int arr[]={10,20,30,40,50,60};
        int tar=49;
        int start=0,end=arr.length-1,ans=arr.length;
        if(arr==null||arr.length==0)
        {
            return -1;
        }

        while (start<=end) 
        {
            int mid=(start+end)/2;// start+(end-start)/2  (Overflow)
            if(arr[mid]>tar)
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
        System.out.println(OptimalUpperBound());
        
    }
    
}
