# Chain Of Responsibility

Avoid coupling the sender of a request to its receiver by giving more than one 
object a chance to handle the request. Chain the receiving objects and pass the 
request along the chain until an object handles it.

## When to use it

* When more than one obj may handle the request, and the handler is not known
a priori, but it is found automatically.
* We want to send a request without specifying the receiver.
* The sets of obj that can handle a request should be specified dynamically. 

## Consequence

* Less coupling, because the obj on the chain does not know the structure of 
the chain itself.
* More flexibility since the chain can be changed dynamically.
* There is no guarantee that that the request will be handled since there is
no explicit receiver.

## Characteristics

* An obj receives the request and either handles it or forwards it to the next
candidate on the chain.
* The client has no reference to the obj that will handle the request.
* The common interface on the chain handles requests and access the successor
on the chain.


### How it works

1. We have a __Client__ object in the App.java file, which instantiate the 
Chain controller, we then pass requests with different types and a message.
2. __ChainMaster__ is used to create the chain and to expose the method to
handle the requests.
3. __RequestHandler__ is the common abstract class to the various nodes of the
chain.
4. __OpenRequest__, __CloseRequest__, __ComputeRequest__ are the concrete 
implementations of the abstract class, and represent the nodes of the chain,
which actually handle the request. 
5. __Request__ is a message or request that is passed to the chain to be 
processed.
6. __RequestType__ represents the various kinds of requests available.
