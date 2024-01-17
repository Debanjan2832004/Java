//Superclass
class Animal {
  void eat() {
    System.out.println("Animal is eating.");
  }
}
// Subclass 1
class Dog extends Animal {
  void bark() {
    System.out.println("Dog is barking.");
  }
}
// Subclass 2
class Cat extends Animal {
  void meow() {
    System.out.println("Cat is meowing.");
  }
}
// Main class
public class hierarchical_inheritace {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat(); // Inherited from Animal class
    dog.bark(); // Specific to Dog class
    Cat cat = new Cat();
    cat.eat(); // Inherited from Animal class
    cat.meow(); // Specific to Cat class
  }
}
