MultiTasking is a process of performing multiple tasks simultaneously is known as multitasking

example
computer system that perform multiple tasks like: writing data to a file , playing music . downloading file from remote server at the same time

// advantage
it increase the performance of the cpu

Multitasking can be achieved by using

1. process based multitasking(multiprocessing)
   when one system is connected to multiple processors in order to complete the task is called multiprocessing
   or
   multiprocessing is utilization of two or more central processing units in a single system
   // advantage
   it i the best suitable at operating system level
2. thread based multitasking (multithreading)
   multithreading is a process of executing multiple threads simultaneously without dependency of other threads is called multithreading
3. thread are independents
4. it save time
5. threads are independent so it doesn't effect other thread if an exception occurs in a single thread.

thread is pre-define class in java which is present in java.lang package
thread is basic unit of cpu and it is well known for independent execution

example:

1. by extending thread class
2. by implementing Runnable interface

// by extending thread class
step-1
class classname extends thread class
{
}

step-2
class className extends thread class
{
public void run()
{// body
}
}

step3
className ref-name=new className()
step-4
ref-name.start()

# method

1. run() method
   thread class is used to create and control threads , run() method is a important part of the thread class. when we create a new thread y extending the thread class , we need to override the run() method to define the code that will be executed when the thread is started.

2. start() method
   Thread class provide the start() method, which is used to begin the execution of a thread . the start method is responsible for creating a new thread and invoking run() method of the thread object

# getName() method

getName() method is part of the thread class and it is used to retrive the name of the thread
when we extend thread class we cannot override setName() and getName() functions because they are declared final in thread class

# getId() method

getId() method returns thread identifier. it is a unique positive number.
it is genreated at the time of thread creation

# isAlive()

isAlive() method returns true if the thread (upon which it is called) is still running and got not finished . isAlive() checks if the thread is alive and executing.

# Thread Class Priority

Thread class provides a way to create and manage threads . threads are executed with a certain and the priority is used by thread scheduler to determine the order in which threads are scheduled to run . the Thread class assigns priorities using integer values ranging from Thread.MIN_PRIORITY(which is 1) to Thread.MAX_PRIORITY(which is 10), with Thread.NORM_PRIORITY being the default priority

Thread class priorities:
Thread.MIN_PRIORITY(1): The minimum thread priority
Thread.NORM_PRIORITY(5): the default thread priority
Thread.MAX_PRIORITY(10): the maximum thread priority

// methods

1. setPriority() method
   we can set the priority of a thread using the setPriority(int priority) method
   syntax
   public final void setPriority(int value)
2. getPriority() method
   Thread class provides the getPriority() method , which is used to retrieve the priority of a thread . the getPriority() method returns an integer value representing the priority of the thread . the priority is an integer value between Thread.MIN_PRIORITY(1) and Thread.MAX_PRIORITY(10), inclusive.
   syntax
   public final int getPriority()

# activeCount() method in thread class:

public static int activeCount()

# Thread life cycle in java

thread is the smallest unit of execution within a process, the java virtual machine manages the life cycle of threads

step-1
new(Born) : a thread is begins its life cycle in the new state . it remains in this state until the start() method is called on it.
step-2
Runnable(Ready): after invocations of start() method on new thread, the thread becomes runnable.
step3
Running(execution): a thread is running state if thread scheduler has selected it
step4
waiting(blocked) : a thread is in waiting state if it waits for another thread to perform a task. in this stage the thread is still alive.
step-5
Terminated(Exit) : a thread enter the termination state when it complete its task

# sleep() method in java:

sleep() method is a static method of the thread class that is used to pause the execution of the current thread for a specified amount of time.
the main purpose of sleep method to put a thread into temperory waiting state
syntax:
Thread.sleep(1000);

# join() method in java

join() method allows one thread to wait until another thread completes its execution . in simpler words , it means it waits for other thread to die.
join method will allow one thread to wait until another thread completes its execution.
public final void join()throws InterruptedExecution;
public final synchronized void join(long millis) throws InterruptedExecution
public final synchronized void join(Long millis,int nanos) throws InterruptedExecution

# yield() method in jav multithreading

yield() method is static method of the thread class and it is used to pause the currently executing temporarily allowing threads to execute . when a thread calls yield() it gives hint to the thread scheduler that it's willing to give up its current time slice and let other threads run
public static native void yield()

# interrupt() method in java multithreading

interrupt() method is a part of thread class and is use to interrupt a thread that is either sleeping or waiting state . when a thread is interrupted it receives an interrupt signal and it can respond to this signal in a way taht makes sense fo its specific task

1. if a thread is in sleeping or waiting state it will be woken up and an InterruptedException will be thrown
2. interrupt()method is works only when thread is in sleeping or waiting state
3. if a thread is not in sleeping or waiting state than calling interrupt method will perform normal behavior

syntax:
public void interrupt()
public static boolean interrupted()
public boolean isInterrupted()

# shutDown Hook thread in java

a shutdown hook is a thread that gets executed when the jvm is about to shutdown . we can use to shutdown hooks to perform cleanup operations or save state before the jvm terminates like database closing ,sending alert message etc

- if we want to execute some code before jvm shutdown , we can use shutdown hook

we can use Runtime.getRuntime().addShutDownHook() to register a new Thread that will execute the shutdown() method when jvm is shutting down.
inside the shutdown() method, you can include any cleanup or state -saving operations that you need

- methods
  public void addShutDownHook(java.lang.Thread)
  public boolean removeShutdownHook(java.lang.Thread)
- syntax
  Runtime r =Runtime.getRuntime();
  r.addShutDownHook(new MyThread())

# Daemon Thread

- Daemon Thread runs in the background and provides support to the other threads present in the applications. Dameon Thread in java is known as the background thread as they run continuously in the background until the application terminates , the daemon threads in java designed to support the application's used threads
- Daemon Thread in java is a low-priority thread that performs background operation such as garbage collection, finalizer ,Action listeners , signal disptaches,etc
  Daemon thread is a service provider thread that helps the user thread . its life is at the mercy of user threads . when all user threads expire , jvm immediately terminates this thread.
  In simple words, we can say that it provides services to user threads for background-supporting tasks.
  methods:
  public final void setDaemon(boolean)
  this method is used for declaring the current thread as a daemon threads or a user thread

public final boolean isDaemon()
this method returns a boolean value whether the current thread is a Daemon thread or not
