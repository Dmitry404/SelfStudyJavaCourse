import java.math.BigInteger;

public class Exercise_3 {
    public static void main(String[] args) {

        System.out.println("The variable declaration");
        BigInteger demo;

        System.out.println("The variable initialization.");
        demo = new BigInteger(String.valueOf(10));
        System.out.println("The variable demo = "+demo);

        System.out.println("Do garbage collector");  // I wanted to demonstrate that GC  has to delete useless object from memory.
                                                     // But we don't have any guaranty that gc will be executed at this moment.
                                                     // Calling System.gc() is a bad practice.
                                                     // Usually JVM do gc in background mode automatically
        System.gc();

        System.out.println("The object should be deleted by garbage collector");

    }
}