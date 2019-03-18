# Strategy

Define a family of algorithms, encapsulate each one, and make them 
interchangeable. Strategy lets the algorithm vary independently from clients 
that use it.

## When to use it

* Many classes differ only in their behavior. Strategies allow to configure
a class with multiple behaviors.
* We need different variants of the same algo.
* The algo uses data that the client should not know about.
* A class defines multiple behaviors as conditional statements. Instead of them,
we can create Strategies from the various branches.

## Consequence

* It is easier to vary behaviors of Contexts.
* Less conditional statements for selecting behaviors.
* Clients must be aware of the different existing Strategies.
* There could be more objects, but they may be converted in Flyweight to control
their number.

## Characteristics

* It makes easier to provide new algorithms to vary behavior.
* A Context may pass all data required by Strategy as parameters, or pass itself.
* A Client usually creates a ConcreteStrategy, passes it to the Context, then
interacts only with this one.
* Context may have a default Strategy, and Clients need only to deal with 
other Strategies when they need something else.

### How it works

0. There are two versions of the implementation, one pre-Java 8 and one post 
Java-8.
_Pre-Java 8_
1. __Strategy__ is the interface common to all the algo. It defines the behavior
that has to be defined.
2. __StrategyAddImpl__, __StrategySubtractImpl__, __StrategyMultiplyImpl__,
are concrete implementations of the __Strategy__ interface. They represent the
various behaviors.
3. __Context__ receives a ConcreteStrategy, keeps a pointer to it, and the __Client__
calls the behavior on it.
_Post-Java 8_
1. __ValidationStrategy__ is the Java 8 strategy.
2. __ContextValidator__ is the Java 8 Context
3. The actual implementations of the Strategies are in the client, for example,  
    ```java
    ContextValidator numericValidator = new ContextValidator((String s) -> s.matches(" [a-z] + "));
    ```
It will create a new Context, with a Strategy that will match the pattern in the
String passed. The _execute()_ method of the Strategy is called in the _validate()_
one that is present in the Context  
    ```java
    numericValidator.validate("aaaa");
    ```
