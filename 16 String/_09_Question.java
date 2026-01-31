
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//  wap to count occurence of char in java string
// String-> raushan 
// r-1 a-2 u-1 s-1 h-1 n-1
public class _09_Question {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter ths string");
    String str = sc.nextLine();
    char ch[] = str.toCharArray();

    Map<Character, Integer> map = new TreeMap<>();
    for (int i = 0; i < ch.length; i++) {
      int count = 0;
      for (int j = 0; j < ch.length; j++) {
        if (ch[i] == ch[j]) {
          count++;
        }
      }
      map.put(ch[i], count);
    }
    System.out.println(map);
  }
}
