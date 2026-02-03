MultiTasking is a process of performing multiple tasks simaultaneously is known as multitasking

example
computer system that perform multiple tasks like: writing data to a file , playing music . downloading file from remote server at the same time

// advantage
it increase the performance of the cpu

Multitasking can be achived by using

1. process based multitasking(multiprocessing)
   when one system is connectd to multiple processors in order to complete the task is called multiprocessing
   or
   multiprocessing is utilization of two or more central processing units in a single system
   // advantage
   it i the best suitable at operating system level
2. thread based multitasking (multithreading)
   multithreading is a process of executing multiple threads simultaneously without dependency of other threads is called multithreading
3. thread are independents
4. it save time
5. threads are independent so it doesn't effect other thread if an exception occurs in a single thread.

thread is pre-define class in java shich is present in java.lang package
thread is basic unit of cpu and it is well known for indepedent execution

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
   
