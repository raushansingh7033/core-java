
class MyThread extends Thread {
    public void run(){
        System.out.println("my thread");
    }
}

public class _01_Threads {

    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}
