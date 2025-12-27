
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Puppy extends Dog {
    void wagTail() {
        System.out.println("Puppy is wagging tail.");
    }
}
public class multilevel_inheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.wagTail();
    }
}
