# Iterator

Provide a way to access the elements of an aggregate object sequentially without 
exposing its underlying representation.

## When to use it

* We need to access an aggregate object without exposing its structure.
* To support multiple traversal.
* To provide a uniform interface for traversing different data structures. 

## Consequence

* Iterators allow easy change of the traversal algorithm.

## Characteristics

* The responsibility to access and travers a list is put in an Iterator obj,
instead of being kept in the list itself.
* We may make the list responsible to create its own iterator.
* A ConcreteIterator can keep track of the current object in the data structure
and compute the succeeding obj in the traversal.
* The algorithm can also be stored in the data structure and the Iterator can
just be a pointer to the current element + other state.
* An Iterator must be robust and not fail if the data structure is modified 
during the traversal.
* Factory methods are used to create iterators when they are polymorphic.
* Memento is often used with the Iterator to capture the state of the iteration.


### How it works

1. We have a __Client__ object in the App.java file, which instantiate the
Data Structure and then using the Iterator traverses it.
2. __Iterator__ is the interface implemented by __NameIterator__, which
actually does the traversal.
3. __Container__ is the other interface that is implemented by the Data 
Structure and returns an Iterator to the Client.
