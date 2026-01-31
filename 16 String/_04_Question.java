
import java.util.Scanner;

//  wap first alphabet of each word must be changed to uppercase and all remaining alphabets to lower case
// input: raushan singh
// output Raushan Singh

public class _04_Question {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the line of String ");
    String str = sc.nextLine();
    String[] arr = str.split(" ");
    for (int i = 0; i < arr.length; i++) {
      char ch = arr[i].charAt(0);
      // String str1 = String.valueOf(ch).toLowerCase();
      // String newString=str+arr[i].substring(1).trim();
      // System.out.println(newString+" ");

      String newString = arr[i].substring(1).trim();
      System.out.println((char) (ch - 32) + newString);
    }
  }
}
