class MyThread extends Thread{
    public void run(){

    }
}
public class _06_Thread_Priority {
    
    public static void main(String[] args) {
      MyThread th=new MyThread();
      System.out.println(th.getPriority());
      th.setPriority(9);
      System.out.println(th.getPriority());
      System.out.println(th.MIN_PRIORITY);
      System.out.println(th.MAX_PRIORITY);
      System.out.println(th.NORM_PRIORITY);
      System.out.println(Thread.activeCount());
      System.out.println(th.activeCount());
    }
}
