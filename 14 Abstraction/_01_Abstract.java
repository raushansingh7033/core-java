abstract class Shape {
  abstract void draw();
}

class Rectangle extends Shape {
  void draw() {
    System.out.println(" drawing Rectangle ");
  }
}

class Circle extends Shape {
  void draw() {
    System.out.println("Drawing circle");
  }
}

public class _01_Abstract {
  public static void main(String[] args) {
    Shape s = new Circle();
    s.draw();
  }
}
