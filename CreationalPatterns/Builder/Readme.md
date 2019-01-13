# Builder

Separate the construction of complex objects from their representation so that
the same construction can be used to create different representations.

_Version modified in confront of the one of the GoF_

## When to use it

* the algo for creating complex object should be independent of the parts that
make ii up, and how they are assembled.
* the construction process must allow different representations for the object
constructed.
* The object to build is complex.

## Characteristics

* The client retrieves the product from the builder.
* The builder adds part to the product.
* The creation of object is done step-by-step.

## Consequence

* It lets to hide the internal representation of the product, because the 
builder hides the representation, the structure of the product, and how it is
assembled.
* The builder is written once and can be used to create different variants
using the same parts.
* It gives more control on the construction phase.

### How it works

1. There is a central __Builder__ class, which contains all the attributes of
the object that we need to build.
2. There we may add validation, or some default value, or a constructor.
3. In the __Client__, we call it and set the various properties.
4. We may call _build()_ directly, to get the object, or create the Builder
and use it to create clones, or for smaller modifications.

