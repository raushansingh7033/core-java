# JAVA 8 Features

### JAVA 8 : default & static Methods in interface

1. what is default and static methods in interface
   <br/>
2. Importance of default methods in interfaces
   <br/>
3. What is Backward Compatibility with default Methods
   <br/>
4. Use cases of default methods.
   <br/>
5. importance of static method in interfaces
   <br/>
6. difference between default and static methods
   <br/>
7. Predefined default/static methods from interfaces

````## JAVA 8 Features

### JAVA 8: default & static Methods in interface

1. What is default and static methods in interface

   * Default Methods: methods with body inside interface using `default` keyword; can be inherited or overridden.
   * Static Methods: methods with `static` keyword; belong to interface, called via interface name.

2. Importance of default methods in interfaces

   * Add new methods to interface without breaking existing implementations.
   * Reduce boilerplate code.

3. Backward Compatibility with default Methods

   * Before Java 8, adding a method to interface breaks all implementing classes.
   * Default methods provide body, keeping backward compatibility.

4. Use cases of default methods

   * Provide common behavior like logging, utility functions.
   * Multiple interface inheritance.

5. Importance of static methods in interfaces

   * Utility/helper methods related to interface.
   * Cannot be overridden.
   * Called using interface name.

6. Difference between default and static methods

| Feature     | Default Method  | Static Method   |
| ----------- | --------------- | --------------- |
| Declaration | default keyword | static keyword  |
| Called on   | Object of class | Interface name  |
| Overridable | Yes             | No              |
| Inheritance | Yes             | No              |
| Use Case    | Common behavior | Utility methods |

7. Predefined default/static methods from interfaces

   * `List.forEach()`, `Map.getOrDefault()` → default methods
   * `Collections.sort()`, `Stream.of()`, `Comparator.comparing()` → static methods

---

### Syntax Evolution

Until Java 7:

```java
interface MyInterface {
    // only abstract methods
}
````

Java 8 onwards:

```java
interface MyInterface {
    // abstract methods
    // default methods
    // static methods
}
```

---

### Interfaces and Classes with Explanations

#### InterfaceOne.java

```java
public interface InterfaceOne {
    void printNames();
    String getNames();

    default void deafultMethodOne() {
        System.out.println("Inside Default Method One..");
    }

    default String deafultMethodTwo() {
        System.out.println("Inside Default Method Two..");
        return "deafultMethodTwo";
    }

    default void defaultMethodFive() {
        System.out.println("Inside InterfaceOne: defaultMethodFive");
    }

    static String staticMethodOne() {
        System.out.println("This is static methodOne");
        return "This is static method";
    }

    static void staticMethodTwo() {
        System.out.println("This is static Method Two");
    }
}
```

#### InterfaceTwo.java

```java
public interface InterfaceTwo {
    default void defaultMethoThree() {
        System.out.println("Inside InterfaceTwo: defaultMethodThree...");
    }

    default void defaultMethodFive() {
        System.out.println("Inside InterfaceTwo: defaultMethodFive");
    }
}
```

#### ClassOne.java

```java
public class ClassOne implements InterfaceOne {
    @Override
    public void printNames() {
        System.out.println("Printing names");
    }

    @Override
    public String getNames() {
        System.out.println("getting names");
        return "default Method";
    }

    @Override
    public void deafultMethodOne() {
        System.out.println("ClassOne overrides defaultMethodOne from InterfaceOne");
    }
}
```

#### ClassTwo.java

```java
public class ClassTwo implements InterfaceOne {
    @Override
    public void printNames() {
       System.out.println("in classTwo: printNames");
    }

    @Override
    public String getNames() {
        System.out.println("Getting names in ClassTwo");
        return null;
    }
}
```

#### ClassThree.java

```java
public class ClassThree implements InterfaceOne, InterfaceTwo {
    @Override
    public void printNames() {}

    @Override
    public String getNames() { return null; }

    @Override
    public void defaultMethodFive() {
        InterfaceOne.super.defaultMethodFive();
        InterfaceTwo.super.defaultMethodFive();
    }
}
```

#### ClassFour.java

```java
public class ClassFour implements InterfaceOne {
    @Override
    public void printNames() {
        System.out.println("This is ClassFour: printNames");
    }

    @Override
    public String getNames() {
        System.out.println("This is ClassFour: getNames");
        return "This is ClassFour: getNames";
    }
}
```

#### TestingDefaultMethods.java

```java
public class TestingDefaultMethods {
    public static void main(String args[]) {
        ClassOne one = new ClassOne();
        one.deafultMethodOne();
        one.deafultMethodTwo();
        one.printNames();
        one.getNames();

        ClassTwo two = new ClassTwo();
        two.deafultMethodOne();
        two.deafultMethodTwo();
        two.printNames();
        two.getNames();

        ClassThree three = new ClassThree();
        three.defaultMethodFive();
        three.defaultMethoThree();

        InterfaceOne.staticMethodOne();
        InterfaceOne.staticMethodTwo();
    }
}
```

**Expected Output:**

```
Inside Default Method One..
Inside Default Method Two..
Printing names
getting names
Inside Default Method One..
Inside Default Method Two..
in classTwo: printNames
Getting names in ClassTwo
Inside InterfaceOne: defaultMethodFive
Inside InterfaceTwo: defaultMethodFive
Inside InterfaceTwo: defaultMethodThree...
This is static methodOne
This is static Method Two
```

---

This markdown file contains:

- Explanation points
- Syntax evolution
- All interfaces and classes
- Test class and expected output

```
until java 7,
interface {
  // only abstract method
}
```

```
java 8 onwards
interface {
  //abstract methods
  //default methods
  // static methods
}
```

### Functional Interface & Lambda Expressions:

1. What is Functional Interface

- An interface which contains Only one abstract Methods
- 1: abstract Method :only 1 abstract method
- N: default method
- N: static methods
- SAM: single abstract method

```
interface
  @FunctionalInterface
  One{
  m1();
  m2(); // compile time error
  }

  @FunctionalInterface
  One{
  }// compile time error


  @FunctionalInterface
  One{
   m1();
  }

```

  <br/>

2. Importance and Implementation of Functional Interface
   <br/>
3. What is Lambda Expression

- single Functionality implementation
  -Implementing Single Abstract method of functional interface and we are creating an instance of an implementation

Syntaxes:

1. Method with parameter >1
   (parameter names)->{
   code block
   };

2. Method with No parameters=0  
   ()->{
   code block
   }
   <br/>
3. Relation Between Functional Interface and Lambda Expressions
   <br/>
4. What is Functional Programming
   <br/>
5. What is declarative Programming

# Java 8 Functional Interface & Lambda Expressions

## 1. Functional Interface

A **Functional Interface** is an interface that contains **only one abstract method**.  
It can also have:

- N default methods
- N static methods

**SAM (Single Abstract Method):** The only abstract method in the functional interface.

### Example:

```java
// Compile-time error: More than one abstract method
@FunctionalInterface
interface One {
    void m1();
    void m2(); //  Error
}

// Compile-time error: No abstract method
@FunctionalInterface
interface Two {
} //  Error

// Valid Functional Interface
@FunctionalInterface
interface Three {
    void m1(); //  Single abstract method
}
```

---

## 2. Importance and Implementation of Functional Interface

- Enables **functional programming** in Java.
- Serves as a target for **lambda expressions**, **method references**, or **anonymous classes**.
- Makes code **concise** and **readable**.

---

## 3. Lambda Expressions

Lambda expressions provide a way to **implement a single abstract method** of a functional interface **inline**, without creating a separate implementation class.

### Syntax:

1. **No parameters:**

```java
() -> {
    System.out.println("No parameters");
};
```

2. **With parameters:**

```java
(parameter1, parameter2) -> {
    // code block
};
```

---

## 4. Relation Between Functional Interface and Lambda Expressions

- Lambda expressions can **instantiate a functional interface**.
- Each lambda expression corresponds to the **implementation of the abstract method** of the functional interface.

---

## 5. Functional Programming

- Focuses on **what to do** rather than **how to do it**.
- Promotes **immutable data** and **stateless functions**.

---

## 6. Declarative Programming

- Programming paradigm where we **declare logic** without describing control flow.
- Example: SQL, Java Streams, Lambda expressions.

---

## 7. Example: Functional Interface

```java
package com.training.java8.features;

@FunctionalInterface
public interface Calculate {
    // Only one abstract method
    void printName();

    // Default methods
    default void methodDefaultOne() {
        System.out.println("this is default method");
    }

    default void methodDefaultTwo() {
        System.out.println("this is default method");
    }

    // Static method
    static void methodStaticOne() {
        System.out.println("This is static method");
    }
}
```

---

## 8. Implementing Functional Interface

```java
package com.training.java8.features;

public class Camel implements Calculate {
    @Override
    public void printName() {
        System.out.println("This is Camel class implementation");
    }
}
```

---

## 9. Using Functional Interface & Lambda Expressions

```java
package com.training.java8.features;

public class Demo {
    public static void main(String[] args) {
        // Interface referring to implementation class
        Calculate calc = new Camel();
        calc.printName();

        // Lambda Expression Implementation
        Calculate abc = () -> {
            System.out.println("This is Abc company calc");
        };
        Calculate xyz = () -> {
            System.out.println("This is XYZ company calc");
        };

        abc.printName();
        xyz.printName();
    }
}
```

**Output:**

```
This is Camel class implementation
This is Abc company calc
This is XYZ company calc
```

---

## 10. Functional Interface with Parameters

```java
package com.training.java8.features.params;

@FunctionalInterface
public interface ClacOperations {
    double opertaion(int a, int b);

    default void printInfo() {
        System.out.println("This is default data.. of method");
    }

    static void typeOfOpertions() {
        System.out.println("Static content: Arithmetic Operations");
    }
}
```

---

### Example Usage

```java
package com.training.java8.features.params;

public class FunctionalInterfaceWithParamsDemo {

    public static void main(String[] args) {
        // 1st lambda expression: Addition
        ClacOperations addition = (int x, int y) -> {
            System.out.println("Values are: " + x + "," + y);
            return x + y;
        };
        System.out.println(addition.opertaion(30, 40));

        // 2nd lambda expression: Subtraction
        ClacOperations substraction = (p, q) -> {
            return p - q;
        };
        System.out.println(substraction.opertaion(100, 50));

        // 3rd lambda expression: Multiplication
        ClacOperations multiplication = (p, q) -> p * q;
        System.out.println(multiplication.opertaion(20, 20));

        // Execute default method
        multiplication.printInfo();

        // Execute static method
        ClacOperations.typeOfOpertions();
    }
}
```

**Output:**

```
Values are: 30,40
70.0
50.0
400.0
This is default data.. of method
Static content: Arithmetic Operations
```

---

## 11. Extending Interfaces Without Abstract Methods

```java
package com.training.java8.features.params;

public interface ClaculateInterfaceWithoutAbstractMethod {
    default void printInfo() {
        System.out.println("This is default data.. of method");
    }

    static void typeOfOpertions() {
        System.out.println("Static content: Arithmetic Operations");
    }
}

@FunctionalInterface
public interface ClacOperations extends ClaculateInterfaceWithoutAbstractMethod {
    double opertaion(int a, int b);
}
```
## Method Reference in java:

- What is Method reference
- Method reference v/s Lambda Expression
- Types of Method Reference with Example
- Use case Of method reference

- Method reference are a special type of lambda expression
- :: ->method reference delimiter
- Class Name/instance reference ::methodName
- 4types
- 1. reference to static methods
     ClassName::methodName
  - the method which is referred should be matched to method signature of FI abstract method
- reference to instance methods
  - Accessing instance method with class name
  - on condition
  - the method which we are referring from any class,that method should not contain any method arguments and the same method should contains same return type of abstract method which defined in side Functional Interface
- reference to instance methods of arbitrary object of given type
- reference to constructors
- make sure abstract method parameters are part of constructor definition w.r.to order and type

# Method Reference in Java

### Employee.java

```java
package com.training.method.references;

public class Employee {

    private int id;
    private String name;
    private String gender;
    private double salary;

    // static method
    static boolean validateEmpdetails(Employee employee) {
        if(employee.getId()!=0&&employee.getName()!=null)
            return true;
        return false;
    }
    // non-static method/instance method
     boolean validateEmpdetails2(Employee employee) {
        if(employee.getId()!=0&&employee.getName()!=null)
            return true;
        return false;
    }
    boolean validSalary() {
        return this.getSalary()>0?true:false;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
```

### ConverToUpperCase.java

```java
package com.training.method.references;

@FunctionalInterface
public interface ConverToUpperCase {

    String convertToUppercase(String value);
}
```

### MethodRefrencesDemo.java

```java
package com.training.method.references;

public class MethodRefrencesDemo {

    public static void main(String[] args) {
        ConverToUpperCase toUpperCase=(value)->{
            System.out.println("Inside lambada notation converting into uppercase");
            return value.toUpperCase();
        };
        System.out.println(toUpperCase.convertToUppercase("java method refrenxce "));

        // method references
        // re -using/executing a pre defined method from String class
        // assigning that method reference of class
        ConverToUpperCase uppercaseTwo=String::toUpperCase;
        System.out.println(uppercaseTwo.convertToUppercase("java method refrences"));
    }

}
```

### MethodReferenceDemo.java

```java
package com.training.method.references;

import java.util.Arrays;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        // static method :Class  named
        EmployeeValidation validEmployee=Employee::validateEmpdetails;
        //create Instance for the class where the method is located
        Employee e=new Employee();
        EmployeeValidation valEmployeeValidation=e::validateEmpdetails2;
        // validating Employee details
        Employee emp1=new Employee();
        System.out.println(validEmployee.isValidEmployee(emp1));
        Employee emp2=new Employee();
        emp2.setId(123);
        emp2.setName("Raushan Singh");
        emp2.setGender("Male");
        emp2.setSalary(5000);
        System.out.println(validEmployee.isValidEmployee(emp2));
        System.out.println(valEmployeeValidation.isValidEmployee(emp2));
        // access instance method with class name also
        EmployeeValidation valEmployeeValidation2=Employee::validSalary;
        System.out.println(valEmployeeValidation2.isValidEmployee(emp2));
        String[] values= {"Raushan","java","Spring","Methods"};
         Arrays.sort(values, (o1,o2)->o1.compareToIgnoreCase(o2) );
        for(String str:values) {
            System.out.println(str);
        }
    }

}
```

### EmployeeValidation.java

```java
package com.training.method.references;
@FunctionalInterface
public interface EmployeeValidation {

    boolean isValidEmployee(Employee employee);
}
```

### ConstructorDemo.java

```java
package com.training.method.references;

public class ConstructorDemo {
    public static void main(String args[]) {
        GetEmployeeInstance employee=Employee::new;
        Employee emp = employee.getEmployee(10, "Raushan Singh");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
```

### GetEmployeeInstance.java

```java
package com.training.method.references;
@FunctionalInterface
public interface GetEmployeeInstance {

    Employee getEmployee(int id,String name);
}
```

