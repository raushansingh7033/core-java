class Calculation {
  void add(int a, int b) {
    System.out.println(a + b);
  }

  void add(float a, float b) {
    System.out.println(a + b);
  }

  void add(double a, double b) {
    System.out.println(a + b);
  }
}

public class _01_Polymorphism {
  public static void main(String[] args) {
    Calculation cal = new Calculation();
    cal.add(5, 7);
    cal.add(10.2f, 10);
    cal.add(90.00, 20.00);
  }

}
