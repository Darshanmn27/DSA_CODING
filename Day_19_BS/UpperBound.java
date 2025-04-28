public class UpperBound 
{


    public  static  int BruteUpperBound()
    {
        int arr[]={1,1,1,1,1};
        int tar=1;
        if(arr==null||arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>tar)
            {
                return i;
            }
        }
        return  arr.length;//hypothetical ans may will  come 

    }


    public static void main(String[] args) 
    {
        System.out.println(BruteUpperBound());
        
    }
    
}
