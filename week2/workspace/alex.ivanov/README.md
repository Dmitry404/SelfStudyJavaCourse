1. How do you understand the "reference" term? Is it true that Java passes everything by reference?

 This is a way of keeping in touch with the object. You need to use reference in case you want to do anything with an object. It is some value that enable you to indirect access to data (object) stored somewhere in memory. Yes.

2. What types of storage do you know? Please list them with a short description of each storage type. What types of storage does Java support?
  - Registers – fastest storage. Since it exist inside the processor.
  - The stack – lives in RAM, but has support from processor via stack pointer.
  - The heap – general purpose pool of memory. Located in RAM, where all Java objects live. 
  - Constant storage – Constant value are often located in ROM
  - Non RAM storage – for data that should be saved outside of program.
3. What is the difference between a "method" and a "function"? List the fundamental parts of a method.

 There is no difference between “method” and “function” except syntactic difference. Method just a function that belongs to class.
The fundamental parts of a method are the name, the arguments, the return type and the body.

4. What identifies a Java method?

 You can identify a method name because it is always followed by left and right parentheses, which may enclose arguments (parameters).
objectName.methodName(arg1, arg2, arg3);
 
5. There is the "signature of the method" term. What does it mean?

 The method name and argument list (which is called the signature of the method) uniquely identify that method.

6. What are the situations where you would use the "static" keyword?

 There are two situation then you need to use keyword “static”:

  - if you want to have only one piece of storage for data, regardless of how many objects of this class created
  - if you need a method which is not associated with any objects of this class. Meaning you can call method even if no object is created

7. What will be the output of the Java program below? Explain why?

       public class Main {

       public static void main(String[] args) {
        Foo a = new Foo("a");
        Foo b = new Foo("b");

        System.out.format("Before the swap method: %s, %s\n", a, b);
        swap(a, b);
        System.out.format("After the swap method: %s, %s\n", a, b);
       }

       public static void swap(Foo a, Foo b) {
        Foo c = a;
        a = b;
        b = c;

        System.out.format("Inside the swap method: %s, %s\n", a, b);
       }

       static class Foo {
        public String contains;

        public Foo(String contains) {
            this.contains = contains;
        }

        @Override
        public String toString() {
            return "Foo{" +
                    "contains='" + contains + '\'' +
                    '}';
        }
       }

       }

 ```Before the swap method: Foo{contains='a'}, Foo{contains='b'}```
 ```Inside the swap method: Foo{contains='b'}, Foo{contains='a'}```
 ```After the swap method: Foo{contains='a'}, Foo{contains='b'}```

 Because of the scope. This determines both the visibility and lifetime of the names defined within that scope.
Inside the swap function, we switch a and b, but once we go out swap it returned back.