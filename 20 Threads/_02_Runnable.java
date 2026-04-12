class MyThread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread is creating via runnable interface");
    }
}

public class _02_Runnable {
    public static void main(String[] args) {
        Thread th=new Thread(new MyThread());
        th.start();
        th.setName("A");
        System.out.println(th.isAlive());
        Thread.currentThread().setName("Raushan");
        System.out.println(Thread.currentThread().getName());
    }
    
}
