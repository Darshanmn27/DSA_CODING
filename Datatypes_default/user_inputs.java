import   java.util.Scanner;
public class user_inputs 
{   public static void main(String[] args) 
    {   Scanner  s= new Scanner(System.in);
        System.out.println("enter  byte value :");
        byte b= s.nextByte();
        System.out.println("enter a short  value ");
        short ss= s.nextShort();
        System.out.println("enter a integer  value :");
        int num=s.nextInt();
        System.out.println("enter  long  value :");
        long ll= s.nextLong();
        System.out.println("enter  a  float  value :");
        float f= s.nextFloat();
        System.out.println("enter  double  value ");
        double dd= s.nextDouble();
        System.out.println("enter a  character :");
        char ch=s.next().charAt(0);
        s.nextLine();
        System.out.println();

        System.out.println("enter  a string ");
        String val=s.nextLine();

        System.out.print(b+" "+ss+" "+num+" "+ll+" "+f+" "+dd+" "+ch+" "+val);
        
    }
    
}
