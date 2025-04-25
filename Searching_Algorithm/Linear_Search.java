public  class Linear_Search
{

    public  static  int linear()
    {
        int arr[]={10,20,30,45,44,33,22,11,11,9,8,7,6,37,27};
        int tar=27;

        if(arr==null ||  arr.length==0)
        {
            System.out.println("Array  is  empty  or  null");
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==tar)
            {
                return i;
            }
        }
        return -1;
    }
    public  static  void  main(String args[])
    {
        System.out.println(linear());
        
    }
}