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

### Real-Life Example 
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


# Strategy Patterns (Or, Policy Patterns)
It define a family of algorithms, encapsulate each one, and make them interchangeable. The
strategy pattern lets the algorithm vary independently from client to client.

We can select the behavior of an algorithm dynamically at runtime.

### Real–Life Example
In a football match, at the last moment, in general, if Team A is leading Team B by a score of 1-0, instead of
attacking, Team A becomes defensive. On the other hand, Team B goes for an all-out attack to score


### Advantages of using Strategy Pattern

- Using encapsulation the algorithm separately, new algorithms complying with the same interface can be easily introduced.
- The strategy pattern application can switch strategies at run-time.
- Strategy enables the clients to choose the required algorithm, without using a "switch" statement or a series of "if-else" statements.
- Data structures used for implementing the algorithm is completely encapsulated in Strategy classes. Therefore, the implementation of an algorithm can be changed without affecting the Context class.
- The same Strategy object can be strategically shared between different Context objects. However, the shared Strategy object should not maintain states across invocations.

### Disadvantages of using Strategy Pattern

- The application must be aware of all the strategies to select the right one for the right situation.
- Strategy and Context classes may be tightly coupled. The Context must supply the relevant data to the Strategy for implementing the algorithm and sometimes, all the data passed by the Context may not be relevant to all the Concrete Strategies.
- Context and the Strategy classes normally communicate through the interface specified by the abstract Strategy base class. Strategy base class must expose interface for all the required behaviors, which some concrete Strategy classes might not implement.
- The application configures the Context with the required Strategy object. Therefore, the application needs to create and maintain two objects in place of one.
- Since, the Strategy object is created by the application in most cases; the Context has no control on lifetime of the Strategy object. However, the Context can make a local copy of the Strategy object. But, this increases the memory requirement and has a sure performance impact.

## Decorator Patterns

This patterns allow to attach additional responsibilities to an object dynamically. Decorators provide a flexible
alternative to subclassing for extending functionality.


This main principle of this pattern says that we cannot modify existing functionalities but we can extend
them. In other words, this pattern is open for extension but closed for modification. The core concept
applies when we want to add some specific functionalities to some specific object instead of to the
whole class.

### Real-Life Example
Suppose you already own a house. Now you have decided to add an additional floor. Obviously, you do not
want to change the architecture of ground floor (or existing floors). You may want to change the design of the
architecture for the newly added floor without affecting the existing architecture for existing floor(s).


### What are the main advantages of using decorator patterns?
1. Without disturbing existing objects in the system, we can add new functionality to a particular object.
2. We can code incrementally. For example, we’ll make a simple class first and then one by one we can add decorator objects to them as needed. As a result, we do
not need to take care of each and every possible scenario in the beginning. On the other hand, we must acknowledge that making a complex class first and then
extending its functionality is a much more complex procedure.

### How is this pattern different from inheritance?
We can add or remove responsibilities by simply attaching or detaching decorators. But with the simple inheritance technique, we need to create a new class for new responsibilities. So, there will be many classes inside the system, which in turn can make the system complex.

- What is the major disadvantage of using this pattern?
First of all, if we are careful enough, there is no significant disadvantage. But if we create too many decorators in the system, the system will be hard to maintain and debug. At the same time, the decorators can create unnecessary confusion.
