class Circle
{
    static final  double PI=3.24159;
    double radius;
//static --> Shared by all objects, only one copy exists
    Circle(double r)
    {
        radius=r;
    }
//final --> Value can’t be changed (acts like a constant)
    double calculate_area()
    {
        return PI*radius*radius;
    }
}
//PI --> Declared as static final, meaning it's a constant for all circles.
public class static_Variable_example1 
{
    public static void main(String[] args) 
    {
        Circle c1=  new Circle(5);
        Circle c2=  new Circle(27);
        System.out.println("Area of circle 1:"+c1.calculate_area());//81.03975
        System.out.println("Area of  circle1 :"+c2.calculate_area());//2363.11911
        
    }
}
