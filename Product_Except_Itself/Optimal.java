public class Optimal
{
    public  static  void produArray()
    {
        int arr[]={1,2,3,4};
        int result[]=new int[arr.length];
        result[0]=1;
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
       for(int i=1;i<arr.length;i++)
       {
        result[i]=result[i-1]*arr[i-1];
       }
        int sufixproduct=1;
        for(int i=arr.length-2;i>=0;i--)
        {
            sufixproduct=sufixproduct*arr[i+1];
            result[i]*=sufixproduct;
        }
        for(int num:result)
        {
            System.out.print(num+" ");
        }
    }
    public static  void  main(String darshan[])
    {
        produArray();//24 12 8 6 
    }

}