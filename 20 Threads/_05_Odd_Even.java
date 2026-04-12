class Number{
    private int i=1;
    private final int max=10;

    public synchronized void printEven(){
        while (i<=max) {
            if(i%2!=0){
                try
            {
                wait();
            }catch(Exception e){}
            }
            System.err.println("Even :"+i++);
            notify();
        }
    }
    public synchronized void printOdd(){
        while (i<=max) {
            if(i%2==0){
                try{wait();}catch(Exception e){}
            }
            System.out.println("Odd : "+i++);
            notify();
        }
    }
}

public class _05_Odd_Even {
   public static void main(String[] args) {
    Number n=new Number();
    new Thread(()->n.printOdd()).start();
    new Thread(()->n.printEven()).start();
    
   } 
}
