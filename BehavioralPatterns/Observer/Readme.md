# Observer

Define a one-to-many dependency between objects so that when one object changes 
state, all its dependents are notified and updated automatically.

## When to use it

* A change in one obj requires changing others, and we do not know how many
we need to change.
* We want to not tightly couple an obj and all the ones that it needs to notify.

## Consequence

* The Subject does not know the concrete class of any observer.
* The communication from the subject does not need to specify an observer,
all of them are notified.

## Characteristics

* A Subject can have any number of Observers, which are updated when a change
of state happens in the Subject.
* The Subject and the Observers can vary independently.
* Observers can be added without modifying the Subject or other Observers.
* It is possible to observe more than one subject.
* The update can be triggered after a change of state in the subject, or the 
observers have to query for it from time to time.
* Deleting a subject should not leave dangling references.
* Update protocols:
    - push model, subject sends detailed info about change (ok, if subject 
knows observers)
    - pull model, subject send minimal info, and observers has to query for the
rest (ok, if subject does not know observers)
* It is possible to register observers only for specific events.
* _A ChangeManager obj can be put between the subject and the observer, if their
relationship is complex. It keeps mapping between subjects and observers, it
defines special update strategies, it updates on request of subject. It is often
an instance of Mediator and it is a Singleton_.


### How it works

0. There are two implementations proposed, both based on Java inheritance.
1. __SubjectNewsAgency__ is the Subject object, which extends the __Observable__
interface. It has only one method defined in this example, when a news arrives,
it updates the state, marks it as changed (provided method), and notify the
observers (other provided method).
2. __ObserverNewsChannel__ is the Observer, and it implements __Observer__. It
has to override _update()_ in order to do something when the Subject changes.
1. __SubjectChangeManager__ is another Subject approach. It works by keeping
a reference to a __PropertyChangeSupport__ object. The latter can add and remove
listeners, and trigger an update when _firePropertyChange()_ is called.
2. __ObserverNewsChannelWithChangeManager__ is an implementation of __PropertyChangeListener__
 and is an observer. When _propertyChange()_ is called by the subject, something
is done.
3. __App__ is the Client and uses both implementations.
