import  java.util.*;
public class Leaders_character 
{
    public  static  void leaderscharacter()
    {
     String str="darshan";
     char arr[]= str.toCharArray();
     List<Character> leader= new ArrayList<>();
     char maxi=arr[arr.length-1];
     leader.add(maxi);
     for(int i=arr.length-2;i>=0;i--)
     {
        if((int)arr[i]>(int)maxi)
        {
            maxi=arr[i];
            leader.add(maxi);
        }
     }
     Collections.reverse(leader);
     System.out.println(leader);
    }


    public static void main(String[] args) 
    {
        leaderscharacter();
        
    }
    
}
