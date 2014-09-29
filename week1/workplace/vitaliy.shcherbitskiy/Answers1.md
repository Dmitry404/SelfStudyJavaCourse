1. Kay says that everything is an object that can communicate with other objects. 
Objects have data in them. There are different classes or kinds of objects called types. 
Communication standard between objects of same class is the same.

2. Every object belongg to a certain class that in fact means data type.

3. Object has two types of entities in it: properties and methods. 
Properties give an idea of object qualities. 
Methods are actions that object can perform.

4. Interface is a set of properties and methods that are available within the object of a particular class.
Class cats and object of that class called cat has property woolen skin that can be yellow or black and it has
method mow() that produces sound of a cat.

5. Every object has some usefullness and can be reused by others on the basis of his capabilities.
If an object can raply react on demands of other objects it is called cohesiveness.

6. Hiden implementation means that other data types can see only interface of a class and cannot change implementation. 
In other words they can use elements of an object outside of a class that have public specifier. 
Private elements are available within a class and protected to inherited classes.
Default means availability stretches towards packaged classes' elements.

7. Composition relationship between two classes happens when one class simply is a member of another  bigger one.
That is why it is called has  relationship because bigger has smaller in it.
Inheritance means is realtionship when new class has functions of base one or a member of its family but in addition 
can implement new methods or override (re-implement) old ones. Composites are more flexible and can be changed at run-time.
Inherited reflect chnages in base on its children. It is more complicated and cannot be modified at run-time.

8. Is-like relationship happens when inherited class extends functionality of base one. It adds more properties and methods. 
So once we want to substitute base with child we find that its interface is different. But it is possible because it includes elements of base interface.
At times design dictates changes in the structure of base class when it cannot maintain required functionality.

9. Polymorphism means that inherited classes can behave differently or have overriden methods from base class but calls of that method are the same.
Example: class fishes has method swim() and subclasses dolphins and whales also have this method. We can call it on child and it will be dynamically at run-time executed
with proper method implementation befitting particular type. It is called late binding when run-time calls particular method to execute depending on value of type it gets at run-time.

10. Upcating meanse that derived type passed into method expecting base type but can handle it properly. As in above example we can pass whale type into swim () method defined in base 
fishes class and Java at run-time will upcast whale type to fishes type and call on it swim method.
Downcasting means passing base types to methods of defined in child classes. It may cause exception since we don't know at run-time what type child method can accept. Example:
if we define within dolphin class method swimwithmen() and pass to it fishes object it may happen that this method will be called on whale  type that cannot be.