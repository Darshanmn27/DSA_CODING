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
}// one single child class inherits the properties and behaviours from parent
 // class
 // properties ==> variables
 // behavious ==> methods

class Child extends parent {

}

public class SingleLevel {
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