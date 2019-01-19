# Composite

Compose objects into tree structures to represent part-whole hierarchies. 
Composite lets clients treat individual objects and compositions of objects 
uniformly.

## When to use it

* We want to represent part-whole hierarchies of objects.
* We want clients to be able to ignore differences between compositions of
objects and individual objects. So, clients will treat objects or composite
of them in the same way (leaf or non leaf objects).

## Consequence

* Wherever a client expects a primitive object it can also take a composite one.
* clients do not usually know if they dealing with a leaf or a composite
component.
* It is easier to add new components, since the client does not know to which
kind of object is dealing with.

## Characteristics

* The key is an abstract class that represents both primitives and their 
containers. Composite or simple objects are treated in the same way.
* The choice of the data structure used in the composite object to keep the
children is just dependent on efficiency.
* Parent often used in Chain or Responsibility.
* Decorator often used with Composite.
* Iterator can be used to traverse composites.

### How it works

1. We a Component abstract class, __Shop__, which is used for lead objects, 
__Butcher__ and __Drugstore__. It provides some classical methods like _add()_,
_remove()_, and _getChild()_, useful for the Composite object, plus others 
that are domain specific like _printShopName()_.
2. __ShoppingCenter__ is the Composite object, it implements __Shop__, and 
keeps a collection of __Shop__ inside. It overrides all the methods.
3. The __Client__ uses the abstract class __Shop__ to reference the single
objects as well as the Composite. All the methods can be called on both.
