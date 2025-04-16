import java.util.Arrays;

public  class array_max_element
{
    public  static  void brute_force()
    {
        int arr[]={-221,-918,-3,-123,-1,-98,-918,12,3,47,27,37,87};
        Arrays.sort(arr);//use sorting algorithm 
        int max=arr[arr.length-1];
        System.out.println("maximum element is :"+max);//87
    }
    public  static  void optimal()
    {
      int arr[]={-221,-918,-3,-123,-1,-98,-918,12,3,47,27,37,87};
        int max=arr[0];
        for(int num:arr)
        {
            if(num>max)
            {
                max=num;
            }
        }
        System.out.println("maximum  element  in a  given  array is :"+max);//87
    }

    public static void main(String[] args) 
    {
        brute_force();
        optimal();
        
    }

}