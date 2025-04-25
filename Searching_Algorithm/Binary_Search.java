public class Binary_Search 
{

    public  static int BS()
    {
        int arr[]= {-20, -10, 0, 3, 5, 8, 12, 18};
        int tar=12;
        if(arr==null ||  arr.length==0)
        {
            System.out.println("  array  is  empty  or  null ");
            return  -1;
        }
        int start=0,end=arr.length-1;

        while (start<=end) 
        {
            int mid= (start+end)/2;


            if(arr[mid]==tar)
            {
                return mid;
            }
            else if(arr[mid]>tar)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            
        }
        return -1;

    }


    public  static  void  main(String args[])
    {
        System.out.println(BS());

    }
    
}
