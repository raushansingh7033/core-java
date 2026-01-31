
import java.util.Scanner;

// wap to remove duplicates from string
// String str="raushan";
// output : rushn
public class _10_Question {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String res = "";
    for (int i = 0; i < str.length(); i++) {
      String ch = "" + str.charAt(i);
      if (res.contains(ch)) {
        continue;
      }
      res += ch;
    }
    System.out.println(res);
  }
}
