public class FloorBrute 
{

    public  static  int  brute()
    {
        int arr[]={10,20,30,40,50,60},tar=50;
        if(arr==null||arr.length==0)
        {
            return Integer.MIN_VALUE;
        }
        int floor=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=tar)
            {
                floor=arr[i];// Update floor to the current element
            }
        }
        return floor;
    }

    public static void main(String[] args)
    {
        System.out.println(brute());

        
    }
    
}
