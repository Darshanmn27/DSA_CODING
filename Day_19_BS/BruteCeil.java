public class BruteCeil 
{

    public  static  int bruteCeil()
    {
        int arr[]={10,20,30,40,50,60,70};
        int tar=49;
        if(arr==null||arr.length==0)
        {
            return -1;
        }
        int ceil=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=tar)
            {
                ceil=arr[i];
                break;
            }
        }
        if(ceil==Integer.MAX_VALUE)
        {
            System.out.println("not found ceil ");
            return -1;
        }
        return ceil;

    }


    public static void main(String[] args) 
    {
        System.out.println(bruteCeil());
        
    }
    
}
