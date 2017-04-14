# Simplified Java Design patterns

## 1. Command Design Pattern:

A Command Pattern says that "encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command".

Here requests are encapsulated as objects. In general, four terms are associated—invoker, client, command,
and receiver. A command object is capable of calling a particular method in the receiver. It stores the
parameters of the methods in receiver. An invoker only knows about the command interface, but it is
totally unware about the concrete commands. The client object holds the invoker object and the command
object(s). The client decides which of these commands needs to execute at a particular point in time. To do
that, he/she passes the command object to the invoker to execute that particular command


### The Command pattern has the following advantages:

i) It decouples the classes that invoke the operation from the object that knows how to execute the operation
ii) It allows you to create a sequence of commands by providing a queue system
iii) Extensions to add a new command is easy and can be done without changing the existing code
iv) You can also define a rollback system with the Command pattern.



### The following are the disadvantages of the Command pattern:

i) There are a high number of classes and objects working together to achieve a goal. Application developers need to be careful developing these classes correctly.
ii)Every individual command is a ConcreteCommand ...


### Usage of command pattern:

*It is used:*:

- When you need parameterize objects according to an action perform.
- When you need to create and execute requests at different times.
- When you need to support rollback, logging or transaction functionality.


## 2. Mediator Patterns
It define an object that encapsulates how a set of objects interacts. The mediator pattern
promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their
interaction independently.

A mediator is the one who takes the responsibility of communication among a group of objects. The
mediator acts as an intermediary who can track the communication between two objects. The other objects
in the system are also aware of this mediator and they know that if they need to communicate among
themselves, they need to go through the mediator. The advantage of using such a mediator is that we can
reduce the direct interconnections among the objects and thus lower the coupling.

Real-Life Example
In an airplane application, before taking off the flight undergoes a series of checks. These checks confirm
that all components/parts (which are dependent on each other) are in perfect condition.
Also, the pilot needs to communicate with the towers at the airport. In general, one pilot from one
airline will not communicate with another pilot from a different airline before taking off or landing
operations. Towers are acting as the mediator here.

### Advantages of Mdeiator Patterns

1. Now you should have a clear idea that this pattern is very useful when we observe
complex communications in the system. Communication (among objects) is
much simpler with this pattern.
2. This pattern reduces the number of subclasses in the system and it also enhances
the loose coupling in the system.
3. Here the “many-to-many” relationship is replaced with the “one-to-many”
relationship—which is much easier to read and understand.
4. We can provide a centralized control with this pattern.

### Disadvantages of Mediator Patterns:
1. Sometimes the encapsulation process becomes tricky and we find it difficult to
maintain or implement.
