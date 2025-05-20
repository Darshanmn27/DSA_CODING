# Inheritance in Java

## What is Inheritance?

Inheritance is a mechanism in Java where one class acquires the properties (variables) and behaviors (methods) of another class. It provides a way to reuse code and establish a relationship between classes.

---

## Advantages of Inheritance

- **Code Reusability:** You can reuse fields and methods of the parent class.
- **Method Overriding:** Allows modification of existing behaviors.
- **Improves Code Maintenance:** Changes in the parent class automatically propagate to child classes.
- **Supports Polymorphism:** Enables runtime method binding.
- **Establishes Relationship:** Models real-world hierarchical relationships.

---

## Types of Inheritance in Java

1. **Single-Level Inheritance**
2. **Multilevel Inheritance**
3. **Hierarchical Inheritance**
4. **Hybrid Inheritance**

---

## 1. Single-Level Inheritance

### Definition:
One class inherits directly from another single class.

### Code Example:

```java
class Parent {
    void display() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class");
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        Child c = new Child();
        c.display(); // Parent class method
        c.show();    // Child class method
    }
}
```
### 2. Multilevel Inheritance
Definition:
A class is derived from a class which is also derived from another class (i.e., a chain of inheritance).

---
```java
class Grandparent {
    void greet() {
        System.out.println("Hello from Grandparent");
    }
}

class Parent extends Grandparent {
    void message() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void info() {
        System.out.println("Hello from Child");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();    // Grandparent's method
        c.message();  // Parent's method
        c.info();     // Child's method
    }
}
```
---
---
### 3. Hierarchical Inheritance
Definition:
Multiple classes inherit from a single parent class.
```java
class Grandparent {
    String surname = "Kumar";
    void read() {
        System.out.println("I love reading books");
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

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Parent1 p1 = new Parent1();
        p1.read();
        p1.profession();

        Parent2 p2 = new Parent2();
        p2.read();
        p2.profession();
    }
}
```

---
4. Hybrid Inheritance (Without Interfaces)
Definition:
A combination of two or more types of inheritance. Java does not support multiple inheritance directly, but hybrid inheritance can be simulated using multilevel and hierarchical inheritance together.

---
```java
class Grandparent {
    String surname = "Kumar";
    void read() {
        System.out.println("I love reading books");
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
        c1.read();
        c1.profession();
        c1.childHobby();

        Parent2 p2 = new Parent2();
        p2.read();
        p2.profession();
    }
}
```
