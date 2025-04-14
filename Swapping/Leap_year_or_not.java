import java.time.LocalDate;

public class Leap_year_or_not 
{

    public  static  void leap_year_using_if_else()
    {
        int year=100;
        if((year%4==0 && year %100!=0)||(year %400==0))
        {
            System.out.println(" given year  is leap year");
        }
        else
        {
            System.out.println("given year  is normal year ");
        }

    }

    public  static  void  checkleap_year_using_ternary()
    {
        System.out.println("check  leap  year using  the ternary  oerators :");
        int year=2024;
        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "is a Leap Year." : "is not a Leap Year.";
        System.out.println(year + " " + result);
    }

    public  static  void check_leap_using_datetimeclass()
    {
        System.out.println("using the datetime class. ");
        int year=2024;
        boolean res=LocalDate.of(year, 1, 1).isLeapYear();
        if(res)
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }

    public  static void main(String a[])
    {
        leap_year_using_if_else();
        checkleap_year_using_ternary();

    }
    
}
