# Java Variables Concept

This repository explains the concept of **variables** in Java, including the different types of variables, their usage, and code examples.

## Table of Contents
1. [What is a Variable in Java?](#what-is-a-variable-in-java)
2. [Types of Variables](#types-of-variables)
   - [Instance Variables](#instance-variables)
   - [Local Variables](#local-variables)
   - [Static Variables](#static-variables)
3. [Code Examples](#code-examples)

---

## What is a Variable in Java?

In Java, a **variable** is a container that holds data that can be changed during program execution. Variables are used to store values that can be accessed and modified throughout the program.

- A **variable** has a **name**, a **type** (such as `int`, `double`, `String`, etc.), and a **value** that the variable holds.
- Variables are classified based on where they are declared and how they are used in the program.

---

## Types of Variables

In Java, there are three main types of variables:

### Instance Variables

- **Instance variables** are declared inside a class but outside any method, constructor, or block.
- Each object of the class has its own copy of the instance variables.
- Instance variables can have **default values** if not explicitly initialized.

#### Example:

```java

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


```

## Default values of instance variables:

int: 0

boolean: false

String: null
---
## Local Variables
Local variables are declared inside a method, constructor, or block.

Local variables do not have default values and must be initialized before they are used.

Their scope is limited to the method or block where they are declared.

Example:
```Java
public class Local_variable 
{
    public static void main(String[] args) 
    {
        int b;                   
        String  nam;             
        // we  cannot use   without intialization
        // memory  is  always  allocated in stack  segment 
        // no  need  to  creat a  obect
        // default  values  are  not  provided 
        //created  inside  the  class and  also inside  the  method 
        /* 
        System.out.println(b); 
        System.out.println(nam);  

         */
         int num1=2027;
        int  num2=2023;
        String name="ZenShan";
        boolean  ispresent=true;
        System.out.println(num1);//2027
        System.out.println(num2);//2023
        System.out.println(name);//ZenShan
        System.out.println(ispresent);//true


        
    }
    
}
```
Note: Local variables must be explicitly initialized before use.

---
## Static Variables
Static variables are declared using the static keyword.

Static variables are shared among all instances of a class. There is only one copy of the static variable for the entire class.

They are initialized only once and can be accessed using the class name or an object.

Example1:
```java
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
```
---
example2 :

```java

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
```

