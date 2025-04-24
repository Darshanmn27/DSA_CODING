import  java.util.*;

public class Optimal 
{

    public  static  void leaderoptimal()
    {
        int arr[]={16,17,4,3,5,2};
        List<Integer> leader=  new ArrayList<>();

         if(arr==null ||arr.length==0)
        {
            System.out.println("array  is  null   or   empty     no  leaders.");
            return;
        }
        int maxright=arr[arr.length-1];
        leader.add(maxright);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>maxright)
            {
                maxright=arr[i];
                leader.add(maxright);
            }
        }
        Collections.reverse(leader);
        System.out.println("leaders  of  a  given  array :");
        System.out.println(leader);
    }


    public static void main(String[] args) 
    {
        leaderoptimal();
    }
    
}
