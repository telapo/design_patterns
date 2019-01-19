# Adapter

Convert the interface of a class into another interface the clients expect. 
Adapter lets classes work together that couldn't otherwise because of 
incompatible interfaces.

## When to use it

* We want to use and existing class, but its interface does not match the one
that we need.
* We want to create a reusable class that cooperates with unrelated ones. They 
are unrelated because they have incompatible interfaces.
* We need to use many existing subclasses, but instead of wrapping them in many
adapters, we create one for the parent object.
* _most of the applications using third party libraries use adapters as a middle 
layer between the application and the 3rd party library to decouple the 
application from the library. If another library has to be used only an adapter 
for the new library is required without having to change the application code._

## Consequence

* The amount of work required depends on how similar the adaptee and the target
interface are.

## Characteristics

* We should try to narrow the interface of the adaptee to only those operations
that we require.

### How it works

1. We have 2 incompatible interfaces, __Car__ and __Motorbike__.
2. The __Driver__ class only implements one of them, and we would like to use it
also to do the actions of the other one. __Driver__ has a public constructor
that takes an object that implements the __Car__ interface!
3. __MotorbikeAdapter__ is the Adapter, and it implements __Car__, it contains
an instance of __Motorbike__, and when the method overrides __Car__, it actually
calls the method from __Motorbike__.
2. The __Client__ creates the __Driver__ and passes to it an instance of 
__MotorbikeAdapter__.

