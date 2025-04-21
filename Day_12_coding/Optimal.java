import java.util.HashMap;

public class Optimal 
{

    public  static   int [] optimalapproach(int arr[],int tar)
    {
        if(arr==null)
        {
            System.out.println("input array is null:");
            return  new int[] {-1,-1};
        }
        if(arr.length<2)
        {
            System.out.println("array   must  contain  atleast two  elements:");
            return new int[]{-1,-1};
        }

        HashMap<Integer,Integer> map=  new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int diff=tar-arr[i];
            if(map.containsKey(diff))
            {
                return  new int[]{map.get(diff),i};
            }
            map.put(arr[i], i);
        }
        return  new int[]{-1,-1};
    }


    public static void main(String[] args) 
    {
        int arr[]={-3,4,3,9};
        int tar=0;
        int result[]= new int[2];
        result=optimalapproach(arr, tar);
        System.out.println("{ "+result[0]+", "+result[1]+"}");
        //{ 0, 2}==> arr[0]+arr[2]==> -3+3==0 target==0    so  out put {0,2}
        
    }
    
}
