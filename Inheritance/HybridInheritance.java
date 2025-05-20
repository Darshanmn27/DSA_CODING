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

class Child extends Parent1 {
    void childHobby() {
        System.out.println("Child loves programming");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        System.out.println("Child's surname: " + c1.surname);
        System.out.println("Child's age: " + c1.age);
        System.out.println("Child's character: " + c1.ch);
        c1.read();
        c1.nodrinking();
        c1.nosmoking();
        c1.profession();
        c1.childHobby();

        System.out.println();

        Parent2 p2 = new Parent2();
        System.out.println("Parent2's surname: " + p2.surname);
        System.out.println("Parent2's age: " + p2.age);
        System.out.println("Parent2's character: " + p2.ch);
        p2.read();
        p2.nodrinking();
        p2.nosmoking();
        p2.profession();
    }
}
