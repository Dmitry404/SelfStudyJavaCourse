
1 . *The initialization order will be following:*
    - Static filed
    - Static initialization block
    - Constructor of the super class
    - Non-Static initialization block
    - Constructor of the inherited class

*Note:* Please see the prove in the ./src/Exercise_1.java

2 . The initialization order:

- Static variable in class "A"
- Static block in class "A"
- Static method main
- print "Hello World!".
- Static variable in class "B"
- Static block in class "B"
- Constructor "A" with a parameter (It was executed from Constructor B without parameters)
- Constructor "A" executes a method printVariable() from from class B that set value for "variable"  in class "B"
- Constructor "B"

If we delete the constructor A() we will get a compilation error.
It happens because constructor B(<String>) uses constructor A() indirectly.
If we don't use "super" with or without parameters directly then superclass's constructor without parameters will be executed by default.
To fix this issue we should add call of constructor A with parameter to constructor B with parameter.

3 . List here as many ways to create and initialize an array of two integers as you know.

- int[] a1 = {1,2};
- int[] a2 = a1;
- int[] a = new int[2];
- int[] a = new int[]{1,2};
- int[] a = new int[2]; a = new int[]{1,2};
- int[] a = new int[2]; for(int i = 0; i < a.length; i++){a[i] = i;}
- int[] a = new int[2]; a[0] = 1; a[1] = 2;

4 .  I changed the code below.

```java
     public static void main(String... args) {
         Entry[] entryArray = new Entry[10];
         for (int i = 0; i < 10; i++) {
             Entry entryTemp = new Entry();
             entryTemp.value = "str_" + i;
             entryArray[i] = entryTemp;
         }
         printArray(entryArray);
     }
```
*Note:* Please see a fix in the ./src/C.java

5 . Java doesn't have a special method to destroy object like a destructor in C++ (` ~<class_name>` ).
Java has a Garbage Collector. It should free unused memory automatically.
If a object isn't used (nothing has reference on it), GC will delete it automatically.
Also we can call gc manually, but it is a bad idea in general.

6 . We cannot rely on the `finalize` method. GC will call a finalize method before deleting object if class contains method finalize.
But we don't know when it happens exactly.  GC can never call method finalize in a few cases.
This method slows down the GC.

The method `finalze` can be used for :
- the verification on the termination condition.
- cleanup non-Java resources

7 . GC is a part of Java Memory Management. GC is the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects
 
8 . OS allocates the heap when JVM starts . This memory is managed by JVM while the program is running.
This has a couple of important ramifications:
- Object creation is faster because global synchronization with the operating system is not needed for every single object.
- When an object is no longer used, the garbage collector reclaims the underlying memory and reuses it for future object allocation

All objects are allocated on the heap area managed by the JVM.
As long as an object is being referenced, the JVM considers it alive.
Once an object is no longer referenced and therefore is not reachable by the application code, the garbage collector removes it and reclaims the unused memory.

GC process  can be described as follows:
- Step 1: Marking. GC checks all object trees and marks every object found as alive.
This can be a very time consuming process if all objects in a system must be scanned.
- Step 2: Deletion. All of the heap memory that is not occupied by marked objects is reclaimed. It is simply marked as free

9 . A Just-In-Time (JIT) compiler is a feature of the run-time interpreter, that instead of interpreting bytecode every time a method is invoked,
 will compile the bytecode into the machine code instructions of the running machine, and then invoke this object code instead.
 JVM can optimize a piece of code each time it is executed, so the more the code is executed, the faster it gets (This approach is used in HotSpot).



