import java.util.HashSet;
import  java.util.*;
public class Without_repeating
{    
    public  static   int nonrepeating()
    {
        String s="darshan";//
        int left=0,maxlen=0;
        Set<Character> set=  new HashSet<>();//   to  store   unique  characters
        for(int i=0;i<s.length();i++)
        {
            while (set.contains(s.charAt(i))) 
            {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(i));
            maxlen=Math.max(maxlen, i-left+1); 
        }
        return maxlen;
    } 
    public static void main(String[] args) 
    {
        System.out.println(nonrepeating()); // output ==>5==>"darsh"or "rshan"==>max_length=5 
    }
}