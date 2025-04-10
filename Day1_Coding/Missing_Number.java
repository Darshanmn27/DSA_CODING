public class Missing_Number 
{

    public  static  void brute()
    {
        int arr[]={5,6,4,2,1};
        int num=arr.length+1;
        System.out.println(num);
        for(int i=1;i<=num;i++)
        {
            boolean  res=true;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==i)
                {
                    res=false;
                    break;
                }
            }
            if(res)
            {
                System.out.print(i);
                break;
            }
        }
    }

    public  static  void better()
    {
        System.out.println("\n better approach ");
        int arr[]={5,6,4,2,1};
        int num=arr.length+1;
        int newarr[]=  new int[num+1];
        for(int aa:newarr)
        {
            System.out.print(aa+" ");
        }
        for(int i=0;i<arr.length;i++)
        {
            newarr[arr[i]]=1;
           // System.out.print(newarr[i]+" ");
        }
        System.out.println("\n dry  run :");
        for(int aa:newarr)
        {
            System.out.print(aa+" ");

        }

        System.out.println("\n better   approach :");

        for(int i=1;i<num+1;i++)
        {
            if(newarr[i]==0)
            {

                System.out.println(i+"");
                break;
            }
        }

    }


    public  static  void  optimal1()
    {
        int arr[]={5,6,4,2,1};
        int num=arr.length+1;
        int sum1=num*(num+1)/2;//
        int sum2=0;
        for(int n:arr)
        {
            sum2=sum2+n;
        }
        System.out.println("optimal  1st  is :");
        System.out.println(sum1-sum2);

    }
    public  static  void  optimal2()
    {
        System.out.println("optimal 2:");
        int arr[]={5,6,4,2,1};
        int num=arr.length+1;
        int xo1=0;
        int xo2=0;
        for(int i=1;i<num+1;i++)
        {
            xo2=xo2^i;
        }
        for(int i=0;i<arr.length;i++)
        {
            xo1=xo1^arr[i];
        }
        System.out.println(xo1^xo2);
        
    }



   
    public  static  void  optimal3()
    {
        int arr[]={1,2,3,4,6,7};
       // int n=arr.length+1;
        int xor1=0;
        int xor2=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            xor2=xor2^i+1;
            xor1=xor1^arr[i];
        }
        xor2=xor2^n+1;
       
        System.out.println("third   optimal  solution  is :");
        System.out.println(xor1^xor2);
    }


    public static void main(String[] args) 
    {
        brute();
        better();
        optimal1();
        optimal2();
        optimal3();
        
    }
    
}
