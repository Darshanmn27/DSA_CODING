 public class Default_Numbers 
 {


    public  static  void default_int()
    {
        int arr[]=  new int[5];
        System.out.println("default values integers:");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        //0 0 0 0 0 
    }
    public  static  void default_byte()
    {
        byte arr[]=  new byte[5];
        System.out.println("default values byte:");
        for(byte num:arr)
        {
            System.out.print(num+" ");
        }
        //0 0 0 0 0 
    }
    public  static  void default_short()
    {
        short arr[]=  new short[5];
        System.out.println("default values short:");
        for(short num:arr)
        {
            System.out.print(num+" ");
        }
        //0 0 0 0 0 
    }
    public  static  void default_long()
    {
        long arr[]=  new long[5];
        System.out.println("default values long:");
        for(long num:arr)
        {
            System.out.print(num+" ");
        }
        //0 0 0 0 0 
    }

    public static void main(String args[])
    {
        default_int();
        default_byte();
        default_short();
        default_long();

    }
 
    
 }