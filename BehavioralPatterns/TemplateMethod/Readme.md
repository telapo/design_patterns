# Template Method

Define the skeleton of an algorithm in an operation, deferring some steps to 
subclasses. Template method lets subclasses redefine certain steps of an 
algorithm without changing the algorithm's structure.

## When to use it

* we need to implement the invariant parts of an algo once and leave the subclasses
to implement the other parts of it.
* We want to avoid code duplication. We find the differences in code, and then
separate them in new operations. They are then replaces with template methods
that call one of those operations.
* To limit what can be extended.

## Consequence

* It minimize the number of operations that need to be implemented in subclasses,
since they are defined in the template.
* Factory Methods are often called by template methods.
* Template Methods use Inheritance to vary part of an algorithm.

## Characteristics

* It defines an algo in terms of abstract operations that needs to be 
implemented.
* Favorites code reuse.
* It is important to define which operations can be overriden and which are 
abstract operations.

### How it works

1. The __Client__ class is __App__, which instantiates the 2 __ConcreteClass__,
and then call the _play()_ method on them. The method is the algorithm, whose
parts are defined by the 3 methods.
2. __Game__ is the Abstract Class, it defines the template of an algorithm, 
in the _play()_ method (the template method). It is final so it cannot be 
overridden. Furthermore, it defines the 3 methods that need to be 
implemented in Concrete Classes, and are the 3 steps that made up the algo.
3. __Cricket__ and __Football__ are two concrete classes that implement the 3
step methods.
