# Mediator

Define an object that encapsulates how a set of objects interact. 
Mediator promotes loose coupling by keeping objects from referring to each 
other explicitly, and it lets you vary their interaction independently.

## When to use it

* Objs communicate in a well defined way, but that it is complex.
* It is difficult to reuse an obj because it refers to too many other objs.
* The behavior should be customizable without changing a lot of subclasses.

## Consequence

* The Mediator routes all the requests.
* It allows to subclass only the mediator to change the behavior.
* Objs can are decoupled and can be changed easily.
* It transforms many-to-many interactions in one-to-many.
* Mediator obj may become complex.

## Characteristics

* Behavior is encapsulated in a mediator obj that is responsible for controlling
and coordinating the interactions of objs. The mediator is an intermediary
that prevents objs to speak directly. The latter only know the mediator.
* Mediator is in one class so it can be changed or replaced by extending it
easily.
* Facade is different because it makes requests to the subsystem, but not vice
versa.
* The objs can communicate with the mediator using the Observer pattern.


### How it works

1. The __Mediator__ interface is defined. It has 2 methods related to this chat
example. One to add users, and another to send messages.
2. The __ConcreteMediator__ implements it. It keeps a list of objects that will
use it to communicate, and implements the methods above mentioned. It adds 
users, and sends messages (by calling the _receive()_ method on the 
ConcreteColleague objs).
3. The __ColleagueUserInterface__ represents the abstract class of all the 
Colleague objs. It represents users of the chat.
4. __ColleagueUser__ is the concrete implementation, which defines the _send()_
and _receive()_ methods.
5. The __App__ class is the __Client__, which instantiates the __Mediator__,
adds users to it, and then calls the _send()_ method.
