
public class Exercise_1 {
    public static void main(String[] args) {
        //System.out.println("It works!!");
        ClassWithInstanceVariables instance = new ClassWithInstanceVariables();
        instance.ShowDefaultValues();

        // Compilation error. Variables was not initialized.
        // Local variable are not initialized with default values like a class fields.
        // All local variables should be initialized before they will be used.
        ClassWithUninitializedLocalVariables UninitializedLocalVariable = new ClassWithUninitializedLocalVariables();
        UninitializedLocalVariable.ShowDefaultValues();
        System.out.println();

        ClassWithInitializedLocalVariables initializedLocalVariable = new ClassWithInitializedLocalVariables();
        initializedLocalVariable.ShowNonDefaultValues();
    }
}

class ClassWithInstanceVariables{
    private boolean aBoolean;
    private byte aByte;
    private long aLong;
    private double aDouble;
    private String aString;
    public  void ShowDefaultValues(){
        System.out.println("Default value for boolean variables: "+aBoolean);
        System.out.println("Default value for byte variables: "+aByte);
        System.out.println("Default value for long variables: "+aLong);
        System.out.println("Default value for double variables: "+aDouble);
        System.out.println("Default value for any object: "+aString);
    }
}

class ClassWithUninitializedLocalVariables{
    public  void ShowDefaultValues(){
        /*
        boolean aBoolean;
        byte aByte;
        long aLong;
        double aDouble;
        String aString;

        System.out.println("Default value for boolean local variables: "+aBoolean);
        System.out.println("Default value for byte local variables: "+aByte);
        System.out.println("Default value for long local variables: "+aLong);
        System.out.println("Default value for double local variables: "+aDouble);
        System.out.println("Default value for any local object: "+aString);
        */
    }
}

class ClassWithInitializedLocalVariables{
    public  void ShowNonDefaultValues(){
        boolean aBoolean = true;
        byte aByte = 1;
        long aLong = 1;
        double aDouble = 100.0d ;
        String aString = "Some string value";

        System.out.println("Initialized local variable aBoolean = "+aBoolean);
        System.out.println("Initialized local variable aByte = "+aByte);
        System.out.println("Initialized local variable aLong = "+aLong);
        System.out.println("Initialized local variable aDouble = "+aDouble);
        System.out.println("Initialized local variable aString = "+aString);
     }
}