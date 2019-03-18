# State

Allow an object to alter its behavior when its internal state changes. The obj
will appear to change its class.

## When to use it

* The behavior of an obj depends on its state, and it must change at runtime
depending on the state.
* The state depends on large multipart conditional statements. The State pattern
let's us put each branch in a new obj.

## Consequence

* New states and transitions can be added easily, since they are encapsulated
in an object.
* It makes state transitions explicit (they point to 2 different objects).
* State objects can be Singleton Flyweight objs, so they can be shared.

## Characteristics

* The class we are using will maintain a State obj to represent its current 
state. The latter will manage all the requests that are dependent on the state
of the obj.
* Context is the primary interface for clients.
* Context of ConcreteState subclasses can decide which state succeeds another
and under what circumstances.
* If criteria for transitions fixed, they can be defined in the Context. Otherwise,
the States may define themselves their successors.


### How it works

1. The __State__ interface defines the behavior that is dependent on the Context.
2. __StartState__ and __StopState__ are 2 concrete implementations of it.
3. __Context__ keeps a pointer to the current State and may define other properties.
4. __App__ is the Client obj that instantiate __Context__ and __States__ and 
calls Context dependent behaviors.
