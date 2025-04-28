public class LinearLowerBound
{


    public  static  int lowerBound()
    {
        int arr[]={10,20,30,40,50,60};
        int tar=987;
        if(arr==null ||arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=tar)
            {
                return i;
            }
        }
        return arr.length;
    // Hypothetical index if target is greater than all elements 
    }
    public  static   void  main(String args[])
    {
        System.out.println(lowerBound());

    }
}