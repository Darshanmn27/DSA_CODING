
class grandparent {
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

class parent extends grandparent {

}

class child extends parent {

}

public class MultilevelInheritance {

    public static void main(String[] args) {
        child c1 = new child();
        System.out.println(c1.Surname);// kumar
        System.out.println(c1.age);// 64
        System.out.println(c1.ch);// A
        c1.read();// i love reading books
        c1.nodrinking();// No Drinking
        c1.nosmoking();// No Smoking

    }

}
