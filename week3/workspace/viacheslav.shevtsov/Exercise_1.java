class FieldInitializer{
    static String FieldInitializer(String message){
        System.out.println(message);
        return message;
    }
}
class ParentClass {
    ParentClass(){
        System.out.println("This is a object of ParentClass");
    }
}

class HeritorClass extends ParentClass {
    private String nonStaticString = FieldInitializer.FieldInitializer("Init nonStaticString for HeritorClass");
    private static String  StaticString = FieldInitializer.FieldInitializer("Init StaticString for HeritorClass");
    {
        System.out.println("Non-static initialization block in HeritorClass");
    }
    static {
        System.out.println("Static initialization block in HeritorClass");
    }
    HeritorClass(){
        System.out.println("This is a object of HeritorClass");
    }

}
public class Exercise_1 {
    public static void main(String[] args) {
    HeritorClass heritor = new HeritorClass();
    }
}
