# Proxy

Provide a surrogate or placeholder for another object to control access to it.

## When to use it

* We need to have a more versatile reference to an object.
* We need to reference an object in another address space.
* We need to create an expensive object on demand.
* We need to control the access to an object, with different rights.
* We need to perform additional operations other than keeping a pointer to an
object (counting references, loading an object the first time it is referenced,
check the object is locked before accessing it).
* Implement logging
* Facilitate network connection

## Consequence

* A proxy provides the same interface of the referenced obj, while an adapter
a different one.
* A proxy control access to an obj, but a decorator adds more responsibilities.

## Characteristics

* A Proxy can be used to control access to the real obj, and to defer the cost
of the creation.
* A proxy keeps a reference to the real obj to forward requests to it.


### How it works

1. We have a Component called __Caveau__, which is the interface that is common
to the real object and the proxy.
2. __BankCaveau__ is the real object.
3. __CaveauProxy__ is the proxy object, which acts as an access control object,
by limiting the number of accesses to the __BankCaveau__ of the __Personnel__
object (only needed to represent the resource whose access is limited).
4. __App__ is the client object that uses the proxy.
