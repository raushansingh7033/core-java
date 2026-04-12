class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}

public class _04_Print_Num {
    public static void main(String[] args) {
        MyThread th=new MyThread();
        th.start();
    }
}
