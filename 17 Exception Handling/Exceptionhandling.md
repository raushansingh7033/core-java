1. Exception
   types of exception
1. checked exception or compile time exception
1. unchecked exception or run time exception
1. error

try
catch
finally
throw
throws

1. using try catch
2. using throws

Exception
an exception is a event that occur during the execution of a program and disrupts the normal flow of instructions . when an exceptional situation arises, such as an error or an unexpected condition , an object representing that exception is created
this object contains information about the error including its type and the state of the program at the time the error occurred

1. abnormal termination
2. rest of the code will not executed

types

1. checked exception or compile time exception

- the exceptions which are checked by compiler for easily execution of the program at the runtime is called checked exceptions
- checked exceptions occur at compile time
  eg SQLException IO Exception
- Checked exceptions happen at compile time when the source code is transformed into an executable code.

2. unChecked exception or runtime exception

- the exceptions which are not checked and it directly handled by JVM is called unchecked exception
- unchecked exceptions occur at runtime
- Unchecked exceptions happen at runtime when the executable program starts running.

# handle the exception by using try-catch blocks

try and catch both are java keywords and used for exception handling. the try block is used to enclose the suspected code risky code is a code that arise an exception during program execution

# try with multiple catch blocks

multiple catch blocks to handle different types of exceptions that may be thrown in a try block. Each catch block is associated with a specific exception type.

or
A try block can have multiple catch blocks . multiple catch blocs are used to catch different type of executions

# Pipe Symbol(|)

a single catch block has the posibility to handle multiple exceptions by seprating each with | (pipe symbol) in the catch

or

the pipe symbol (|) is used in multi-catch exception handling . multi-catch allows you to catch multiple types of exceptions in a single catch block.
the symbol is used to separate the different exception types within the catch block

it was introduced in java 7
try{

}catch(Exceptiontype1 | ExceptionType2)
{

}

a try inside another try block is called nested try block
Nested try block is used when a part of a block may cause one error while entire may cause another error
try{
Exception : may or may not occur
try{
Exception : may or may not occur
}catch(Exception_name ref_name){
handling code
}
}catch(Exception_name ref_name){
handling code
}

# finally

finally keyword is used in association with a try-catch block to define a block of code that will be always executed whether an exception is thrown or not.
the finally block is always executed whether an exception is handle or not

syntax
try{
code that may throw an exception
}catch(Exception_name ref_name){
handling code
}finally{
code that will always be executed , regardless of whether an exception occured or not
}

# throw

throw keyword is used to throw the user-defined or customized exception object to the jvm explicitly

or

throw keyword is used to explicitly throw an exception . an exception is an event that occurs during the execution of a program and disrupts the normal flow of instructions . when a method encounters a situation that it can not handle , it can throw an exception using the throw keyword

# throws

throws keyword is used in method declarations to indicate that the method might throw one or more specified exceptions .
when a method include a throws clause, it means that method is not handling the specified exceptions itself but instead ,it is declaring that it might throw these exceptions and the responsibility of handling them is delegated to calling code.

void methodName () throws ExceptionTyoe1,ExceptionType2,...{
// method implemeantion
}

# toString()

toString() method is standaard method of the throwable class,which is the base class for all exceptions . the toString() method returns a string representation of the object and it will print class name of the exception and detailed message

# getMessage()

getMessage() method is part of throwable class. the getMessage() method returns a detailed message about the exception
example

# printStackTrace()

printStackTrace()
printStacktrace() method is a part of the throwable class, which is the base class for all the exceptions . it is used to print the stack trace of the exception to the standard error stram(typically that console). the stack trace includes information about the call hierarchy that led to the point where the exception was thrown
