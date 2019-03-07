# Command

Encapsulate a request as an object, thereby letting you parameterize clients 
with different requests, queue or log requests, and support undoable operations.

_It adds a layer between the Command and the Receiver. The layer is the 
TextFileInvoker (Invoker)._

## When to use it

* When we want to parameterize objs by an action to perform; these objs
represents actions that can executed at a later time.
* We want to specify, queue, and execute requests at a different times. The 
Command obj can have a lifetime different from the original request.
* It may support undo. The operations can be stored in a history, to be undo at 
a later time; it needs an additional method called unexecute().
* Changes can be logged so that they can be reapplied in case of a system crash.
It usually needs store() and load() operations.

## Consequence

* The Command decouples the object that invokes the operation from the obj
that knows how to perform it.
* Commands can be extended.
* Commands can be assembled into a composite command.
* New Commands can be added easily.

## Characteristics

* Let's transform requests to objects, which can be then transferred around.
* It usually includes an execute() method.
* The receiver obj has the knowledge to carry out the request.
* The Command can be able to not use the receiver and fullfil the request on
its own, or bind the receiver and actions, or anything in between.
* A Memento can keep the states required by the command to implement the undo.

## Collaborations

* The client create a ConcreteCommand and specifies its receiver.
* An Invoker stores the ConcreteCommand obj.
* The Invoker issues a request by calling execute() on the ConcreteCommand.
* The ConcreteCommand invokes operations on the receiver to carry out the
request.

### How it works

1. We have a __Client__ object in the App.java file, which uses the __Invoker__
obj, it passes to it a __ConcreteCommand__, and sets its Receiver.
2. The __Invoker__ (__TextFileInvoker__) asks the __Command__ to carry out the
request.
3. __TextFileOperation__ is the __Command__ interface, which declares the
_execute()_ method.
4. The actual operation executed depends by the __ConcreteCommand__ _execute()_
implementation.
