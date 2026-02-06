# File Handling

file handling is a way to carry out read and write operations on a file .
it is present in java.io.package which enabling us to work with different file formats.

# file handling operations

creating a new file
writing in a file
reading an existing file
deleting a file

1. file class
2. fileWriter class
3. fileReader class
4. bufferedReader class
5. BufferedWriter class
6. PrintWriter class

// file handling methods

1. createNewFile()
2. mkdir()
3. write()
4. read()
5. delete()
6. exists()
7. length()
8. list()
9. getName()
10. getAbsolutePath()
11. renameTO()

# File Class

File class is java's representation of a file or directory path name
example

# fileWriter Class

fileWriter class to write character data to a file.
FileWriter class is used with its write() method to write some content

# FileReader class

FileReader Class is a class in java.io package which is used to read a stream of characters from the files.
read() method returns a single character in the form of integer value that contain the character's char value . it return -1

the hasNextLine() method checks to see if there's another line in the input of the scanner object , no matter if the line is blank or not

nextLine() is a method in the java Scanner class that returns a line of text that is read from the scanner object.

# BufferedWriter class

BufferedWriter class is a part of the java.io package and it is used for efficient writing of characters to a file
writes text to a character output stream , buffering characters so as to provide for the efficient writing of single characters , arrays and strings
the buffer size may be specified or the default size may be accepted. the default is large for most purposes .

// BufferedWriter (Writer Obj)
creates a buffered character-output stream that uses a default-size output buffer
BufferedWriter(Writer obj,int size):
creates a buffered character output stream that uses an output buffer of the given size.
example

// BufferedReader class
BufferedReader class is used to read the text from a character based input stream. it can be used to read data line by line by readLine() method.
//constructor
BufferedReader(Reader obj)
creates a buffered character-input stream uses a default-size input buffer
BufferedReader(Reader Obj,int size):
Creates a buffered character-input stream that uses an input buffer of the specified size.



# PrintWriter class  
PrintWriter class is a part of the java.lang package which is used for writing formatted text to a file.
it is an extension of the writer class and provides convient methods for writing various data types in a human readable format.

PrintWriter is a class used any form of data eg . int, float ,double string or object in the form of text either on the console or in a file in java.

example
int a=97


//method