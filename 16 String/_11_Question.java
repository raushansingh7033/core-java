
import java.util.Scanner;

// wap convert float to string in java

public class _11_Question {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float f = 10.5f;
    String str = Float.toString(f);
    // String str = String.valueOf(f);
    System.out.println(str);
    System.out.println(str.getClass());
  }
}
