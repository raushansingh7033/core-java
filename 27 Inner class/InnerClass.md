An inner class is also known as nested class . inner class are part of nested classes , when a nonstatic class is defined in nested class then it is known as an inner class. it is defined inside the class or an interface . inner classes are mostly used to logically group all the classes and the interface in one place , which makes code more readable and manageable . inner classes can access members of the outer class including all the private data members and methods

// types
member inner class
static inner class
anonymous inner class
local inner class

// member inner class
a non static class that is created inside a class but outside a method is called member inner class.
it can be declared with access modifiers like public default ,private and protected.

syntax:

class outerClass{
class InnerClass{

}
}

static inner class
static inner class is a nested class that is declared with the static keyword . it is a class that is associated with its outer class, but it does not require an instance of the outer class to be instantiated.

class OuterClass{
static inner class
static class StaticInnerClass{

}
}

// a non-static nested class that is created inside a method is called local inner class. if we want to invoke the methods of local inner class , youmust instantiated this class inside the method , we cannot use private ,public or protected access modifiers with local inner class.

```
class OuterClass
{
// outerclass members and methods
public void someMethod(){
// local inner class defined within the method
class LocalInnerClass{
// members and methods of the local inner class
void localMethod(){
// code for local method

}
}
}
}
```

// anonymous inner class 
an anonymous inner class is a class without a name that is defined and instantiated in a single statement. it is often used when you need to create a temporary class for a specific task and don't want to explicitly

syntax
// test can be interface , abstract method /concreate class
Test t=new Test()
{
  // data members and methods
  public void test_Method(){
    
  }
}