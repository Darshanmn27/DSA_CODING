public class string_default_values 
{

    public  static  void string_default()
    {
        String[] ss=  new String[5];
        System.out.println("default values  are  in  the string  is :");

        for(String s:ss)
        {
            System.out.print(s+" ");
        }
        //null null null null null
    }

    
    public static void main(String[] args) 
    {
        string_default();
        
    }
}
