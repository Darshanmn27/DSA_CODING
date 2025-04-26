import  java.util.Arrays;
public class Check_Anagram
{
    public  static boolean anagramornot(String s1,String s2)
    {
        if(s1==null ||s2==null)
        {
            return  false;
        }
        if(s1.length()!=s2.length())
        {
            return false;
        }
        char ar1[]= s1.toCharArray();  
        char ar2[]= s2.toCharArray();  
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        return Arrays.equals(ar1, ar2);
     }
    public  static void main(String abc[])
    {        
        String s1="triangle";
        String s2="integral";
        if(anagramornot(s1, s2))
        {
            System.out.println(s1+"  and "+s2+"  are anagram");
        }
        else
        {
            System.out.println(s1+"  and "+s2+"  are not anagram");
        }

    }
}
