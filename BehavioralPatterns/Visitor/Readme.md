# Visitor

Represent an operation to be performed on the elements of an object structure. 
Visitor lets you define a new operation without changing the classes of the 
elements on which it operates.

## When to use it

* We have an obj structure that contains nodes with different interfaces and we
want to do operations on them depending on their concrete classes.
* Many unrelated operations need to be performed on objs in an obj structure, 
and we do not want to pollute the classes with them. The Visitor will package
those operations.
* If the obj structure does not change, but we often want to define new 
operations that need to be performed on it.

## Consequence

* The node usually supplies itself as argument to the visitor to let it access
its state and do the operation.
* Adding new operations is easy, just add new visitors.
* Adding new nodes types is complex.
* The obj structure is usually responsible for the iteration between objs.

## Characteristics

* The operations that need to be executed on each element of the obj structure
are packaged in a Visitor element that is then passed to each element to execute
it.
* There are 2 class hierarchies, one for he nodes, and one for the operations
on them (the visitors).
* A Visitor can visit objs that do not have the same parent.
* A Visitor can accumulate state as it traverses the obj structure.
* Visitors can be used to visit a structure defined by the Composite pattern.
* A Visitor may do the interpretation in the Interpreter pattern.

### How it works

1. The __Client__ class is __App__, which instantiates the obj structure, 
__Computer__ and passes it the ConcreteVisitor, __VisitorImpl__ using the 
_accept()_ method.
2. __Visitor__ is the interface of the Visitor hierarchy, and it declares one
_visit()_ method for each ConcreteElement class.
3. __VisitorImpl__ is its concrete implementation, and takes care of implementing
the operation of _visit()_ for each ConcreteElement.
4. The __Node__ interface is the Element, which represents the nodes in the
obj structure. It defines the _accept()_ method that takes the Visitor.
5. __Mouse__, __Keyboard__ and __Monitor__ are the objs that implement the __Node__
interface, and they are the elements of the obj structure. They _accept()_ the
Visitor obj, and then call the _visit()_ method passing itself as argument.
6. __Computer__ is the obj ObjectStructure which represents a group of nodes. It
knows how to traverse the structure in its _accept()_ method.
