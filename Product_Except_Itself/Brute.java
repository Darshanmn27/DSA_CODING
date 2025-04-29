public class Brute 
{
    public  static  void produArray_Brute()
    {
        int arr[]={1,2,3,4};
        int res[]= new int[arr.length];     
        if(arr.length==0)
        {
            System.out.println("input  array  is  empty");
            return;
        }
        if(arr.length==1)
        {
            System.out.println("output :[1]");
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            res[i]=1;
        for(int j=0;j<arr.length;j++)
        {
            if(i!=j)
            {
                res[i]*=arr[j];
            }
        }
        }
        for(int num:res)
        {
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) 
    {
        produArray_Brute();//24 12 8 6 
        
    }
    
}
