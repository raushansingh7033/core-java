
class Vehical {
  void run() {
    System.out.println("Vehical is running");
  }
}

class Bike extends Vehical {
  void run() {
    System.out.println("Bike is running");
  }
}

public class _02_RuntimePolymorphism {
  public static void main(String[] args) {
    Bike b = new Bike();
    b.run();
  }

}
