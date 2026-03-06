public class _01_Operator {
  public static void main(String[] args) {
    int a = 10;
    int b = 3;

    System.out.println(a + b); // 13
    System.out.println(a - b); // 7
    System.out.println(a * b); // 30
    System.out.println(a / b); // 3
    System.out.println(a % b); // 1

    System.out.println(a == b); // false
    System.out.println(a != b); // true
    System.out.println(a > b); // true
    boolean x = true;
    boolean y = false;
    System.out.println(x && y); // false
    System.out.println(x || y); // true
    System.out.println(!x); // false

    a += 5; // a = a + 5 → 15
    a *= 2; // a = a * 2 → 30
   
    System.out.println(a++); // 5 (then a becomes 6)
    System.out.println(++a); // 7
    System.out.println(a--); // 7 (then a becomes 6)
    System.out.println(--a); // 5

    int max = (a > b) ? a : b;
    System.out.println(max); // 20
  }
}
