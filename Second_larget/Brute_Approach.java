import java.util.Arrays;

public class Brute_Approach 
{
    public   static   void  brute_secondlargest()
    {
        int  arr[]={1,27,3,4,56,72,87};
        if(arr.length<2)
        {
            System.out.println("Second largest element not found");
            return;   
        }
        boolean found=false;
        Arrays.sort(arr);
        int largest =arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]!=largest)
            {
                System.out.println("Second largest element is: " + arr[i]);
                found = true;
                break;
            }
        }
        if(!found)
        {
        System.out.println("Second largest element not found ");
        }


    }
    
    public static void main(String[] args) 
    {
     brute_secondlargest();

        
    }
    
}
