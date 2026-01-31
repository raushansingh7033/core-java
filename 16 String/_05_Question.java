
import java.util.Scanner;

// wap to print the reverse of given string in java
public class _05_Question {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String name = sc.nextLine();
    String rev = "";
    for (int i = name.length() - 1; i >= 0; i--) {
      rev = rev + name.charAt(i);
    }
    System.out.println(rev);
  }
}
