
class Student {
  int rno;
  String name;
  float fee;

  // public Student(int rno, String name, float fee) {
  // rno = rno;
  // name = name;
  // fee = fee;
  // }

  // public Student(int rno, String name, float fee) {
  // this.rno = rno;
  // this.name = name;
  // this.fee = fee;
  // }

  public Student(int r, String n, float f) {
    rno = r;
    name = n;
    fee = f;
  }

  void display() {
    System.out.println(name + " " + rno + " " + fee);
  }
}

public class _02_ThisKeyword {
  public static void main(String[] args) {
    Student st = new Student(1, "Raushan", 75400);
    st.display();
  }
}
