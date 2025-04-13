public class Normal 
{
    
    public  static void Dec_to_bin()
    {
        StringBuilder s=  new StringBuilder();
        int num=27;
        while (num>0) 
        {
            int r=num%2;
            s.insert(0, r+" ");
            num=num/2;
        }
        System.out.println("decimal  to  binary  conversion is :");
        System.out.println(s.toString());//1 1 0 1 1

        

    }
    public  static void Dec_to_octal()
    {
        StringBuilder s=  new StringBuilder();
        int num=10;
        while (num>0) 
        {
            int r=num%8;
            s.insert(0, r+" ");
            num=num/8;
        }
        System.out.println("decimal  to octal conversion is :");
        System.out.println(s.toString());//1 2

        

    }

    public  static   void decimal_to_hexadecimal()
    {
        System.out.println("decimal   to hexadecimal ");
        int dec=10;
        StringBuilder ss=  new StringBuilder();
        while (dec>0) 
        {
            int r=dec%16;
            if(r<10)
            {
                ss.insert(0, (char)('0'+r));
            }
            else
            {
                ss.insert(0, (char)('A'+(r-10)));
            }
            dec=dec/16;
            
        }
        System.out.println(ss.toString());//A
    }


    public  static  void binary_to_decimal()
    {
        String bin="1010";
        int num=Integer.parseInt(bin);
        System.out.println(num);
        
        int res=0;
        int i=0;
        while (num>0) 
        {
            int r=num%10;
            res=res+r*(int)Math.pow(2, i);
            i++;
            num=num/10;  
        }
        System.out.println("binary  to  decimal number  conversion  is :");

        System.out.println(res);//10
    }
    public  static  void octal_to_decimal()
    {
        String bin="42";
        int num=Integer.parseInt(bin);
        System.out.println(num);
        
        int res=0;
        int i=0;
        while (num>0) 
        {
            int r=num%10;
            res=res+r*(int)Math.pow(8, i);
            i++;
            num=num/10;  
        }
        System.out.println("octal   to  decimal number  conversion  is :");

        System.out.println(res);//34
    }


    public static void main(String[] args) 
    {
        Dec_to_bin();
        Dec_to_octal();
        decimal_to_hexadecimal();
        binary_to_decimal();
        octal_to_decimal();
        
    }
    
}
