# AbstractFactory

Provides an interface for creating families of related or dependent objects 
without specifying their concrete classes.

## When to use it

* A system should be independent of how its products are created, composed, and
represented.
* A system should be configured with one of multiple families of products.
* A family of related product objects is designed to be used together, 
and we need to enforce this constraint.
* We want to provide a class library of products and we just want to reveal
the interface, not the implementation.

## Characteristics

* Normally, there is only a single instance of ConcreteFactory.
* AbstractFactory allows ConcreteFactory to create objects.
* The creation of objects is immediate.

## Consequence

* Client manipulates instances through interfaces, so the actual product classes
are isolated in the ConcreteFactory, they do not appear in the client code.
* It is easier to change the whole family of products if needed.
* Force the code to use only one family of products at one time
* If new products need to be added to interface we need to be careful.

### How it works

1. There is a central __AbstractFactory__ that is used to create specific 
objects using a parameter. 1 method for each interface of products is used, 2 in
this example.
2. A __ConcreteFactory__ actually implements the abstract methods and returns 
the specific objects.
3. __InterfaceProductA__ and __InterfaceProductB__ are the 2 families of objects
 that can be created in this example.
4. __ConcreteProductA*__ and __ConcreteProductB*__ are practical 
implementations.
5. __EnumProductA__ and __EnumProductB__ are just 2 enums used to decide which 
object needs to be created, it can be substituted by a string.
6. __Client__ is the actual main() class that uses the AbstractFactory to get
specific objects.

