/*
 a base class and a subclass with extends, 
 calling super() explicitly in the subclass constructor.
 */

public class Inheritance {
    public static void main (String[] args) {
        // dog object
        Dog dog = new Dog("Snoopy", "Labrador");

        // calling methods from the Dog class
        dog.bark();

        // calling a method inherited from the Animal class
        dog.eat();
    }
}

// base class (parent) 
class Animal {
    String name;

    // base class constructor
    public Animal(String name) {
        // animal parent constructor
        this.name = name;
    }   

    public void eat() { 
        System.out.println(this.name + " is eating.");
    }
}

// subclass (child)
class Dog extends Animal {
    // dog class inherits from the Animal class
    String breed;

    // subclass constructor
    public Dog (String name, String breed) {
        // calling parent constructor using super()
        super(name);
        this.breed = breed;
    }

    public void bark() { 
        System.out.println(this.name + " the " + this.breed + " is barking.");
    }

}