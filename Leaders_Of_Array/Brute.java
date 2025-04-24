import java.util.ArrayList;
import java.util.List;

public class Brute
{

    public  static void leader_brute()
    {

        List<Integer>leader=  new ArrayList<>();
        int arr[]={16,17,4,3,5,2};
        if(arr==null ||arr.length==0)
        {
            System.out.println("array  is  null   or   empty     no  leaders.");
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            boolean  isleader=true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    isleader=false;
                    break;
                }
            }
            if(isleader)
            {
                leader.add(arr[i]);
            }
        }
        System.out.println(leader);
    }
    public  static  void main(String a[])
    {
        leader_brute();

    }
}