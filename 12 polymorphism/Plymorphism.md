Polymorphism is a concept by which we can perform a single action in different ways
on person at the same time can have different behavior is known polymorphism

polymorphism is derievd from 2 greeks words poly and morphsim
the word "poly" means many and morphism means forms

1. compile time polymorphism
2. Run time polymorphism

3. compile time polymorphism :
   compile time polymorphism is a process in which the method is called at compile time

method overloading allows a class to have multiple methods with the same name but different parameter lists. the compiler determines which method to invoke based on the method signature , and it is resolved at compile time

2. Runtime polymorphism
   runtime polymorphism is process in which a call to an overridden method is resolved at run time is called runtime polymorphism

in runtime polymorphism the method is executed at run-time , which may lead to slower execution

Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass when a subclass provides an implementation for a method that is already present in its superclass it is called method overriding

rules :

1. method name must be same for both parent and child classes
2. access modifier of child method must not restrictive than parent class method
3. private , final and static methods cannot be overridden
   there must be IS-A relationship between class(inheritance)
