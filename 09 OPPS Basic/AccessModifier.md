Access modifiers are keywords that specify the visibility of a class, method, variable, or constructor.
They limit the access of class, constructor, data member, and method in other classes.

There are four access modifiers in Java:

public

private

protected

default (package-private)

1️. public

The public access modifier is used to control the visibility of classes, methods, variables, and constructors.
When a member is declared as public, it can be accessed from any class, whether in the same package or different package.

2️. private

The private access modifier is used to control the visibility of class members (fields, methods, nested classes) within the same class.
When a member is declared as private, it can only be accessed inside the same class.
It cannot be accessed from outside the class, even in the same package.

3️. protected

The protected access modifier is accessible:

within the same class

within the same package

outside the package only through inheritance (subclass)

4️. default (package-private)

When no access modifier is specified for a class, method, or data member, it is called the default access modifier.
If we do not specify any access modifier, it is treated as default.
It is accessible only within the same package and cannot be accessed from outside the package.

✅ Non-Access Modifiers in Java

Non-access modifiers do not change the accessibility of classes, methods, constructors, or variables.
They change the behavior of classes, methods, and variables.

Non-access modifiers are:

final
static
abstract
transient
synchronized
native
volatile
strictfp

1️. final

The final modifier can be used with variables, methods, and classes.

If a variable is declared final, its value cannot be changed.

If a method is declared final, it cannot be overridden.

If a class is declared final, it cannot be inherited.

2️. static

The static modifier is used to make fields, methods, and classes static.

Static variables are class-level variables.

Static methods can be accessed without creating an object.

Static can be used to create nested classes.

3️. abstract

The abstract modifier is used with classes and methods.
An abstract class cannot be instantiated (object cannot be created).
An abstract method has no body and must be overridden in the subclass.

4️. transient

The transient modifier is used with variables.
It prevents variables from being serialized.
Transient variables are not saved during serialization.

5️. synchronized

The synchronized modifier is used with methods.

It is used in multithreading.

It allows only one thread to access a method at a time.

It prevents data inconsistency.

6️. native

The native modifier is used with methods.

It indicates that the method is implemented in another language like C or C++.

It is used in system-level programming.

7️. volatile

The volatile modifier is used with variables.

It ensures that the variable value is always read from main memory.

It is mainly used in multithreading to avoid inconsistency.

8️. strictfp

The strictfp modifier is used with classes and methods.

It ensures the same floating-point calculation result on all platforms.

It provides consistency in floating-point operations.