

class First{

    First(){
        System.out.println("Class First constructor");
    }

}

class Second extends First{
    String s = "";
    static String ss = "";

    Second(){
        System.out.println("Class Second constructor");
    };

    {
        System.out.println("non static initialization block");
    }

    static {
        System.out.println("static initialization block");
    }
}





public class Week3_1{

    public static void main(String[] args){
        B b = new B();
    }
}