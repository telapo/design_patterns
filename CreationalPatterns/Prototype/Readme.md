# Prototype

Specify the kinds of objects to create using a prototypical instance, and 
create new objects by copying this prototype.

## When to use it

* The classes to be instantiated are specified at runtime.
* To avoid building a hierarchy of factories.
* Instances can have one of only a few combination of state.
* When instantiation is more expensive than cloning.

## Consequence

* It is more flexible to add new products to a system. It is just necessary
to implement the interface.
* Less subclassing.
* Cloning may be difficult.

## Characteristics

* We may use a PrototypeManager to retrieve already defined prototypes from a
map, using a key, and then clone them.

### How it works

1. There are two ways. In the first, __ProductA__, we implemented the Java 
defined __Cloneable__ interface. Then, override its _clone()_ method.
2. The second way is to define an interface, __Prototype__, with a _clone()_ 
method, and implement it in the __ProductB__.
3. In the __Client__, we can see that their usage is similar.

