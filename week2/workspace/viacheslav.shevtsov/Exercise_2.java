
import static java.lang.Math.*;

public class Exercise_2 {
    public static void main(String[] args) {

        // Static Filed and static method
        System.out.println("We don't have any object of class, but we have access to the static field");
        System.out.println("CommonId = " + StaticFieldAndMethod.CommonId);
        System.out.println();
        System.out.println("Also we can use static method");
        StaticFieldAndMethod.ShowCommonId();
        StaticFieldAndMethod StaticField1 = new StaticFieldAndMethod();
        StaticFieldAndMethod StaticField2 = new StaticFieldAndMethod();
        System.out.println();

        System.out.println("All instances of class has the same value for static variable");
        StaticField1.ShowCommonId();
        StaticField2.ShowCommonId();
        StaticFieldAndMethod.ShowCommonId();
        System.out.println();

        // Use the static import.
        System.out.println("cos(PI/3) = "+ cos(PI/3.0));
        System.out.println();

        //nested static class
        System.out.println("Nested static class doesn't need instantiation of the outer class");
        OuterClass.StaticNestedClass staticClass = new OuterClass.StaticNestedClass();
        staticClass.print();
        System.out.println();

        // static initializer
        ClassWithStaticInitializer initializer1 = new ClassWithStaticInitializer();
        initializer1.printStaticInt();
        initializer1.setStaticInt(-10);
        ClassWithStaticInitializer initializer2 = new ClassWithStaticInitializer();
        initializer1.printStaticInt();
        initializer2.printStaticInt();
        ClassWithStaticInitializer.printStaticInt();
    }
}

class StaticFieldAndMethod {
    static int CommonId = 0;

    StaticFieldAndMethod(){
        CommonId+=1;
    }
    static void ShowCommonId(){
        System.out.println("Static method. CommonId = " + CommonId );
    }

}

class OuterClass {
    String outerField = "The field of outer class";
    static String staticOuterField = "static value for  outer class";
    static class StaticNestedClass {
        public void print(){
            System.out.println("Method of nested static class has access to static fields and methods of outer class");
            System.out.println("Example. Value = " + staticOuterField);
        }
    }
}


class ClassWithStaticInitializer {
    static int staticInt;
    static {
        System.out.println("The static initializer is executed only once before the first object will be created");
        staticInt = 10;
    }
    ClassWithStaticInitializer(){
        System.out.println("Create a new object ClassWithStaticInitializer");
    }

    public void setStaticInt(int i){
        staticInt = i;
    }

    public static void printStaticInt(){
        System.out.println("staticInt = " + staticInt);
    }
}

