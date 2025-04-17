public class default_float_double 
{

    public  static  void default_float()
    {
        System.out.println("default  values  in  float data type :");
        float  arr[]=  new float[5];
        for(float num:arr)
        {
            System.out.print(num+" ");
        }
        //0.0 0.0 0.0 0.0 0.0
    }
    public  static  void default_double()
    {
        System.out.println("default  values  in  double data type :");
        double  arr[]=  new double[5];
        for(double num:arr)
        {
            System.out.print(num+" ");
        }
        //0.0 0.0 0.0 0.0 0.0
    }


    public static void main(String[] args) 
    {
        default_float();
        default_double();
        
    }
    
}
