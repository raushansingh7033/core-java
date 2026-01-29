## Predefined Functional Interface

- 1. Importance of User or pre Defined Functional Interfaces.
- 2. Functional Interface of packages java.util.function in java
  - Function
  - Predicate
  - Consumer
  - Supplier
- 3. Use cases and Examples of above Functional Interface types.

### Function :

- Takes one argument of any type and returns a value of same/any type
- Essentially , it represent a function that transform an input of type into an output type R

- R apply(T t)
- default<V> Function<T,V>andThen(Function<? super R,? extends v>after)
- String value
- 1. is it null or not : Null check :Function
- 2. if not null, to upper case : Null,Enter valid value : Function
- 3. i/p :Raushan Singh: Func1 and then Func2
- static<T>Function<T,T>identity():
- Where a function is required but no changes should be applied

## Predicate :

- condition
