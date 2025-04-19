public class First_Last
{
    public  static  int [] firstlast(int arr[],int tar)
    {
        int first=-1,last=-1;
        if(arr==null ||arr.length==0)
        {
            return  new int[]{-1,-1};
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==tar)
            {
                if(first==-1)
                {
                    first=i;
                }
                last=i;
            }
        }
        return new int[]{first,last};
    }
    public  static  void main(String a[])
    {
        int arr[]={3,5,3,8,6,3,7};
        int tar=3;
        int result[]=new int[2];
        result=firstlast(arr, tar);
        System.out.println("first and  last element in a  given  array :  ");
        System.out.println("{"+result[0] + "," + result[1]+"}");// {0,5} 

    }

}