 class MyThread extends Thread{
   public void run(){
     for(int i=0;i<=3;i++){
        System.out.println("User Thread");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
     }
   }
    
}
public class _07_Thread_Sleep {
    public static void main(String[] args) {
        MyThread th=new MyThread();
        th.start();
        for(int i=0;i<=3;i++){
            System.out.println("Main Thread");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }

    }
}
