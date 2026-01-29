class Animal {
  void eat() {
    System.out.println("Eating");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("barking");
  }
}

class Cat extends Animal {
  void meow() {
    System.out.println("Meow");
  }
}

public class _05_HierarchicalInheritance {
  public static void main(String[] args) {
    Cat c = new Cat();
    c.meow();
    c.eat();

  }
}
