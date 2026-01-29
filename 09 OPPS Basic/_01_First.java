class Student {
  byte age; // 1 byte
  short rollNumber; // 2 bytes
  int id; // 4 bytes
  long phoneNumber; // 8 bytes

  float attendance; // 4 bytes
  double cgpa; // 8 bytes

  char grade; // 2 bytes
  boolean isActive; // 1 bit

}

public class _01_First {
  public static void main(String[] args) {
    Student st = new Student();
    st.age = (byte) 21;
    st.rollNumber = (short) 101;
    st.id = 1001;
    st.phoneNumber = 9876543210L;
    st.attendance = 92.5f;
    st.cgpa = 8.7;
    st.grade = 'A';
    st.isActive = true;
    System.out.println(st.age);
    System.out.println(st.rollNumber);
    System.out.print(st.id);
    System.out.println(st.phoneNumber);
    System.out.println(st.attendance);
    System.out.println(st.cgpa);
    System.out.println(st.grade);
    System.out.println(st.isActive);
  }
}
