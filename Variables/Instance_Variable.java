
class  instance
{                            //we  can  use without intialization
    int a;                  //  instance  variables  created inside the class  but  outside the  method 
    int b;                 //   Deafault  values  are  provided 
    String name;           //   memory is  always associated   in heap  segment  
    boolean  ispresent;    //  object  creation  is  compoulsary
}
public  class Instance_Variable
{
    public  static  void  main(String args[])
    {
        //  instance  varibales  in  java 
        instance  mn=  new instance();
        System.out.println(mn.a);//0
        System.out.println(mn.b);//0
        System.out.println(mn.name);//null
        System.out.println(mn.ispresent);//false 
        mn.a=2027;
        mn.b=2023;
        mn.name="darshan";
        mn.ispresent=true;
        System.out.println(mn.a);//2027
        System.out.println(mn.b);//2023
        System.out.println(mn.name);//darshan
        System.out.println(mn.ispresent);//true 

    }
}