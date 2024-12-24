// Write a Java Program to Implement the functionality of multiple inheritance into the program.
import java.util.*;

class Parent1 {
    void fun() {
        System.out.println("Parent 1");
    }
}

class Parent2 {
    void fun() {
        System.out.println("Parent 2");
    }
}

public class Task12 extends Parent1, Parent2 {  // shows error as multiple inheritance is not supported in java
    public static void main(String[] args) {
        Task12 t = new Task12();
        t.fun();
    }
}
