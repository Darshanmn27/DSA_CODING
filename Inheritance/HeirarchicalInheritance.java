class Grandparent {
    String surname = "Kumar";
    char ch = 'A';
    int age = 72;

    void read() {
        System.out.println("I love reading books");
    }

    void nodrinking() {
        System.out.println("No Drinking");
    }

    void nosmoking() {
        System.out.println("No Smoking");
    }
}

class Parent1 extends Grandparent {
    void profession() {
        System.out.println("Parent1 is a teacher");
    }
}

class Parent2 extends Grandparent {
    void profession() {
        System.out.println("Parent2 is a Cabinet Secretary");
    }
}

public class HeirarchicalInheritance {
    public static void main(String[] args) {
        Parent1 p1 = new Parent1();
        System.out.println(p1.surname);// Kumar
        System.out.println(p1.age);// 72
        p1.read();// I love reading books
        p1.nodrinking();// No Drinking
        p1.nosmoking();// No Smoking
        p1.profession();// Parent1 is a teacher

        System.out.println();

        Parent2 p2 = new Parent2();
        System.out.println(p2.surname);// Kumar
        System.out.println(p2.age);// 72
        System.out.println(p2.ch);// A
        p2.read();// I love reading books
        p2.nodrinking();// No Drinking
        p2.nosmoking();// No Smoking
        p2.profession();// Parent2 is a Cabinet Secretary
    }
}
