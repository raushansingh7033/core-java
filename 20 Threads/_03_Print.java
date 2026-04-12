class MyThread extends Thread{
    public void run(){
       for(int i=0;i<=3;i++){
        System.out.println("User Thread");
       }
    }
}

public class _03_Print {
    public static void main(String[] args) {
        MyThread th=new MyThread();
        th.start();
        try{
          th.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        for(int i=0;i<=3;i++){
            System.out.println("main thread");
        }
    }
}
