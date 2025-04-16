import java.util.Arrays;

public class array_minimum_element 
{

    public  static  void  brute()
    {
        int arr[]={1,2,3,23,23,23,27,-27,2027,9181};
        Arrays.sort(arr);
        int min=arr[0];
        System.out.println("array  minimum  element  is :"+min);//-27
    }
    public  static  void optimal()
    {
        System.out.println("optimal  solution is :");
        int min=Integer.MAX_VALUE;
        int kk=min;
        System.out.println("even  it  also  avodis  maximum negatives :");
        System.out.println(kk);
        int arr[]={1,2,3,23,23,23,27,-27,2027,9181};
        for(int num:arr)
        {
            if(num<min)
            {
                min=num;
            }
        }
        System.out.println(min);//-27
    }


    public static void main(String[] args) 
    {
       brute(); 
       optimal();
    }
    
}
