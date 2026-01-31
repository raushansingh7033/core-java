
import java.util.Scanner;

//  wap find duplicates characters in string
// input : "raushan singh"
// output : asnh
public class _07_Question {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count = 0;
    char ch[] = str.toCharArray();
    for (int i = 0; i < ch.length; i++) {
      for (int j = i + 1; j < ch.length; j++) {
        if (ch[i] == ch[j]) {
          System.out.println("Duplicate " + ch[i]);
          count++;
        }
      }
    }
  }
}
