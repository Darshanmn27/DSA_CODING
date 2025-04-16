class Week
{
    static final int days_in_week=7;


    void printdays()
    {
System.out.println("there are "+days_in_week+
"days  in a week");
    }
}

public class static_variable_example2 
{

    public static void main(String[] args) 
    {
        Week w=  new Week();
        w.printdays();
    //there are 7days  in a week
        
        
    }
    
}
