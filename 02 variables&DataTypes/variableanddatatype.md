## data types
data type is used to specify which type of data is stored in variable

## 2 types of data type
1. Primitive data type
2. non primitive data type

1. Primitive data types
1. byte
2. ahort
3. int
4. long
5. double
6. float
7. char
8. boolean

2. non primitive data types
class ,interface , 

## variable 
variable is container which used to store the value

# there are three types of variable
1. local variable
2. static variable
3. instance variable


# rules
- name must start with a letter (a to z or A toZ,0 to 9), underscore(_), or dollar($) sign
- After first letter can use digit(0 to 9) for example value1
- java variable are case sensitive for example x andX are different variables
- varibale should not start with digits

1. local variable 
- we can declared local variable inside method or constructor or blocks
- scope of the local variable --> constructor and method and blocks
- it is mandatory to intialized the local variable
- stored memory --> stack 

2. instance variable 
- declared inside the class but outside the methods
- scope of instance variable --> inside the class all method and constructors and block
- memory allocated when object is created
- stored in heap memory
- intialization is not mandatory

3. static variable
- declared inside the class but outside of the method with static modifier
- when a variable is declared as static then a single copy of the variable is created and shared among all objects of class
- when .class file loading memory is allocated
- stored in non heap memory
- it is mandatory to intialized the static variable