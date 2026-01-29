
import java.util.Scanner;

class Calculator {
  char op;
  double a, b, res = 0;

  void cal() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter operator (+,-,*,/)");
    op = sc.next().charAt(0);
    System.out.println("Enter two value");
    a = sc.nextDouble();
    b = sc.nextDouble();
    switch (op) {
      case '+':
        res = a + b;
        break;
      case '-':
        res = a - b;
        break;
      case '*':
        res = a * b;
        break;
      case '/':
        res = a / b;
        break;

    }
    System.out.println(a + " " + op + " " + b + "=" + res);

  }
}

public class _02_Cal {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.cal();
  }
}
