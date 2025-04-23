public  class Best_Time
{

    public  static   void buySellStock()
    {
        int arr[]={7, 1,5 ,3,6,4};
        if(arr==null ||arr.length==0)
        {
            System.out.println("maximum  profit : 0");
            return;
        }
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:arr)
        {
            if(price<minprice)
            {
                minprice=price;
            }
            else
            {
                maxprofit=Math.max(maxprofit, price-minprice);
            }
        }
        System.out.println("maximum_profit :"+maxprofit);

    }
    public   static  void  main(String args[])
    {
        buySellStock();

    }
}