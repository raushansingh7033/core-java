class Animal {
  String color = "White";

  public Animal() {
    System.out.println("Animal");
  }

  void eat() {
    System.out.println("eating");
  }
}

class Dog extends Animal {
  String color = "black";

  public Dog() {
    super();
  }

  void printColor() {
    System.out.println(color);
    System.out.println(super.color);
  }

  void eat() {
    System.out.println("eating bread...");
  }

  void bark() {
    System.out.println("barking...");
  }

  void work() {

    bark();
    super.eat();
  }
}

public class _03_SuperKeyword {
  public static void main(String[] args) {
    Dog d = new Dog();
    // d.printColor();
    d.work();
  }
}
