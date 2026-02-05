garbage collection in java is the automatic process of reclaiming memory occupied by objects that are no longer in use or reachable by the program. java uses a garbage collector to manage and automatically clean up unrefrenced objects which helps developer avoid manual management and reduce the risk of memory leaks,
in other words , it is a way to destroy the unused objects
// points about garbage collection
automatic memory management: java's garbage collector runs in the background and identifies objects that are no longer reachable by the program . it frees up the memory occupied by these objects,allowing the application to use it for new objects

java heap: memory in java is divided into two main areas : the heap and the stack
the heap is where the objects are allocated and garbage collection primarily occurs in this area . the stack is used for local variables and method call information

there are three way to unreferenced object

1. by nulling reference
   example
   A a=new A()
   a=null;
2. by assigning a reference to another
   example
   A a =new A()
   A=b=new A()
   a=b;
3. by anonymous object
   example:
   new A()
   finalize() method: finalize is a method which is present on object class. the main purpose of finalize() method is used to release the resource that is allocated by unused object

   or 
   finalize() method can be used to perform cleanup operations on an object before it is garbage collected.
   this method can be used to perform cleanup processing and this method is defined in object class

   syntax:
   protected void finalize()
   {

   }

System.gc() 
gc() method is used to call garbage collector explicitly . however gc() method does not gurantee that jvm perform the garbage collection . it only request the jvm for garbage collection . this method is present in system and Runtime class

public static void gc()