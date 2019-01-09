# Creational Patterns

They are used to make a system independent of how its objects are created or
composed.

## AbstractFactory

Provides an interface for creating families of related or dependent objects 
without specifying their concrete classes.

### How it works

1. There is a central AbstractFactory that is used to create specific objects 
using a parameter. 1 method for each interface of products is used, 2 in
this example.
2. A ConcreteFactory actually implements the abstract methods and returns the
specific objects.
3. InterfaceProductA and InterfaceProductB are the 2 families of objects that
can be created in this example.
4. ConcreteProdcutA* and ConcreteProductB* are practical implementations.
5. EnumProductA and EnumProductB are just 2 enums used to decide which object
needs to be created, it can be substituted by a string.
6. Client is the actual main() class that uses the AbstractFactory to get
specific objects.

