
import java.util.Scanner;

public class _02_VowelsCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character");
    String name = sc.nextLine();
    int count = 0;
    for (int i = 0; i < name.length(); i++) {
      char ch = name.charAt(i);
      if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        count++;
      }
    }
    System.out.println("Vowels are :" + count);
  }
}
