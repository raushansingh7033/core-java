Synchronization is a process of handling resource accessibility by multiple threads requests . the main purpose of synchronization is to avoid thread interface . at times when more than one thread try to access a shared resource , we need to ensure that response will be used by only one thread at a time this process is called synchronization.

example,
suppose we have two different threads t1 and t2 starts execution and save certain values in a file temporary.txt which will be used to calculate some result when t1 returns. meanwhile t starts and before t1 returns , t2 change the values saved by t1 in the file temporary.txt (temparory.txt is the shared resource). now obviously t1 will return wrong result.

to prevent such problems , synchronization was introduced . with synchronization in above case, once t1 starts using temporary.txt file, this file will be ,locked (Lock mode), and no other thread will be able to access or modify it until t1 returns.

method
Synchronization() method
if we the synchronization keywords in any method then that method is synchronized method.
it is used to lock an object for any shared resources.
the object gets the lock when the synchronized method is called.
the lock won't released until the thread completes its function

syntax:
Access_Modifier synchronized return_type method_name (method_parameters){

}

synchronization block in java
synchronized block helps in perforeming synchronization on any particular resource of function or method

example
we have 100 lines of code in method but we want to synchronized only 50 lines of code in method in such case we can use synchronized block

synchronized(object){
// code that needs to be synchronized
}

wait() method
wait() method is used to make a thread temporarily release its lock on an object and allowing other threads to execute . when a thread calls wait() method , it is enter in the waitting state and releases the lock on the object. the thread will remain in the waiting state until another thread calls notify() or notifyAll()

synchronized (sameObject){
sameObject.wait();// release the lock and waits for notification
}

notify() method:
notify() method is used to wake up on of the threads that are currently waiting on the same object. when a thread calls notify() method it signals to the jvm that is ready to release the lock on the object and allowing one waiting thread to acquire the lock continue execution

synchronized(sameObject){
sameObject.notify(); // Notifies one waiting thread
}


// know synchronization in java
as we know every object has a lock in java and this lock canbe given to only one thread but if we have multiple object then we can also have multiple lock and this lock can be given multiple threads so again will get unexpected data(wrong data) even in the synchronized method

static synchronization is used to synchronized access to a static method we know static doesn't depend on the objects , rather they are called using the class name. that's why in case of synchronizing static methods , lock isn't acquired on any object . rather it is acquire on the class.

if static synchronized method is called a class level lock is acquired and then if an object is tries ti access non static synchronized method at the same time it will not accessible because class level lock is already acquired.

// points  about static synchronized 
1. static synchronization acquires lock on the same class as opposed to instance synchronization that takes lock in objects.
2. static synchronization is used on static methods.
3. static and non static / instance synchronization can work in parallel.meaning a thread can acquire locks on both , class and object at the same time.

class className{
  // other class members..
  // static synchronized method
  public static synchronized returntype methodName (parameters){
    // method implementation
  }
  // other class members...
}



2. by implementing Runnable interface
Runnable interface is part of the java.lang package and Runnable interface is used for creation of threads . this interface contains a single method called run() . this method contains the code that will be executed whenever the thread starts.

steps to create a new thread using Runnable
class className implements Runnable
{

}
// step-2
class className implements Runnable
{
  public void run(){
    // code
  }
}

step-3
className ref-name=new className();

step-2
Thread myThread =new Thread(ref-name)
myThread.start();