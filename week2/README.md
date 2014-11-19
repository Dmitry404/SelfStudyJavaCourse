Hey!

You're still here, so, let's continue with new tasks. 

In the book you should read the next chapter - “Everything Is an Object” (pages 61 - 91). After you’ve done, answer the following questions:

1. How do you understand the "reference" term? Is it true that Java passes everything by reference?

2. What types of storage do you know? Please list them with a short description of each storage type. What types of storage does Java support?
 
3. What is the difference between a "method" and a "function"? List the fundamental parts of a method.

4. What identifies a Java method? 
 
5. There is the "signature of the method" term. What does it mean?

6. What are the situations where you would use the "static" keyword?

7. What will be the output of the Java program below? Explain why?

```java
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
```

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