# Simplified Java Design patterns

- **Creational Design Patterns**
  - Singleton Pattern
  - Factory Pattern
  - Abstract Factory Pattern
  - Builder Pattern
  - Prototype Pattern
  
  
- **Structural Design Patterns**
  - Adapter Pattern
  - Composite Pattern
  - Proxy Pattern
  - Flyweight Pattern
  - Facade Pattern
  - Bridge Pattern
  - Decorator Pattern
     
- **Behavioral Design Patterns**
  - Template Method Pattern
  - Mediator Pattern
  - Chain of Responsibility Pattern
  - Observer Pattern
  - Strategy Pattern
  - Command Pattern
  - State Pattern
  - Visitor Pattern
  - Interpreter Pattern
  - Iterator Pattern
  - Memento Pattern

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


## 3. Strategy Patterns (Or, Policy Patterns)
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

## 4. Decorator Patterns

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


## 5. Observer Patterns

Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

In this pattern, there are many observers (objects) which are observing a particular subject (object). Observers are basically interested and want to be notified when there is a change made inside that subject. So, they register themselves to that subject. When they lose interest in the subject they simply unregister from the subject. Sometimes this model is also referred to as the Publisher-Subscriber model.



## 6. Visitor Patterns

Represent an operation to be performed on the elements of an object structure. The visitor pattern lets you define a new operation without changing the classes of the elements on which it operates.


This pattern helps us to add new functionalities to an existing object structure in such a way that the old structure remains unaffected by these changes. So, we can follow the open/close principle here (i.e., extension allowed but modification disallowed for entities like class, function, modules, etc.).

- Real-Life Example
Consider a taxi booking scenario. The taxi arrives at our defined location for the pickup. Once we enter into it, the visiting taxi takes control of the transportation. It can choose a different way toward our destination and we may or may not have any prior knowledge of that way.

Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class.

For example, think of a Shopping cart where we can add different type of items (Elements). When we click on checkout button, it calculates the total amount to be paid. Now we can have the calculation logic in item classes or we can move out this logic to another class using visitor pattern. Let’s implement this in our example of visitor pattern.


Example 1 - Customers Application.

We want to create a reporting module in our application to make statistics about a group of customers. The statistics should made very detailed so all the data related to the customer must be parsed. All the entities involved in this hierarchy must accept a visitor so the CustomerGroup, Customer, Order and Item are visitable objects.

In the example we can see the following actors:

IVisitor and IVisitable interfaces
CustomerGroup, Customer, Order and Item are all visitable classes. A CustomerGroup represents a group of customers, each Customer can have one or more orders and each order can have one ore more Items.
GeneralReport is a visitor class and implements the IVisitor interface.


1. As mentioned earlier, the visitor pattern is very useful for adding new operations without affecting the existing structure, which was the key aim behind this
pattern.
2. Visitor operations are controlled in a unified manner. 
3. On the other hand, the class encapsulation may need to be compromised when visitors are used. If the existing structure is really complex, the traversal
mechanism becomes complex.
4. The visitor hierarchy becomes difficult to maintain when we need to add new concrete classes to our existing architecture frequently (e.g., in our program, if
we now add Myclass2, we need to add additional operations in the visitor class hierarchy to support this pattern).
5. Sometimes we need to perform some unrelated operations on the objects in the existing architecture. But these operations can directly/indirectly affect the
classes in the system. In those situations, this pattern can help us by putting all of these operations in the visitor hierarchy.

## Memento Design Pattern
Memento design pattern is one of the behavioral design pattern. Memento design pattern is used when we want to save the state of an object so that we can restore later on. Memento pattern is used to implement this in such a way that the saved state data of the object is not accessible outside of the object, this protects the integrity of saved state data.

- Real-Life Example
One of the best real life example is the text editors where we can save it’s data anytime and use undo to restore it to previous saved state.

We will implement the same feature and provide a utility where we can write and save contents to a File anytime and we can restore it to last saved state. For simplicity, I will not use any IO operations to write data into file.



## Composite Design Pattern
Compose objects into tree structures to represent part-whole hierarchies. The composite pattern lets clients treat individual objects and compositions of objects uniformly.

### Component
is the abstraction for all components, including composite ones declares the interface for objects in the composition (optional) defines an interface for accessing a component's parent in the recursive structure, and implements it if that's appropriate
### Leaf
represents leaf objects in the composition implements all Component methods
### Composite
represents a composite Component (component having children) implements methods to manipulate children implements all Component methods, generally by delegating them to its children

![Composite pattern](https://github.com/rakeshpriyad/java-design-patterns/blob/master/src/test/composite.png)

### Advantages of Composite Patterns:
- The Composite pattern makes the client simple:
- Clients use the Component class interface to interact with objects in the composite structure.
- If call is made to a Leaf, the request is handled directly.
- If call is to a Composite, it forwards the request to its child components.

### Disadvantage:

- Once tree structure is defined, the composite design makes the tree overly general.
- In specific cases, it is difficult to restrict the components of the tree to only particular types. Therefore, to enforce such constraint, the program must rely on run-time checks, since it cannot use the type system the of programming language.




## Adapter Patterns
Convert the interface of a class into another interface that clients expect. The adapter pattern lets classes work together that couldn’t otherwise because of incompatible interfaces.


- Real–Life Example
The most common example of this type can be found with mobile charging devices. If our charger is not supported by a particular kind of switchboard, we need to use an adapter. Even the translator who is translating language for one person is following this pattern in real life.

We are having another interface AdvancedMediaPlayer and concrete classes implementing the AdvancedMediaPlayer interface. These classes can play vlc and mp4 format files.

We want to make AudioPlayer to play other formats as well. To attain this, we have created an adapter class MediaAdapter which implements the MediaPlayer interface and uses AdvancedMediaPlayer objects to play the required format.

AudioPlayer uses the adapter class MediaAdapter passing it the desired audio type without knowing the actual class which can play the desired format. AdapterPatternDemo, our demo class will use AudioPlayer class to play various formats.


Proxy Pattern :
Provide a surrogate or placeholder for another object to control access to it.

In a classroom, when one student is absent, during roll call, his best friend may try to mimic the student’s voice to try to keep his friend from being marked as absent.

What are the different types of proxies?
Mainly we are familiar with the following types:
- Remote proxies. They will hide that actual object which is in a different address space.
- Virtual proxies. They are used to perform optimization techniques like the creation of a heavy object on a demand basis.
- Protection proxies. They generally deal with different access rights.
- Smart reference. It can also perform some additional housekeeping work when an object is accessed.
A typical operation is counting the number of references to the actual object.



## Bridge Pattern

A Bridge Pattern says that just "decouple the functional abstraction from the implementation so that the two can vary independently".
The Bridge Pattern is also known as Handle or Body.

Here the :

Question :  Abstraction
JavaQuestion :Refined Abstraction
Question Manager: Implementor
QuestionFormat: 
Advantage of Bridge Pattern

![Composite pattern](https://github.com/rakeshpriyad/java-design-patterns/blob/master/src/test/bridge-pattern.jpg)

- It enables the separation of implementation from the interface.
- It improves the extensibility.
- It allows the hiding of implementation details from the client.

Usage of Bridge Pattern

- When you don't want a permanent binding between the functional abstraction and its implementation.
- When both the functional abstraction and its implementation need to extended using sub-classes.
- It is mostly used in those places where changes are made in the implementation does not affect the clients.
