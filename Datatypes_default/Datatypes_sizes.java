public class Datatypes_sizes 
{

    public static void main(String[] args) 
    {
        
        System.out.println("primitive datatypes and  their sizes :\n");
        System.out.println("byte  :"+Byte.SIZE);//8 bits ==> 1 byte
        System.out.println("short :"+Short.SIZE);//16 bits ==> 2 bytes
        System.out.println("int :"+Integer.SIZE);//32 bits ==> 4 bytes
        System.out.println("long :"+Long.SIZE);//64 bits ==> 8 bytes
        System.out.println("float :"+Float.SIZE);//32 bits ==> 4 bytes
        System.out.println("double :"+Double.SIZE);//64 bits ==> 8 bytes
        System.out.println("character :"+Character.SIZE);//16 bits ==>2 bytes==>it  follows  unicode 
        System.out.println("boolean : Size not precisely defined (depends on JVM)");
    }
    
}
