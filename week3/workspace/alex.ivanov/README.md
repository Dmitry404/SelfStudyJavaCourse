1. The initialization order will be next:
 - static field
 - static block
 - super class constructor
 - non static block
 - inherit class constructor

 Prove in Week3_1.java

2. The initialization order will be next:
 - static field of class A
 - static block of class A
 - out from main: "Hello World"
 - static field of class B
 - static block of class B
 - default constructor of class B
 - parametrized constructor of class A
 - printVariable from class B
 - out from default constructor of class B

 if you remove no-argument constructor from class A, you get error that there is no default constructor in class A. Because when you call default constructor from class B, it first called default constructor from based class.To fix need to add call of parametrized constructor of class A to parametrized constructor of class B.

3. Few ways below:
 - int a[] = {1,2};
 - int b[] = a;
 - int a[] = new int[2];
 - int a[] = new int[]{1,2};
 - int a[] = new int[2]; a = new int[]{1,2};
 - int a[] = new int[2]; for(int i = 0; i < a.length; i++){e[i] = i*10;}
 - int a[] = new int[2]; a[0] = 1;a[1] = 2;

4. public class C {
    private static Entry entry = new Entry();

    public static void main(String... args) {
        Entry[] entryArray = new Entry[10];
        for (int i = 0; i < 10; i++) {
            Entry entry1 = new Entry();
            entry1.value = "str_" + i;
            entryArray[i] = entry1;
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
 
5. There is no method of destroy objects like in C++, once object becomes unused, it becomes eligible for Garbage collection or GC. if its not reachable from any live threads or any static references in other words you can say that an object becomes eligible for garbage collection if its all references are null

6. In general it's best not to rely on finalize() to do any cleaning up.According to the Javadoc (which it would be worth reading), it is: Called by the garbage collector on an object when garbage collection determines that there are no more references to the object. If you rely on finalize for the correct operation of your application, then you're doing something wrong. finalize should only be used for cleanup of (usually non-Java) resources. And that's exactly because the JVM doesn't guarantee that finalize is ever called on any object.

7. It frees memory allocated to objects that are not being used by the program any more - hence the name "garbage".

8. It usually runs when you app runs out of memory. AFAIK it holds a graph that represents the links between the objects and isolated objects can be freed.

9. A Just-In-Time (JIT) compiler is a feature of the run-time interpreter, that instead of interpreting bytecode every time a method is invoked, will compile the bytecode into the machine code instructions of the running machine, and then invoke this object code instead. Ideally the efficiency of running object code will overcome the inefficiency of recompiling the program every time it runs.