
import java.util.Scanner;

// wap find first repeated character in string
public class _08_Question {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    for (int i = 0; i < str.length(); i++) {
      int count = 0;
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(i) == str.charAt(j))
          count++;
      }
      if (count > 1) {
        System.out.println("First repeating charcter is= " + str.charAt(i));
        break;
      }
    }
  }
}
