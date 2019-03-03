# Flyweight

Use sharing to support large numbers of fine-grained objects efficiently.

## When to use it

* An app uses a great number of objs
* Storage costs are high because of the quantity of objs
* Most states can be made extrinsic
* Many objs can be replaced by few shared objs with extrinsic states

## Consequence

* Costs can be added to compute or retrieve extrinsic states, but space
savings are also introduced.
* Clients should not instantiate f. objs directly, but retrieve them from a 
factory.

## Characteristics

* Flyweight object can be used in may contexts simultaneously.
* F. obj have an intrinsic state that is internal to the obj and can be shared,
and an extrinsic which is provided by the client and is context dependent.
* F. are often present in a pool of objs that can be shared in different
contexts.
* It is often used with the Composite pattern to implement graphs or 
hierarchical structures with shared nodes.
* Intrinsic state is stored in the ConcreteFlyweight obj, extrinsic state is
stored or computed in the Client obj, which is then passed as params to the 
f. obj.

### How it works

1. We have a Component called __FlyweightFactory__ that is used to create the
various Flyweight Concrete Implementations, __AspirinDrug__, __AntibioticDrug__,
__ParacetamolDrug__. All the objs are kept in a map, so if they already exist, 
they are simply retrieved, otherwise they are instantiated for the first time.
The key that we pass is the extrinsic state.
2. We have an interface for the various Flyweight objs, __Drug__.
3. Finally, we have the Client object, __App__, which uses the factory, and then
calls the same method on all them. The reply depends on the intrinsic state
of the various Flyweight objs.
