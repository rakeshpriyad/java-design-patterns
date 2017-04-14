#Simplified Java Design patterns

1. Command Design Pattern:

A Command Pattern says that "encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command".

Here requests are encapsulated as objects. In general, four terms are associated—invoker, client, command,
and receiver. A command object is capable of calling a particular method in the receiver. It stores the
parameters of the methods in receiver. An invoker only knows about the command interface, but it is
totally unware about the concrete commands. The client object holds the invoker object and the command
object(s). The client decides which of these commands needs to execute at a particular point in time. To do
that, he/she passes the command object to the invoker to execute that particular command


The Command pattern has the following advantages:

i) It decouples the classes that invoke the operation from the object that knows how to execute the operation
ii) It allows you to create a sequence of commands by providing a queue system
iii) Extensions to add a new command is easy and can be done without changing the existing code
iv) You can also define a rollback system with the Command pattern.



The following are the disadvantages of the Command pattern:

i) There are a high number of classes and objects working together to achieve a goal. Application developers need to be careful developing these classes correctly.
ii)Every individual command is a ConcreteCommand ...


Usage of command pattern:

It is used:

i) When you need parameterize objects according to an action perform.
ii) When you need to create and execute requests at different times.
iii) When you need to support rollback, logging or transaction functionality.