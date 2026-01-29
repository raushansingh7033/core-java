
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

  public Student(byte age, float attendance, double cgpa, char grade, int id, boolean isActive, long phoneNumber,
      short rollNumber) {
    this.age = age;
    this.attendance = attendance;
    this.cgpa = cgpa;
    this.grade = grade;
    this.id = id;
    this.isActive = isActive;
    this.phoneNumber = phoneNumber;
    this.rollNumber = rollNumber;
  }

}

public class _06_Overloading {
  public static void main(String[] args) {

  }
}
