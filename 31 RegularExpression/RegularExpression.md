Regular expression (regex and regexp) is a powerful tool for pattern matching and manipulation of strings.

regular expression is an api to define a pattern for searching or manipulating strings

Pattern class:

1. The pattern class represnts a compiled version of a regular expression.
2. it is used to define a pattern fo regex
3. it does not have many constructor to create object . to get the object you can call its static method(compile)

example
Pattern pattern =Pattern.compile("regex_pattern")

Matcher class
Matcher class :

1. matcher class is used to perform match operations on a string using a precompiled pattern
2. to get the object you can call pattern object matcher method.

example:
Matcher matcher =pattern.matcher("input_string")
// methods
boolean matches():
it is used to test whether the regular expression matches the pattern.

1. public boolean find():
   finds the next expression that matches the pattern and it returns true if it is available . otherwise returns false.
2. public int start():
   it returns the starting index of the matched subsequence
3. public in end()
   it returns the ending index of the matched subsequence
4. public String group()
   it returns the matched subsequence
5. public int groupCount()
   it returns the total number of the matched subsequence

note:
Pattern

// character classes
abc: exactly this sequence of three letters
[abc]: any one of the letters a, b and c
[^abc]:any character except any one of the letters a,b,c
[a-z]: any lowercase alphabet symbol
[A-Z]: any uppercase alphabet symbol
[0-9]: any digits from 0 to 9
[a-z A-z]:any alphabet symbol
[a-z A-Z 0-9]: any alphnumeric symbol
[^a-z A-Z 0-9]: except alpha numeric symbol(special characters)
