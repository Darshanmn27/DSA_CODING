class parent {
    String Surname = "Kumar";
    char ch = 'A';
    int age = 64;

    void read() {
        System.out.println("i love reading  books ");
    }

    void nodrinking() {
        System.out.println(" No Drinking ");

    }

    void nosmoking() {
        System.out.println(" No Smoking ");
    }
}

class Child extends parent {

    /*
     * inheritance is a process of acquiring the properties and behaviours of a
     * class by another class
     */
    // properties ==> variables
    // behaviours ==> methods
    // in heritance achived by using extends keyword

}

public class inheritance1 {
    public static void main(String[] darshan) {
        Child c1 = new Child();
        System.out.println(c1.Surname);// Kumar
        System.out.println(c1.age);// 64
        System.out.println(c1.ch);// A
        c1.read();// i love reading books
        c1.nodrinking();// No Drinking
        c1.nosmoking();// No Smoking

    }
}