
import java.util.Scanner;

//  wap to accept a code which is contains only digits from 0 to 9 and decodes in character
// Input CODE : 667685693232837589
// A=65 to 90
// a=97 to 122
// solution

public class _03_Question {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String digits = sc.nextLine();
    String temp = "";
    for (int i = 0; i < digits.length(); i++) {
      char ch = digits.charAt(i);
      temp += ch;
      int a = Integer.parseInt(temp);
      if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
        System.out.print((char) a);
        temp = "";
      }
    }

  }
}
