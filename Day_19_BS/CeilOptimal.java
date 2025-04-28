public class CeilOptimal 
{

    public static int findCeilOptimal()
    {
        int arr[]={10,20,30,40,50,60};
        int tar=49;
        if(arr==null||arr.length==0)
        {
            System.out.println("array occur null or 0 size");
            return -1;
        }
        int start=0,end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while (start<=end) 
        {
            int mid=(start+end)/2;
            if(arr[mid]>=tar)
            {
                ans=arr[mid];
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        if(ans==Integer.MAX_VALUE)
        {
            System.out.println("no ceil is found, return -1");
            return -1;
        }
        return ans;

    }

    public static void main(String[] args) 
    {
        System.out.println(findCeilOptimal());
        
    }
    
}
