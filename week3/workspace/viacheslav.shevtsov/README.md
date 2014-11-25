1. *Let's assume that we created a class which has a field, a static field, both static and non-static initialization blocks and a constructor without parameters. In addition, the class inherits another class which also has a parameterless constructor.* 
*What will be the initialization order of these two classes? Create these classes in order to prove your answer.*

- static filed
- Static initialization block
- Constructor of the super class
- Non-Static initialization block
- Constructor of the inherited class

*Note:* Please see prove in the Exercise_1.java.
 
2. Look at the code block below. What will be the output if we run the main method of the class `A`? 
What will happen if we remove the no-argument constructor of the `A` class? If there is an error, explain why it happens and suggest the way how to fix it.

```java
public class A {
    private String variable_D;

    public static String static_var = "Hello static variable";

    static {
        System.out.println("Hello from static block A");
        System.out.println("Hello static variable = " + static_var);
    }

    public A() {
        System.out.println("Hello from constructor A");
        printVariable();
    }

    public A(String variable) {
        System.out.println("Hello from constructor A");
        printVariable();
    }

    protected void printVariable() {
        variable_D = "variable is initialized in Main Class";
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        B b = new B();
    }
}

public class B extends A {
    private String variable;

    public static String static_var = "Hello static variable";

    static {
        System.out.println("Hello from static block B");
        System.out.println("Hello static variable = " + static_var);
    }

    public B() {
        super(static_var);
        System.out.println("variable value = " + variable);
    }

    public B(String variable) {
        System.out.println("variable value = " + this.variable);
    }

    protected void printVariable() {
        variable = "variable is initialized in B Class";
    }
}
```

3. List here as many ways to create and initialize an array of two integers as you know.
 
4. Look at the class below, probably there is a mistake that the author made. If you think so, change the class in order to 
 do that the author intended to do.

```java
public class C {
    private static Entry entry = new Entry();

    public static void main(String... args) {
        Entry[] entryArray = new Entry[10];
        for (int i = 0; i < 10; i++) {
            entry.value = "str_" + i;
            entryArray[i] = entry;
        }

        printArray(entryArray);
    }

    private static void printArray(Entry[] entryArr) {
        for (Entry entry : entryArr) {
            System.out.println(entry);
        }
    }

    static class Entry {
        public String toString() {
            return "Entry{" +
                    "value='" + value + '\'' +
                    '}';
        }

        private String value;
    }
}
```

5. Explain how to destroy objects in Java.

6. Can you rely on the `finalize` method? Are there any best practices to use `finalize` in your programs?
  
7. What is the main purpose of the Garbage Collector in Java? 
 
8. Read the "how a garbage collector works" chapter twice and try to explain how the GC works in Java.
 
9. Probably you've heard of the JIT term before. Explain what does this term stand for?

Good luck

