A String is an object that represents a sequence of characters. the string class in java is part of the java.lang package and is widely used in java programming for handling text data.
Strings are imutable meaning their values cannot be changed once they created when you modify a string a new String object is created

String is an object that represents sequnce of characters in java .
string is representing by string class which is locatd into java.lang package string ojects are immutable that means once a string object is created it cannot be changed

there are two way to create object in string 
1. using a string literal 
 String literal is simple string enclosed in double quotes " " a string literal is treated as string object

2. using new keyword
we can create a new string object using new operator that allocated memory for the object

Note : Each time we create a string litral,jvm checks the string pool first if the string literal already exists in the pool a refrence to the pool instance is returned
if string does not exist in the pool a new string object is created and is placed in the pool
string objects are stored in special memory area known as string constant pool inside the heap memory area

String methods

# equals() : this method is used to compares two strings for equality

it is used to comparison of values in the objects
syntax is,
boolean equals(Object str)

example
String s1="raushan"
String s2=new String("Raushan")
boolean b=s1.equals(s2);
System.out.println(b) // true

# == operator

The double equal (==) operator compares two object refreence to check whether they refer to same instance . this also will return true on successful match else return false
it is used reference comparison or address comparison (both objects are pointing to the same memory location)

String s1="Raushan"
String s2=new String("Raushan")
boolean b=s1==s2; //false
System.out.printl(b1)
String s3="Raushan"
boolean b2=s1==s3;//true
System.out.println(b2)

# compareTo() method

String comapreTo() method compares values and returns an integer value which tell
if the string compared is less than equal to or greater than the other string .
it compares the string based on natural ordering i.e alphabetically
syntax:
in compareTo(String str);
String s1="Raushan"
String s2="Raushan"
int b=s1.compareTo(s2);
System.out.println(b)
String s3="raushan";
int c= s1.comapreTo(s3)

'A' = 65, 'a' = 97, '0' = 48

# String class functions

1. charAt() method
2. equalsIgnoreCase() method
3. indexOf() method

4. length() method
5. replace() method
6. substring() method

7. toLowerCase() method
8. toUpperCase() method
9. valuesOf()

10. toString()
11. trim()
12. contains()

13. endsWith()
14. getBytes()
15. getChars()

16. isEmpty()
17. join()
18. startWith()

# interview question

19. wap to count number of vowels in string
20. wap to accept a code which is contains only digits from 0 to 9 and decodes in character
21. wap first alphabet of each word must be changed to uppercase and all remaining alphabets to lower case
22. wap to print the reverse of given string in java
23. wap to check whether a string is a palindrome
24. wap find duplicates characters in string
25. wap find first repeated character in string
26. wap to count occurence of char in java string
27. wap to remove duplicates from string
28. wap convert float to string in java

---

# charAt() method

String charAt() functions returns the character located at specified index
example

String s1="java";
System.out.println(s1.charAt(2)); //v

# equalsIgnoreCase()

String equalsIgnoreCase() determines the equality of strings ,ignoring their (upper or lower case doesn't matter with this method)
example
String s1="java";
boolean b1=s1.equalsIgnoreCase("JAVA");
System.out.println(b1);

# indexOf() method

String indexOf() method returns the index of first occurrence of a substring or a character .

String s1="java";
System.out.println(s1.indexOf(v)); //2
System.out.println(s1.lastIndexOf('a'))//3

---

# length()

this method is used to find number of characters in string
String java="I love java";
int number=java.length();
System.out.println(number)

# replace()

replace(char searchChar,char newChar)

String replcae() method replaces occurances of character with a specified new character.

example
String java="I love java";
System.out.println('i','I');

# subString() method

String subString() method returns a part of the string .
substring() method has two override methods

1. public String subString(int begin)
2. public nString substring(int brgin,int end);

String java="i love java";
System.out.println(java.substring(4));
System.out.println(java.substring(4,8)); //ve j

---

# toLowerCase()
this method is used to convert all the characters in a given string to lowercase
syntax
String toLowerCase()
example

String name="RAUSHAN SINGH"
System.out.println(name.toLowerCAse())

# toUpperCase()

this method is used to convert all the characters in a given string to uppercase

syntax
String toUpperCase()
Example
String name="raushan singh"
System.out.println(name.toUpperCase())

# valueOf() method

String class uses overloaded version of valueOf() method for all primitive data and for type Object

# Note valueOf() function is used to convert primitive data types into strings

example
int a=30;
String s1=String.valueOf(a);
System.out.println(s1);
System.out.println(s1.getClass());

--

# trim() method

this method return a string from which any leading and trailing whitespaces has been removed

example

String name=" Raushan Singh "
System.out.println(name.trim())

# contains() method

String contains() method is used the sequence of characters in the given string. it returns true if a sequence of string is found else it returns false

example
String name=" Raushan Singh "
boolean b=name.contains("Raushan")

# endsWith() method

string endsWith() method is used to check wether the string ends with the given suffix or not it returns true when suffix matches the string else it retuens false

example

String name=" Raushan Singh "
boolean b=name.endsWith("Raushan")

# isEmpty()

String isEmpty() method is used to check whether string is empty or not
example

String name=" Raushan Singh "
boolean b=name.isEmpty();

# join()

String jpoin() method is used to join strings with given delimiter
the given delimiter is copied with each element
Example
String fname="Raushan"
String lname="Singh"
System.out.println(String.join(":",fname,lname))

# startsWith() method
String startsWith()
String startsWith() is a string method in java. it is used to check wether the given string starts with given prefix or not . it returns true when prefix matches the string else it returns false;

example
String name="Raushan Singh"
boolean b=name.startWith("Raushan");
