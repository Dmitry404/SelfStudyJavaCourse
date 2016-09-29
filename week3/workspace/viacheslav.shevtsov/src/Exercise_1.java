
class FieldInitializer{
    static String FieldInitializer(String message){
        System.out.println(message);
        return message;
    }
}

class ParentClass {
    ParentClass(){
        System.out.println("This is a constructor of ParentClass");
    }
}

class HeritorClass extends ParentClass {
    private String nonStaticString = FieldInitializer.FieldInitializer("Init a field nonStaticString for HeritorClass");
    private static String  StaticString = FieldInitializer.FieldInitializer("Init a field StaticString for HeritorClass");
    {
        System.out.println("Non-static initialization block in HeritorClass");
    }
    static {
        System.out.println("Static initialization block in HeritorClass");
    }
    HeritorClass(){
        System.out.println("This is a constructor of HeritorClass");
    }

}
public class Exercise_1 {
    public static void main(String[] args) {
    HeritorClass heritor = new HeritorClass();
    }
}
/*
Output:

Init a field StaticString for HeritorClass
Static initialization block in HeritorClass
This is a constructor of ParentClass
Init a field nonStaticString for HeritorClass
Non-static initialization block in HeritorClass
This is a constructor of HeritorClass

 */
