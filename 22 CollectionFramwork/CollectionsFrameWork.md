collection frameWork represents a hierarchy of set of interface and classes that are used to manipulate group of objects .
Collection frameWork was added to java 1.2 version.

Collection frameWork is contained in java.util package . it provides many important classes and interfaces to collect and organize group of objects.

what is collection
Collection in java be referred to an object that collets multiple elements into a single unit . it is used to store fetch and manipulate data.

// interface

1. collection
2. list
3. set
4. SortedSet
5. NavigableSet
6. Queue
7. Map
8. SortedMap
9. NavigableSet

# List

1. ArrayList
2. LinkedList
3. Stack
4. Vector

List interface is part of the java collection framework . it is located in the java.util package . it extends the collection interface and represents an ordered collections of elements that allows duplicates . the elements in a list are sorted in a sequence , and each element is assigned a unique index (starting from 0)

### methods

1. add(E element): it is used to insert an element in collection
2. add(int index,E element) : inserts the specified element at the specified position in the list
3. addAll(Collection<? extends E>) : it is used to insert the specified collection elements in the invoking collection.
4. remove(Object obj): it is used delete an element from the collection
5. remove(int index): Removes the element at the specified position in the list.
6. get(int index): returns the element at the specified position in the list
7. set(int index, E element): Replaces the element at the specified position in list with specified element
8. indexOf(Object obj): returns the index of the first occurrence of the specified element in the list.
9. size() returns the number of elements in the list.
10. isEMpty() : returns true if list contains no element
11. contains(Object obj): returns true if the list contains the specified element
12. clear(): Removes all the elements from the list.

### ArrayList class:

- ArrayList class uses a dynamic array for storing the elements . it is like an array, but there is no size limit. we can add or remove elements anytime. so it is mch mre flexible than the traditional array. it is present in the java.util package.

- ArrayList in java can have the duplicate element also . it implements the list interface so we can use all the methods of the list interface.
- ArrayList maintains the insertion order internally

# constructor of ArrayList:

ArrayList l=new ArrayList()
its create an empty arrayList object with default initial capacity 10, once arrayList reaches max capacity then a new ArrayList object will be created with new capacity=(current capacity\*3/2)+1=16

# LinkedList class in java

LinkedList class provides implementation of linked-list data structure.
it used doubly linked list to store the elements . it implements list,deque and Queue interface and extends AbstractSequentialList class. it is part of the java.util package

1. it allows null entry.
2. it is dynamic in nature operations can be easily implemented.
3. it can contain duplicate elements and it is not synchronized .
4. Reverse Traversing is difficult in linked list
5. in LinkedList , manipulation is fast because no shifting needs to occurred

#### methods

1. void addFirst(Object o): it inserts the given element at the beginning of the list
2. void addLast(Object o): it appends the given element to the end of a list.
3. Object getFirst(): it returns the first element in a list.
4. Object getLast(): it returns the last element in a list.
5. Object removeFirst(): it removes and returns the first element from a list.
6. Object removeLast() : it removes and returns the last element from a list.
7. Object set(int index,object) it replaces the element at the specified position in a list with the specified element.
