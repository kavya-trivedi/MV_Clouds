// Write a program for Multilevel Inheritance using java programming language.

class Hooman {
    void speak() {
        System.out.println("blah blah");
    }
}
class Dog extends Hooman {
    void bark() {
        System.out.println("wuff wuff");
    }
}
class Cat extends Dog {
    void mew() {
        System.out.println("meow");
    }
}

public class Task6 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.speak();
        c.bark();
        c.mew();
    }
}