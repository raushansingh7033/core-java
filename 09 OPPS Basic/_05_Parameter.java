class Student {
  byte age; // 1 byte
  short rollNumber; // 2 bytes
  int id; // 4 bytes
  long phoneNumber; // 8 bytes

  float attendance; // 4 bytes
  double cgpa; // 8 bytes

  char grade; // 2 bytes
  boolean isActive; // 1 bit

  // parmatrized constructor

  public Student(byte age, short rollNumber, int id, long phoneNumber, float attendance, double cgpa, char grade,
      boolean isActive) {
    this.age = age;
    this.rollNumber = rollNumber;
    this.id = id;
    this.phoneNumber = phoneNumber;
    this.attendance = attendance;
    this.cgpa = cgpa;
    this.grade = grade;
    this.isActive = isActive;
  }

}

public class _05_Parameter {
  public static void main(String[] args) {

    Student s1 = new Student(
        (byte) 21,
        (short) 101,
        1001,
        9876543210L,
        92.5f,
        8.7,
        'A',
        true);
  }
}
