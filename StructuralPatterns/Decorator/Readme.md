# Decorator

Attach additional responsibilities to an object dynamically. 
Decorators provide a flexible alternative to subclassing for extending 
functionality.

## When to use it

* We want to add responsibilities without affecting other objects, so 
transpoarently.
* We want to add responsibilities, but those can be removed without issues.
* Subclassing could cause an explosion of classes, because a large number of
them is possible.

## Consequence

* Decorators are more flexible than using inheritance.
* There are usually a lot of little objects in systems that use Decorators.

## Characteristics

* Decorators add responsibilities to an object to to the whole class.
* Clients cannot tell the difference between a decorated and non-decorated
object, so they do not depend on it.
* A decorator forward requests to its Component object, and potentially add
new operations before or after it.
* If the Component (main interface) needs to also store data it is better to
use Strategy as well, because Decorator could be too costly.
* Adapter changes interface of object, while Decorator only adds 
responsibilities.
* A decorator is not used for object aggregation like a Composite.
* Strategy goes deeper in changing one object.


### How it works

1. We a Component interface called __Soldato__, which is the one that represents
the objects that can have their responsibilities extended.
2. We define a simple ConcreteComponent, which is a simple implementation
without any additional responsibility, __SimpleSoldato__.
3. The Decorator object keeps a reference to an object using the interface 
__Soldato__, and implements the interface. It then adds additional 
responsibilities.
