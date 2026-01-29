
interface Student {
    int age = 20; // public static final by default

    void show();

    default void defaultMethod() {
        System.out.println("Default");
    }

    static void staticMethod() {
        System.out.println("Static method");
    }
}

class Test implements Student {

    public void show() {
        System.out.println("Age = " + age);
    }
}

public class _01_Interface {
    public static void main(String[] args) {

        Test t = new Test();
        t.show();

        // Access variable using interface name
        System.out.println(Student.age);
    }
}
