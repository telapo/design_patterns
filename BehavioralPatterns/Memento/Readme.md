# Memento

Without violating encapsulation, capture and externalize an object's internal 
state so that the object can be restored to this state later.

## When to use it

* A snapshot of an obj's state needs to be saved to be restored later.
* A direct interface to get the sate will expose implementation and break the
encapsulation.

## Consequence

* It preserve encapsulation boundaries.
* It simplifies the Originator.
* It can be implemented by storing only incremental changes, if they are passed
back from the Caretaker to the Originator in a predictable order.

## Characteristics

* A Caretaker requests a Memento from an Originator and holds it for a time,
and passes it back to the Originator (if it needs to revert).
* Mementos are passive, only the Originator will assign and retrieve its state.
* Commands can use mementos to maintain states for undoable operations.


### How it works

1. The __Originator__ is the obj that we are interested in. We want to preserve
its state without exposing it. It has two methods to create a Memento 
_saveStateToMemento()_, which is a way to save a snapshot, and _getStateFromMemento()_,
which is used to restore the state from a memento obj.
2. The __Memento__ obj simply stores the state of the __Originator__.
3. __Caretaker__ keeps a list of all the previous states (__Memento__ objs)
that needs to be preserved.
4. The __Client__ creates the __Originator__ and the __Caretaker__ and then 
modifies the state as well as restores it.
