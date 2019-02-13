# Facade

Provide a unified interface to a set of interfaces in a subsystem. 
Facade defines a higher-level interface that makes the subsystem easier to use.

## When to use it

* We want to provide a simple interface to a complex subsytem. It is usually
good enough for most clients, the others can use the more specific ones.
* There are many dependencies between clients and implementation classes of
an interface. The facade will decouple the subsystem from clients and other 
subsystem, so they can be independent and portable.
* A facade can act as an entry point for each group of subsystem that we choose.
Subsystems can communicate between them through their facades.
* _Simplify the interface for the common case._

## Consequence

* Reduce dependencies between subsystems by providing a single interface to
them instead of multiple ones.
* Subsystem become easier to use, because clients only interact with the facade.
* The subsystem can change since they are now independent.

## Characteristics

* Clients communicate with the subsystem through the facade, which forwards them
to the right objects
* Clients that use a facade do not have direct access to the subsystem.
* AbstracFactory can be used to provide an interface to create subsystem
objects in an independent way. It can also substitute the facade directly.
* A facade does not add any functionality to the system.
* It is usually a singleton.


### How it works

1. We a Component called __CompanyFacade__ that allows us to use the two
subsystems for Blue and White Collars.
2. The interfaces __BlueCollarAbstract__ and __WhiteCollarAbstract__ represent
the two subsystems. They have also two concrete implementations.
3. In the main class, we call methods defined in the interface, which are actually
routed to the two subsystems.
