*1. How do you understand the "reference" term? Is it true that Java passes everything by reference?*
The reference contains only address in the memory. The data is located at the address.

*2. What types of storage do you know? Please list them with a short description of each storage type. What types of storage does Java support?*
- Registers - the fastest storage that is placed in the processor.

- The stack - the area in the RAM. The stack pointer is moved down to create new memory and moved up to release that memory. It contains values of primitive data type and references. The stack size cannot be changed during execution of program. The default value for HotSpot = 1Mb.

- The heap - the pool of memory that also is located in the RAM area. It contains objects. The heap behavior is differ from stack. The compiler doesn't need to know how long that data must stay on the heap.
The heap can change its size during execution of program. The heap is slower than stack, but it is more flexible.

- Constant storage - it contains constant values that can never change. There are placed classes and static variables.

- Non-RAM storage - the data that placed completely outside a program, for example: files, DBs, network etc.
 
*3. What is the difference between a "method" and a "function"? List the fundamental parts of a method.*

The term function is used to describe a named subroutine.
Method is a part of class. The method can be called only for the object if the method exists in the class (the object is the instance of the class)
Each method has fundamental parts: name, return type, argument list, method body.

*4. What identifies a Java method? *
The signature of the method uniquely identify that method.
 
*5. There is the "signature of the method" term. What does it mean?*
The signature of the method is the unique identifier of method.
It contains the method name and argument list.

*6. What are the situations where you would use the "static" keyword?*

The first (Static field) - if you want to have only a single piece of storage for a particular field, regardless of how many objects of that class are created. We can get access to a static field  even if we have no object of the class.

The second (Static method) - if we need method that isn't associated with any particular object of the class. We can call static method even if we have no object of the class.

The third (static class) - this is nested class that used by the outer class. The nested class can use only static fileds and methods.

The foth (static import) - Static import in Java allows to import static members of class and use them
Example: 
```java
import static java.lang.Math.*;
...
System.out.println("PI="+PI);
```

The fifth (static initializer) - This is method that can initialize static fields. The static initializer is executed when the class is loading.
Example:
```java
class test {
    static int counter;
    static {
        counter=0;
    }    
}
```

*7. What will be the output of the Java program below? Explain why?*

The program will output:
```java
Before the swap method: Foo{contains='a'}, Foo{contains='b'}
Inside the swap method: Foo{contains='b'}, Foo{contains='a'}
After the swap method: Foo{contains='a'}, Foo{contains='b'}
```
We have variables "a" and "b" in the method main.
When we call method swap we get new variables "a" and "b".
They contain the same references as "a" and "b" in the method main.
Scope of a variables in the method swap are limited by method's area.
I.e. We have two variables "a" in the stack that have the same value (reference) and they point to the same data in the heap.
This is actual for variable "b" too.

The method "swap" change values of variables (references)  "a" and "b" that are limited by method's area.
These variables will be deleted from the stack when the method "swap"  has been finished.
We do nothing with variables that are placed in the main method.

We can do some changes in data, that are placed in the heap. In this case we will see the updated data.


=============================== This part is not finished yet ===============================

After you answer the questions above, please do some exercises. There are a few simple rules:  

1. Take notice that you must compile and run all exercises in this lesson using terminal

2. You should provide the results as *.java files which you ought to place along with the file with the answers

Exercises:

1. Write a program that demonstrates default values for both instance and local variables (in case of compilation error, describe what's wrong there using comments).

2. Write a program that demonstrates how you could use the "static" keyword.
  
3. Write a program that demonstrated the lifecycle of a Java object.

> In additional you might want to do some extra exercises that can be found at the end of the chapter we learn every week. 
> It's not required, however, it would be a good chance to have more practice in writing Java programs. 
> Those additional exercises you could place to a folder that should be under your workspace folder.
> Please give a name to this folder, for instance, it could be "extra" or any name you'd like to use.

Regards