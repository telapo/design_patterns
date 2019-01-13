# Factory Method

Define an interface for creating an object, but let subclasses decide which 
class to instantiate. Factory Method lets a class defer instantiation to 
subclasses.

## When to use it

* A class does not know the type of objects it will create.
* A class wants that its subclasses will decide the type of the objects created.

## Consequence

* The code only deals with the interface, without binding to specific classes.
* Creating object inside a factory method is more flexible than creating it
directly.

## Characteristics

* By subclassing it is possible to extend the type of objects created.

### How it works

1. There is an interface common to all the possible objects created, __Products__
here.
2. There are concrete implementations of it, __Product*__ in the example.
3. There is a __Creator__ interface, which defines the _factoryMethod()_, and 
returns the __Products__ interface type. It may also have a default implementation!
4. A concrete __ConcreteCreator__ implements the interface, and actually
returns the correct object.
5. __Client__ is just an example of how to use them.

