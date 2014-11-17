class Check {
    static int i = 11;

    static public int Get(){
        return i;
    }

}

public class Exercise22 {
    public static void main(String[] args) {
        Check ch1 = new Check();
        Check ch2 = new Check();

        System.out.format("Static usage: %s, %s\n", ch1.Get(), ch2.Get());
    }
}