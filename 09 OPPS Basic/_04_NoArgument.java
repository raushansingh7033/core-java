class Student {
  byte age; // 1 byte
  short rollNumber; // 2 bytes
  int id; // 4 bytes
  long phoneNumber; // 8 bytes

  float attendance; // 4 bytes
  double cgpa; // 8 bytes

  char grade; // 2 bytes
  boolean isActive; // 1 bit

  // No argument constructor
  public Student() {
  }

}

public class _04_NoArgument {
  public static void main(String[] args) {
    Student st = new Student();
  }
}
