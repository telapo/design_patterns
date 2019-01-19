# Bridge

Decouple an abstraction from its implementation so that the two can 
vary independently.

Inheritance binds an implementation to the abstraction permanently, this makes
difficult to modify both independently.

## When to use it

* We want to avoid a permanent binding between an abstraction and its 
implementation.
* Both the abstraction and the implementation should be changed without
impacting each other.
* There is a proliferation of classes,
* We want to share an implementation among multiple objects and this should
be hidden from the client.

## Consequence

* An implementation is not coupled permanently to an interface.
* Both the Abstraction and the Implementation hierarchies can be extended
independently.
* Clients are shielded from implementation details.

## Characteristics

* If there is only one implementation, it is not necessary to use this pattern,
unless we know the implementation could change and we want to avoid the clients
to be affected.
* _AbstractFactory_ can create and configure a _Bridge_.
* _Adapter_ is usually used to make unrelated classes to work together and it 
is usually applied when the system has been redesigned. _Bridge_ is used usually
up-front to let implementations and abstractions vary independently.

### How it works

1. We have 2 hierarchies, __Car__ and __Driver__ that we want to develop
independently.
2. __Driver__ represents the Abstraction, since it keeps a reference to the
__Car__ interface. _This reference is the BRIDGE_.
3. __John__ and __Paul__ are two concrete implementations of this hierarchy.
4. __Car__ is the Implementor hierarchy. __AudiCarImpl__ and __BMWCarImpl__
are two concrete implementations.
5. The latter are passed as arguments when building drivers.
6. __RichDriver__ shows how to extend one hierarchy without modifying the
other. __RichPaul__ is a concrete example.
