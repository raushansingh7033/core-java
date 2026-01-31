
// wap to check whether a string is a palindrome
// input deed 
// output deed

import java.util.Scanner;

public class _06_Question {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String rev = "";
    for (int i = name.length() - 1; i >= 0; i--) {
      rev = rev + name.charAt(i);
    }
    if (name.equals(rev)) {
      System.out.println("String is palindrome");
    }
  }
}
