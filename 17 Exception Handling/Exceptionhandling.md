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

2. unChecked exception or runtime exception

- the exceptions which are not checked and it directly handled by JVM is called unchecked exception
- unchecked exceptions occur at runtime

# handle the exception by using try-catch blocks
try and catch both are java keywords and used for exception handling. the try block is used to enclose the suspected code risky code is a code that arise an exception during program execution

# try with multiple catch blocks
 multiple catch blocks to handle different types of exceptions that may be thrown in a try block. Each catch block is associated with a specific exception type.

 or
A try block can have multiple catch blocks . multiple catch blocs are used to catch different type of executions
 