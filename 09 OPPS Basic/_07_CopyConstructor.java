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
    this.age = 18;
  }

  // custom copy constructor
  Student(Student st) {
    this.age = st.age;
  }

}

public class _07_CopyConstructor {

  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student(s1); // custom copy constructor
  }
}