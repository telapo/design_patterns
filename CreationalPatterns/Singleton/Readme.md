# Singleton

Ensure a class only has one instance, and provide a global point of access to it.

## When to use it

* There must be exactly one instance accessible from well-known point.

## Consequence

* Access to instance can be controlled
* It can be easily extended to permit a variable number of instances.

## Characteristics

* Many patterns like Abstract Factory, Builder and Prototype.

### How it works

1. There is a __Singleton__ class, which has a private constructor, a static
field for the _instance_, and a public _getInstance()_ method to retrieve it.
2. The __Client__ calls the method and get always the same instance.

